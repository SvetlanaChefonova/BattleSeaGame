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
@Table(name = "player")

public class Player {

    @Id
    @GeneratedValue(generator = "uuid", strategy = GenerationType.IDENTITY)
    @GenericGenerator(name = "uuid", strategy = "org.hibernate.id.UUIDGenerator")
    private UUID id;

    @Column(name = "player_nick_name")
    private String playerNickName;

    @ManyToOne
    @JoinColumn(name = "ship_one_deck_id", nullable = false)
    private ShipOneDeck shipOneDeck;

    @ManyToOne
    @JoinColumn(name = "ship_two_deck_id", nullable = false)
    private ShipTwoDeck shipTwoDeck;

    @ManyToOne
    @JoinColumn(name = "ship_three_deck_id", nullable = false)
    private ShipThreeDeck shipThreeDeck;

    @ManyToOne
    @JoinColumn(name = "ship_four_deck_id", nullable = false)
    private ShipFourDeck shipFourDeck;

   // @OneToMany(mappedBy = "player", cascade = {CascadeType.REMOVE})
    //private List<Game> games;


}
