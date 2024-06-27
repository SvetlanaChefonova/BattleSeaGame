package game.progect.battleseagame.services;

import game.progect.battleseagame.model.Player;
import game.progect.battleseagame.repositories.PlayerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PlayersServicesImpl implements PlayersServices{
    private final PlayerRepository playerRepository;

    @Override
    public List<Player> getAll() {
        return playerRepository.findAll();
    }
}
