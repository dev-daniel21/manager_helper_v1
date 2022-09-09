package dw.repository;

import dw.users.UserModel;
import dw.users.UserType;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class DataBaseInserts implements CommandLineRunner {

    private final UserRepository userRepository;

    public DataBaseInserts(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        UserModel user1 = new UserModel(
                UserType.ENGINEER,
                "John",
                "Bobs",
                "factory construction site");

        userRepository.save(user1);
    }

}
