package jakester.jakester.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakester.jakester.entities.CartGames;
import jakester.jakester.repositories.CartGamesRepository;

@Service
public class CartGamesService {
    
    @Autowired CartGamesRepository cartGamesRepository;


    public List<CartGames> findByCartId(Long idCart) {
        return cartGamesRepository.findCartGamesById(idCart);
    }

}
