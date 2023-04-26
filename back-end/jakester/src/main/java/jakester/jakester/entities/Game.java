package jakester.jakester.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Game {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String poster_path;
    private String background_img;
    private String title_img;
    @Column(columnDefinition = "TEXT")
    private String video_path;
    private String full_price;
    private String discount_price;
    private String percentage_discount;
    private double rating;
    private int rating_count;
    @Column(columnDefinition = "TEXT")
    private String description;
    private LocalDate release_date;
    private String developer;
    private String publisher;
    @Enumerated(EnumType.STRING)
    private Genre[] genres;
    @Column(columnDefinition = "TEXT")
    private String video_trailer;
    private String[] screenshots;
    @Column(columnDefinition = "TEXT")
    private String about_the_game;
    private String[] system_requirements;
    private boolean showVideo= false;
    @Column(columnDefinition = "TEXT")
    private String platform;
    private boolean isOnStock;
    private int quantity;
    @Column(columnDefinition = "TEXT")
    private String format;
    @Column(columnDefinition = "TEXT")
    private String vertical_poster;

    
    @OneToMany(mappedBy = "game")  
    @JsonIgnore
    private List<CartGames> cartGames = new ArrayList<>();
    
}
