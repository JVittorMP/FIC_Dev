package Dia17;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
@ComponentScan("Dia17.Sala.*")
public class ProjetoCompletoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjetoCompletoApplication.class, args);
    }
}
