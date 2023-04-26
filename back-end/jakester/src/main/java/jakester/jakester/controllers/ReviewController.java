package jakester.jakester.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakester.jakester.entities.Review;
import jakester.jakester.services.GameService;
import jakester.jakester.services.ReviewService;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
@RequestMapping("/api/reviews")
public class ReviewController {
    
    private ReviewService reviewService;
    //private GameService gameService;

    public ReviewController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }

    @GetMapping("/all")
    public ArrayList<Review> getAllReviews(){
        return reviewService.getAllReviews();
    }

    @PostMapping(value="/{idUser}/add",consumes="application/json")
    public ResponseEntity<Review> saveReview(@PathVariable Long idUser, @RequestBody Review review) {
        Review savedReview = reviewService.saveReview(review, idUser);
        return new ResponseEntity<>(savedReview, HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{reviewId}")
    public void deleteReview(@PathVariable Long reviewId) {
        reviewService.deleteById(reviewId);
    }

    @GetMapping("/games/{gameid}")
    public ResponseEntity<ArrayList<Review>> getReviewsByGame(@PathVariable Long gameId){
        ArrayList<Review> reviews = reviewService.getReviewsByGame(gameId);
        return ResponseEntity.ok().body(reviews);
    }



    // @GetMapping("/{id}")   

    // @GetMapping("/users/{userid}")



    




}
