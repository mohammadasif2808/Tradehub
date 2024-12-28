package in.co.mohammadasif.tradehub.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping
    public String homePage() {
        return "<H1>Welcome to tradehub !!!</H1>";
    }
}
