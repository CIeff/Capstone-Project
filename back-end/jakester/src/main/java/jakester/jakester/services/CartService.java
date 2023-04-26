package jakester.jakester.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import jakester.jakester.auth.entity.User;
import jakester.jakester.entities.Cart;
import jakester.jakester.entities.CartGames;
import jakester.jakester.entities.Game;
import jakester.jakester.repositories.CartGamesRepository;
import jakester.jakester.repositories.CartRepository;

@Service
public class CartService {
    
    @Autowired CartRepository cartRepository;
    @Autowired UserService userService;
    @Autowired GameService gameService;

    @Autowired CartGamesRepository cartGamesRepository;
 
    public void saveCart(Long idCart,String username) {
        if(!findCartById(idCart).isPresent()){
            Cart cart= new Cart();
            cart.setId(idCart);
            System.out.println(cart);
            User user = userService.findUserByUsername(username);
            cart.setUser(user);
            System.out.println(user);
            cartRepository.save(cart);
        } else {
            System.out.println("Cart already exists");
        }

    }

    public Optional<Cart> findCartById(Long idCart) {
        System.out.println(cartRepository.findById(idCart));
        return cartRepository.findById(idCart);
    }

    public List<Game> getAllGamesCart(Cart cart) {
        return cartRepository.findAllGamesCart(cart.getId());
    }
    
    public List<Game> getAllGamesCartV2(Long idCart) {
        Cart cart=cartRepository.findCartById(idCart);
        return cartRepository.findAllGamesCart(cart.getId());
    }
    

    public void deleteFromCart(Long id) {
        cartRepository.deleteById(id);
    }

    public void deleteFromFav(Long id) {
        cartRepository.deleteById(id);
    }

    public void deleteFromBought(Long id) {
        cartRepository.deleteById(id);
    }
    
    public void addToCart(Game game) {
        cartRepository.save(game);
    }

    public void addToBoughtList(Long cartId, Long idGame) {
        Cart cart = cartRepository.findById(cartId).orElse(null);
        if (cart != null && idGame != null) {
            List<Game> boughtGames = cart.getGamesBought();
            Game game= gameService.getGameById(idGame);
            boughtGames.add(game);
            cart.setGamesBought(boughtGames);
            cartRepository.save(cart);
        }
    }

    public void addToFavList(Long cartId, Long gameId) {
        Cart cart = cartRepository.findById(cartId).orElse(null);
        if (cart != null && gameId != null) {
            List<Game> favGames = cart.getGamesFav();
            Game game= gameService.getGameById(gameId);
            if (!favGames.contains(game)) {
                favGames.add(game);
            }else{
                favGames.remove(game);
            }
            cart.setGamesFav(favGames);
            cartRepository.save(cart);
        }
    }

    public List<Game> getAllGamesFav(Long idCart) {
        Cart cart=cartRepository.findCartById(idCart);
        List<Game> favGames=cart.getGamesFav();
        return favGames;
    }

    public Long findCartIdByUserId(Long id) {
        Cart cart=cartRepository.findCartByUserId(id);
        return cart.getId();
    }

    public Cart getCartFromUserId(Long id) {
        Cart cart=cartRepository.findCartByUserId(id);
        return cart;
    }

    public List<Game> getAllGamesBought(Long idCart) {
        List<Game> boughtGames= cartRepository.findGamesBoughtByCartId(idCart);
        return boughtGames;
    }

    public void addToCartV2(Long cartId, Long gameId) {
        Cart cart = cartRepository.findById(cartId).orElse(null);
        Game game = gameService.getGameById(gameId);
        if (cart != null && game != null) {
            List<CartGames> cartGames = cartGamesRepository.findByCartAndGame(cart,game);
            if (cartGames.isEmpty()) {
                CartGames cartGame = new CartGames();
                cartGame.setCart(cart);
                cartGame.setGame(game);
                cartGame.setQuantity(1);
                cartGamesRepository.save(cartGame);
            } else {
                for (CartGames cartGame : cartGames) {
                    int quantity = cartGame.getQuantity();
                    cartGame.setQuantity(quantity + 1);
                    cartGamesRepository.save(cartGame);
                }
            }
        }
    }

     
    public void removeFromCart(Long cartId, Long gameId) {
        Cart cart = cartRepository.findById(cartId).orElse(null);
        Game game = gameService.getGameById(gameId);
        if (cart != null && game != null) {
            List<CartGames> cartGames = cartGamesRepository.findByCartAndGame(cart, game);
            if (!cartGames.isEmpty()) {
                for (CartGames cartGame : cartGames) {
                    cartGamesRepository.deleteById(cartGame.getId());
                }
            }
        }
    }

    public void reduceNumber(Long cartId, Long gameId) {
        Cart cart = cartRepository.findById(cartId).orElse(null);
        Game game = gameService.getGameById(gameId);
        if (cart != null && game != null) {
            List<CartGames> cartGames = cartGamesRepository.findByCartAndGame(cart, game);
            if (!cartGames.isEmpty()) {
                for (CartGames cartGame : cartGames) {
                    int quantity = cartGame.getQuantity();
                    if (quantity > 1) {
                        cartGame.setQuantity(quantity - 1);
                        cartGamesRepository.save(cartGame);
                    } else {
                        cartGamesRepository.deleteById(cartGame.getId());
                    }
                }
            }
        }
    }


   

    /* 
    public void removeFromFavorites(Long cartId, Game game){
        Cart cart = cartRepository.findById(cartId).orElse(null);
        if (cart != null) {
            List<Game> favGames = cart.getGamesFav();
            favGames.remove(game);
            cart.setGamesFav(favGames);
            cartRepository.save(cart);
        }
    }
    */ 
    
}
