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
@Table(name = "ship_two_deck")

public class ShipTwoDeck {

    @Id
    @GeneratedValue(generator = "uuid", strategy = GenerationType.IDENTITY)
    @GenericGenerator(name = "uuid", strategy = "org.hibernate.id.UUIDGenerator")
    private UUID id;

    @Column(name = "ship_name")
    private String shipName;

  //  @Column(name = "number_of_decks")
  //  private Integer numderOfDecks;

    @Column(name = "orientation")
    private String orientation;

    @Column(name = "coordinate")
    private String coordinate;

  /*  @Column(name = "status_first_deck")
    private Boolean statusFirstDeck;

    @Column(name = "status_second_deck")
    private Boolean statusSecondDeck;*/

  //  @Column(name = "status_ship_two_deck")
 //   private String statusShipTwoDeck;

   // @OneToMany(mappedBy = "shipTwoDeck", cascade = {CascadeType.REMOVE})
   // private List<Player> players;

}
