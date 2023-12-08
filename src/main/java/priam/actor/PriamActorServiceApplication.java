package priam.actor;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import priam.actor.repositories.DSCategoryRepository;
import priam.actor.repositories.DataSubjectRepository;

@SpringBootApplication
public class PriamActorServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(PriamActorServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(DataSubjectRepository dataSubjectRepository, DSCategoryRepository dsCategoryRepository) {
        return args -> {

        };
    }
}
