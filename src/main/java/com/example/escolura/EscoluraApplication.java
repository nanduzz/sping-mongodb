package com.example.escolura;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackages = {"com.example.escolura.repository"})
public class EscoluraApplication {

    public static void main(String[] args) {
        SpringApplication.run(EscoluraApplication.class, args);
    }

}
