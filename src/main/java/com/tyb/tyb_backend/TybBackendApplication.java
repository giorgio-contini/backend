package com.tyb.tyb_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@CrossOrigin(origins = "https://tybfe1607.azurewebsites.net")
@EnableMongoRepositories(basePackages = "com.tyb.tyb_backend.repository")
public class TybBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(TybBackendApplication.class, args);
    }

}
