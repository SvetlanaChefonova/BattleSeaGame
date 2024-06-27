package game.progect.battleseagame.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import java.util.List;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity
@Table(name = "ship_four_deck")

public class ShipFourDeck {

    @Id
    @GeneratedValue(generator = "uuid", strategy = GenerationType.IDENTITY)
    @GenericGenerator(name = "uuid", strategy = "org.hibernate.id.UUIDGenerator")
    private UUID id;

    @Column(name = "ship_name")
    private String shipName;

    //@Column(name = "number_of_decks")
    //private Integer numderOfDecks;

    @Column(name = "orientation")
    private String orientation;

    @Column(name = "coordinate")
    private String coordinate;

   /* @Column(name = "status_first_deck")
    private Boolean statusFirstDeck;

    @Column(name = "status_second_deck")
    private Boolean statusSecondDeck;

    @Column(name = "status_third_deck")
    private Boolean statusThirdDeck;

    @Column(name = "status_fourth_deck")
    private Boolean statusFourthDeck;

    @Column(name = "status_ship_four_deck")
    private String statusShipFourDeck;*/

   // @OneToMany(mappedBy = "shipFourDeck", cascade = {CascadeType.REMOVE})
    //private List<Player> players;


}
