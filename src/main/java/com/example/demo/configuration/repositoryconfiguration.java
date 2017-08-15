package com.example.demo.configuration;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Configuration
@EnableAutoConfiguration
@EntityScan(basePackages = {"com.example.demo.domain"})
@EnableJpaRepositories(basePackages = {"com.example.demo.repository"})
@EnableTransactionManagement

public class repositoryconfiguration {

}
