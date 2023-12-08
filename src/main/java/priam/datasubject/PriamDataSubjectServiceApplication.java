package priam.datasubject;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import priam.datasubject.repositories.DSCategoryRepository;
import priam.datasubject.repositories.DataSubjectRepository;

@SpringBootApplication
public class PriamDataSubjectServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(PriamDataSubjectServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(DataSubjectRepository dataSubjectRepository, DSCategoryRepository dsCategoryRepository) {
        return args -> {

        };
    }
}
