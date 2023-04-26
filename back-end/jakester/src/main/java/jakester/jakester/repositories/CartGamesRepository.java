package jakester.jakester.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import jakester.jakester.entities.Cart;
import jakester.jakester.entities.CartGames;
import jakester.jakester.entities.Game;

public interface CartGamesRepository extends JpaRepository<CartGames, Long> {
    
  @Query ("SELECT c FROM CartGames c WHERE c.cart.id = :id")
  List<CartGames> findCartGamesById(Long id);

  List<CartGames> findByCartAndGame(Cart cart, Game game);

  Optional<CartGames> findById(Long id);

  void deleteById(Long id);

}
