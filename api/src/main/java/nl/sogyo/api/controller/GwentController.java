package nl.sogyo.api.controller;

import nl.sogyo.api.models.CardDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GwentController {
    
    @GetMapping("/start")
    public CardDTO start() {
        return new CardDTO("ciri");
    }
}
