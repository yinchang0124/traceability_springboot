package com.trustchain.chargeline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class TraceabilityApplication {

    public static void main(String[] args) {
        SpringApplication.run(TraceabilityApplication.class, args);
    }

}

