package com.example.secondeservice;

import com.example.secondeservice.propertiy.FileStorageProperties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({
        FileStorageProperties.class
})
public class SecondeServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SecondeServiceApplication.class, args);
    }

}
