package org.gorthaursource.hotel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(scanBasePackages = {"org.gorthaursource.hotel"})
@EnableJpaRepositories(basePackages = {"org.gorthaursource.hotel.persistence"})
@EntityScan(basePackages = {"org.gorthaursource.hotel.persistence.model"})
public class LearningSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(LearningSpringApplication.class, args);
    }


}
