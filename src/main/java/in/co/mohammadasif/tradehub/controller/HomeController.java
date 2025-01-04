package in.co.mohammadasif.tradehub.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping
    public String homePage() {
        return "Welcome to tradehub !!!";
    }

    @GetMapping("/api")
    public String secureEndpoint() {
        return "This is secure endpoint. Can be accessed via token only";
    }
}
