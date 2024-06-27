package game.progect.battleseagame.controllers;

import game.progect.battleseagame.dto.GameDto;
import game.progect.battleseagame.services.GameServices;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@Controller
@RequiredArgsConstructor
@RequestMapping("/startGame")
public class GameController {

    private final GameServices gameServices;


    @GetMapping("/getGame")
    public ResponseEntity<?> getGamesPage() {
        return ResponseEntity.ok(gameServices.getAll());
    }

    @GetMapping("/{game-id}")
    public ResponseEntity<GameDto> getGameById(@PathVariable("game-id") UUID gameId){
        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .body(gameServices.getGameById(gameId));
    }

    @PutMapping("/{game-id}")

    public ResponseEntity<GameDto> updateGameShot(@PathVariable("game-id") UUID gameId,
                                                     @Valid @RequestBody GameDto newData) {

        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .body(gameServices.updateGameShot(gameId, newData));

    }


}
