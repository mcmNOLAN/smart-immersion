package com.ceramicegg.smartimmersion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@CrossOrigin(origins = { "http://localhost:3000", "http://localhost:4200", "http://192.168.1.72:3000" })
@RestController
public class ImmersiveMediaController {
    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/catFact")
    public String index(){
        CatFact fact = restTemplate.getForObject(
                "https://catfact.ninja/fact", CatFact.class
        );
        return fact.getFact();
    }
}
