package game.progect.battleseagame.repositories;

import game.progect.battleseagame.model.ShipOneDeck;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ShipOneDeckRepository extends JpaRepository<ShipOneDeck, UUID> {

}
