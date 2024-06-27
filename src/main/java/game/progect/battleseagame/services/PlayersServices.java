package game.progect.battleseagame.services;

import game.progect.battleseagame.model.Player;
import org.springframework.stereotype.Service;

import java.util.List;


public interface PlayersServices {
    List <Player> getAll();
}
