package gwent.api.controller;

import gwent.api.models.GameDTO;
import gwent.api.models.PlayerInputDTO;
import gwent.domain.IGwent;
import gwent.domain.IGwentFactory;
import gwent.domain.GwentFactory;
import org.springframework.web.bind.annotation.*;

@RestController
public class GwentController {
    private IGwentFactory factory;
    private IGwent game;

    public GwentController(IGwentFactory factory) {
        this.factory = factory;
    }

    @GetMapping("/gwent/api/start")
    public GameDTO start(@RequestParam(value = "", defaultValue = "default") String input) {
        this.factory = new GwentFactory();
        this.game = factory.createNewGame();
        return new GameDTO(game);
    }

    @PostMapping("/gwent/api/play")
    public GameDTO play(@RequestBody PlayerInputDTO input) {
        game.playCard(input.getCardToPlay());
        return new GameDTO(game);
    }
}
