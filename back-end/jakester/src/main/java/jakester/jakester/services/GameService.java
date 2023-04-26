package jakester.jakester.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakester.jakester.entities.Game;
import jakester.jakester.repositories.GameRepository;

@Service
public class GameService {

    @Autowired GameRepository gameRepository;
    
    public void saveGame(Game game) {
        if(!gameRepository.existsByTitle(game.getTitle())){
            gameRepository.save(game);   
        }else{
            System.out.println("Game already exists "+"-- "+ game.getTitle().toUpperCase());
        }
             
    }

    public void deleteGame(Game game){
        gameRepository.delete(game);
    }

    public List<Game> getAllGames(){
        return gameRepository.findAll();
    }

    public Game getGameById(Long id){
        return gameRepository.findById(id).get();
    }

    public Optional<Game> getGameByTitle(String title){
        return gameRepository.findByTitle(title);
    }
 
    public Optional<Game> getGameByGenres(String[] genres){
        return gameRepository.findByGenres(genres);
    }

    public Optional<Game> getGameByRating(String rating){
        return gameRepository.findByRating(rating);
    }

    //public Optional<Game> getGameByReleaseDate(String ReleaseDate){
       // return gameRepository.findByReleaseDate(ReleaseDate);
    //}

    public Optional<Game> getGameByDeveloper(String developer){
        return gameRepository.findByDeveloper(developer);
    }

    public Optional<Game> getGameByPublisher(String publisher){
        return gameRepository.findByPublisher(publisher);
    }

    //public Optional<Game> getGameByDiscountPrice(String price){
        //return gameRepository.findByDiscountPrice(price);
    //}

    public boolean isOnStock(Game game){
        if(game.getQuantity() > 0){
            return true;
        }else{
            return false;
        }
    }

}
    


