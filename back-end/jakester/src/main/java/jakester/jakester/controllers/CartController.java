package jakester.jakester.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import jakester.jakester.entities.Cart;
import jakester.jakester.entities.Game;
import jakester.jakester.services.CartService;
import jakester.jakester.services.GameService;

@RestController
@RequestMapping("/api/cart")
public class CartController {
    
    @Autowired CartService cartService;
    @Autowired GameService gameService;

    @GetMapping("/all")
    public List<Game> getAllGames(Cart cart){
        return cartService.getAllGamesCart(cart);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteFromCart(@PathVariable Long id) {
        cartService.deleteFromCart(id);
    }

    @PostMapping("/favorites/add/{idCart}/{gameId}")
    public Game addToFavList(@PathVariable Long idCart, @PathVariable Long gameId) {
        Game game= gameService.getGameById(gameId);
        cartService.addToFavList(idCart, gameId);
        return game;
    }

    /* 
    @DeleteMapping("/favorites/delete/{id}")
    public void deleteFromFavList(@PathVariable Long id) {
        Game game= gameService.getGameById(id);
        cartService.removeFromFavorites(id, game);
    }
    */

    @GetMapping("/favorites/{idCart}")
    public List<Game> getAllFavorites(@PathVariable Long idCart){
        List<Game> favGames= cartService.getAllGamesFav(idCart);
        return favGames;
    }

    @PostMapping("/saveCart")
    public void saveCart(Long idCart, String username) {
        cartService.saveCart(idCart,username);
    } 

    @GetMapping("/{idUser}")
    public Long getCartId(@PathVariable Long idUser){
        Long cartId= cartService.findCartIdByUserId(idUser);
        return cartId;
    }

    @GetMapping("/find/{idUser}")
    public Cart getCartFromUserId(@PathVariable Long idUser){
        Cart cart= cartService.getCartFromUserId(idUser);
        return cart;
    }

    @GetMapping("/{idCart}/bought")
    public List<Game> getAllBought(@PathVariable Long idCart){
        List<Game> boughtGames= cartService.getAllGamesBought(idCart);
        return boughtGames;
    }

    @PostMapping("/{idCart}/bought/add/{gameId}")
    public Game addToBought(@PathVariable Long idCart, @PathVariable Long gameId) {
        Game game= gameService.getGameById(gameId);
        cartService.addToBoughtList(idCart, gameId);
        return game;
    }
    

    @PostMapping("/add/{idCart}/{gameId}")
    public Game addToCart(@PathVariable Long idCart, @PathVariable Long gameId) {
        Game game= gameService.getGameById(gameId);
        cartService.addToCartV2(idCart, gameId);
        return game;
    }

    @GetMapping("{idCart}/all")
    public List<Game> getAllGamesCart(@PathVariable Long idCart){
        List<Game> games= cartService.getAllGamesCartV2(idCart);
        return games;
    }
 
    @PostMapping("/delete/{idCart}/{gameId}")
    public void deleteFromCart(@PathVariable Long idCart, @PathVariable Long gameId) {
        cartService.removeFromCart(idCart, gameId);
    }

    @PostMapping("/reduce/{idCart}/{gameId}")
    public void reduceFromCart(@PathVariable Long idCart, @PathVariable Long gameId) {
        cartService.reduceNumber(idCart, gameId);
    }



}
