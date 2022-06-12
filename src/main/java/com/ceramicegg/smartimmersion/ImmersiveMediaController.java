package com.ceramicegg.smartimmersion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

@Controller
public class ImmersiveMediaController {
    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/button")
    public String button(){
        return "button";
    }
}
