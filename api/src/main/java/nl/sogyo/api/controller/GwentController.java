package nl.sogyo.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import nl.sogyo.api.models.gameDTO;

@RestController
public class GwentController {
    
    @GetMapping("/test")
    public gameDTO test(@RequestParam(value = "", defaultValue = "default") String input) {
        return new gameDTO(String.format("This is a test. input is: %s", input));
    }
}
