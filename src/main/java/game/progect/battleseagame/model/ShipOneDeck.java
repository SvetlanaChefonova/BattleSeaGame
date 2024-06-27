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
@Table(name = "ship_one_deck")

public class ShipOneDeck {

    @Id
    @GeneratedValue(generator = "uuid", strategy = GenerationType.IDENTITY)
    @GenericGenerator(name = "uuid", strategy = "org.hibernate.id.UUIDGenerator")
    private UUID id;

    @Column(name = "ship_name")
    private String shipName;

    @Column(name = "coordinate")
    private String coordinate;

   // @Column(name = "status_ship_one_deck")
   // private String statusShipOneDeck;

  //  @OneToMany(mappedBy = "shipOneDeck", cascade = {CascadeType.REMOVE})
   // private List<Player> players;


}
