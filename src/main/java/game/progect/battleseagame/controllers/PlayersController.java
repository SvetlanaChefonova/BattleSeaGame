package game.progect.battleseagame.controllers;


import game.progect.battleseagame.services.PlayersServices;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/players")
public class PlayersController {

    private final PlayersServices playersServices;

    @GetMapping("/getPlayers")
    public ResponseEntity<?> getPlayersPage() {
        return ResponseEntity.ok(playersServices.getAll());
    }




}
