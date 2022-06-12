package com.ceramicegg.smartimmersion;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Slf4j
@Component
public class DatabaseLoader implements CommandLineRunner {
    private final CatRepository repository;
    @Autowired
    RestTemplate restTemplate;

    @Autowired
    public DatabaseLoader(CatRepository repository){
        this.repository = repository;
    }

    @Override
    public void run(String... args) throws Exception {
        log.info("Running DB Loader");
        CatFact fact = restTemplate.getForObject(
                "https://catfact.ninja/fact", CatFact.class
        );
        this.repository.save(fact);
    }
}
