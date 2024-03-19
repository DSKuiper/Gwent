package gwent.api.controller;

import gwent.api.models.GameDTO;
import gwent.domain.IGwent;
import gwent.domain.IGwentFactory;
import gwent.domain.GwentFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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

    @GetMapping("/gwent/api/play")
    public GameDTO play(@RequestParam(value = "", defaultValue = "default") String input) {
        return new GameDTO(game);
    }
}
