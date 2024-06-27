package game.progect.battleseagame.dto;

import game.progect.battleseagame.model.Game;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GameDto {
    private UUID id;
    private String playerNickName;
    private String shot;

    public static GameDto from(Game game) {
        return GameDto.builder()
                .id(game.getId())
                .playerNickName(game.getPlayers().getPlayerNickName())
                .shot(game.getShot())
                .build();
    }

    public static List<GameDto> from(List<Game> game) {
        return game.stream().map(GameDto::from).toList();
    }


}
