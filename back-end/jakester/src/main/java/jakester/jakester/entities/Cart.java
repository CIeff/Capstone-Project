package jakester.jakester.entities;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakester.jakester.auth.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cart {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JsonBackReference
    private User user;

    @OneToMany(mappedBy = "cart")
    @JsonIgnore
    private List<CartGames> cartGames = new ArrayList<>();
    
    @ManyToMany
    @JoinTable(name = "favGames",
               joinColumns = @JoinColumn(name = "cartId"),
               inverseJoinColumns = @JoinColumn(name = "gameId"))
    private List<Game> gamesFav = new ArrayList<>();

    @ManyToMany
    @JoinTable(name = "boughtGames",
               joinColumns = @JoinColumn(name = "cartId"),
               inverseJoinColumns = @JoinColumn(name = "gameId"))
    public List<Game> gamesBought = new ArrayList<>();



    private double totalPriceCart;
    private double totalPriceSaved;
    private double totalPriceHistory;
    private int totalQuantityCart;
    
    @JsonBackReference
    public User getUser() {
        return this.user;
    }

    @JsonIgnore
    public List<Game> getGamesBought(User user, Cart cart){
        return cart.gamesBought;
    }  

}
