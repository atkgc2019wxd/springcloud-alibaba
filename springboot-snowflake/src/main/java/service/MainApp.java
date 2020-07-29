package service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"controller","service"})
public class MainApp {
    public static void main(String[] args) {
        SpringApplication.run(MainApp.class,args);
    }
}
