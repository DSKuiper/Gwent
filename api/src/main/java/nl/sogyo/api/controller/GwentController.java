package nl.sogyo.api.controller;

import nl.sogyo.api.models.CardDTO;
import nl.sogyo.api.models.GameDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GwentController {
    
    @GetMapping("/gwent/api/start")
    public GameDTO start(@RequestParam(value = "", defaultValue = "default") String input) {
        return new GameDTO();
    }

    @GetMapping("gwent/api/test")
    public CardDTO test(@RequestParam(value = "", defaultValue = "default") String input) {
        return new CardDTO("ciri");
    }

}
