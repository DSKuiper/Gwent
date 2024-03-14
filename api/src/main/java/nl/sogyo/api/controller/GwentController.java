package nl.sogyo.api.controller;

import nl.sogyo.api.models.CardDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import nl.sogyo.api.models.GameDTO;

@RestController
public class GwentController {
    
    @GetMapping("/start")
    public CardDTO test(@RequestParam(value = "", defaultValue = "default") String input) {
        return new CardDTO("ciri");
    }
}
