package jakester.jakester.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jakester.jakester.entities.Game;

@Repository
public interface GameRepository  extends JpaRepository<Game, Long>{

    
    Optional <Game> findByTitle(String title);
 
    Optional <Game> findByGenres(String[] genres);

    Optional <Game> findByRating(String rating);

    //Optional <Game> findByReleaseDate(String releaseYear);

    Optional <Game> findByDeveloper(String developer);

    Optional <Game> findByPublisher(String publisher);

   // Optional <Game> findByDiscountPrice(String price);

   boolean existsByTitle(String title);

   
    
}
