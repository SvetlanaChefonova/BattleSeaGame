package game.progect.battleseagame.services;

import game.progect.battleseagame.dto.ShipOneDeckDto;
import game.progect.battleseagame.model.ShipOneDeck;
import game.progect.battleseagame.repositories.PlayerRepository;
import game.progect.battleseagame.repositories.ShipOneDeckRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ShipOneDeckServicesImpl implements ShipOneDeckServices{

    private final ShipOneDeckRepository shipOneDeckRepository;

    @Override
    public ShipOneDeckDto addShipOneDeck(ShipOneDeckDto shipOneDeck) {
        ShipOneDeck newShipOneDeck = shipOneDeckRepository.save(
                ShipOneDeck.builder()
                        .shipName(shipOneDeck.getShipName())
                        .coordinate(shipOneDeck.getCoordinate())
                        .build());

        return ShipOneDeckDto.from(newShipOneDeck);
    }

    public static ShipOneDeckDto from(ShipOneDeck shipOneDeck) {
        return ShipOneDeckDto.builder()
                .id(shipOneDeck.getId())
                .shipName(shipOneDeck.getShipName())
                .coordinate(shipOneDeck.getCoordinate())
                .build();
    }


}

