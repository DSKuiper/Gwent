package nl.sogyo.api.controller;

import nl.sogyo.api.models.GameDTO;
import nl.sogyo.domain.GwentFactory;
import nl.sogyo.domain.IGwent;
import nl.sogyo.domain.IGwentFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GwentController {
    private IGwentFactory factory;

    public GwentController(IGwentFactory factory) {
        this.factory = factory;
    }

    @GetMapping("/gwent/api/start")
    public GameDTO start(@RequestParam(value = "", defaultValue = "default") String input) {
        this.factory = new GwentFactory();
        return new GameDTO();
    }

    @GetMapping("/gwent/api/play")
    public GameDTO play(@RequestParam(value = "", defaultValue = "default") String input) {
        return new GameDTO();
    }
}
