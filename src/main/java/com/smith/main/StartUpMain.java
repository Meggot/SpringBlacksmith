package com.smith.main;

import com.smith.BlackSmithConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StartUpMain {

    public static void main(final String[] args) {

        SpringApplication.run(BlackSmithConfiguration.class);

    }
}
