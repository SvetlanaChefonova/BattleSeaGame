package game.progect.battleseagame.services;

import game.progect.battleseagame.dto.GameDto;
import game.progect.battleseagame.model.Game;
import game.progect.battleseagame.repositories.GameRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class GameServicesImpl implements GameServices {

    private final GameRepository gameRepository;

    @Override
    public List<Game> getAll() {
        return gameRepository.findAll();
    }
    @Override
    public GameDto getGameById(UUID gameId){
        Game games = gameRepository.findById(gameId).orElseThrow();
        return  from(games);
    }

    private GameDto from(Game games) {
        return GameDto.builder()
                .id(games.getId())
                .build();
    }

    @Override
    public GameDto updateGameShot(UUID gameId, GameDto newData) {
        Game games = gameRepository.findById(gameId).orElseThrow();

        games.setShot(newData.getShot());

        return GameDto.from(gameRepository.save(games));
    }

  }
