package jakester.jakester.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakester.jakester.entities.Game;
import jakester.jakester.entities.Genre;
import jakester.jakester.services.GameService;

@RestController
@RequestMapping("/api/games")
public class GameController {
    
    private  GameService gameService;

    public GameController(GameService gameService) {
        this.gameService = gameService;
    }

    @GetMapping("/all")
    public List<Game> getAllGames(){
        return gameService.getAllGames();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Game> getGameById(@PathVariable Long id){
        Game game = gameService.getGameById(id);
        return ResponseEntity.ok().body(game);
    }

    @GetMapping("/search/{title}")
    public ResponseEntity<Optional<Game>> getGameByTitle(@PathVariable String title){
        Optional<Game> game=gameService.getGameByTitle(title);
        return ResponseEntity.ok().body(game);
    }

    @GetMapping("/genres")
    public Genre[] getGameByGenre(){
        return Genre.values();
    }


}
