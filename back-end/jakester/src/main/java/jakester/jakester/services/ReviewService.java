package jakester.jakester.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.validation.OverridesAttribute.List;
import jakester.jakester.auth.entity.User;
import jakester.jakester.entities.Review;
import jakester.jakester.repositories.ReviewRepository;

@Service
public class ReviewService {
    
    @Autowired ReviewRepository reviewRepository;

    @Autowired UserService userService;

    @Autowired GameService gameService;

    public Review saveReview(Review review, Long idUser, Long idGame) {
        User user = userService.findUserById(idUser);
        if (user == null) {
            throw new RuntimeException("User not found");
        }
        Review existingReview = reviewRepository.findByGameAndUserId(gameService.getGameById(idGame), idUser);
        if (existingReview != null && !existingReview.getId().equals(review.getId())) {
            throw new RuntimeException("User already has a different review for this game");
        } else {
            review.setUser(user);
            review.setGame(gameService.getGameById(idGame));
            return reviewRepository.save(review);
        }
    }
    
    public ArrayList<Review> getAllReviews(){
        return (ArrayList<Review>) reviewRepository.findAll();
    }

    public void deleteReview(Review review){
        reviewRepository.delete(review);
    }

    public void deleteById(Long id){
        reviewRepository.deleteById(id);
    }

    public Review getReviewById(Long id){
        return reviewRepository.findById(id).get();
    }

    public ArrayList<Review> getReviewsByGame(Long gameId){
        return reviewRepository.findByGame(gameId);
    }

    public ArrayList<Review> getReviewsByUser(String user){
        return reviewRepository.findByUser(user);
    }


    
}
