import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"dw.*"})
@EntityScan(basePackages = {"dw.*"})
@EnableJpaRepositories(basePackages = {"dw.*"})
public class UsersModuleApplication {

    public static void main(String[] args) {
        SpringApplication.run(UsersModuleApplication.class, args);
    }
}
