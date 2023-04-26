package jakester.jakester.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import jakester.jakester.entities.Cart;
import jakester.jakester.entities.Game;

@Repository
public interface CartRepository extends JpaRepository<Cart, Long>{
     
     void deleteById(Long id);

     void save(Game game);

     @Query("SELECT g FROM Game g WHERE g.id IN (SELECT cg.game.id FROM CartGames cg WHERE cg.cart.id = :cartId)")
     List<Game> findAllGamesCart(@Param("cartId")Long id);
     
     Optional<Cart> findById(Long id);

     @Query("SELECT c FROM Cart c WHERE c.id = :id")
     Cart findCartById(@Param("id") Long id);

     @Query("SELECT c FROM Cart c WHERE c.user.id = :id")
     Cart findCartByUserId(@Param("id") Long id);

     @Query("SELECT g FROM Cart c JOIN c.gamesBought g WHERE c.id = :cartId")
    List<Game> findGamesBoughtByCartId(@Param("cartId") Long cartId);

}
     



