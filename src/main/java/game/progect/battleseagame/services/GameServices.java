package game.progect.battleseagame.services;

import game.progect.battleseagame.dto.GameDto;
import game.progect.battleseagame.model.Game;

import java.util.List;
import java.util.UUID;

public interface GameServices {

    List<Game> getAll();
    GameDto getGameById(UUID gameId);
    GameDto updateGameShot(UUID gameId, GameDto newData);


}
