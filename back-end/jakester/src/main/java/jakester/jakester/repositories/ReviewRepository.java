package jakester.jakester.repositories;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jakarta.validation.OverridesAttribute.List;
import jakester.jakester.entities.Review;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Long>{
    
     ArrayList<Review> findByGame(Long GameId);
     ArrayList<Review> findByUser(String user);
     void deleteById(Long id);
     boolean existsByUserId(Long id);
     Review findByUserId(Long id);
    
}
