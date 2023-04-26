package jakester.jakester.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakester.jakester.entities.CartGames;
import jakester.jakester.services.CartGamesService;

@RestController
@RequestMapping("/api/cartgames")
public class CartGamesController {
    
    @Autowired CartGamesService cartGamesService;

    @GetMapping("/{idCart}")
    public List<CartGames> getCartGames(@PathVariable Long idCart) {
        return  cartGamesService.findByCartId(idCart);
    }

}
