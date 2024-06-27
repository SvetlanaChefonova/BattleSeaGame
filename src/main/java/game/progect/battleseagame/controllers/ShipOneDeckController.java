package game.progect.battleseagame.controllers;

import game.progect.battleseagame.dto.ShipOneDeckDto;
import game.progect.battleseagame.services.ShipOneDeckServices;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequiredArgsConstructor
@RequestMapping("/putShip")
public class ShipOneDeckController {

    private final ShipOneDeckServices shipOneDeckServices;

    @PostMapping("/oneDeck")
    @ResponseBody
    public ResponseEntity<ShipOneDeckDto> addShipOneDeckByParams(
                                                          @Valid @RequestParam(name="shipName") String shipName,
                                                          @Valid @RequestParam(name="coordinate") String coordinate


    ) {
        ShipOneDeckDto shipOneDeckDto = new ShipOneDeckDto();
        shipOneDeckDto.setShipName(shipName);
        shipOneDeckDto.setCoordinate(coordinate);




        return  ResponseEntity
                .status(HttpStatus.CREATED)
                .body(shipOneDeckServices.addShipOneDeck(shipOneDeckDto));
    }
}
