package org.example.book;

import org.example.book.service.BookService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("org.example.book")
@EntityScan("org.example")
@EnableJpaRepositories("org.example")
public class Main extends SpringBootServletInitializer {
    public static void main(String[] args) {

        SpringApplication.run(Main.class, args);

    }
}
