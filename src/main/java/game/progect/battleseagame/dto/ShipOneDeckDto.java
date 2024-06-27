package game.progect.battleseagame.dto;

import game.progect.battleseagame.model.ShipOneDeck;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ShipOneDeckDto {
    private UUID id;
    private String shipName;
    private String coordinate;


    public static ShipOneDeckDto from(ShipOneDeck shipOneDeck) {
        return ShipOneDeckDto.builder()
                .id(shipOneDeck.getId())
                .shipName(shipOneDeck.getShipName())
                .coordinate(shipOneDeck.getCoordinate())
                .build();
    }

}
