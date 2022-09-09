package dw.service;

import org.springframework.stereotype.Service;
import dw.repository.UserRepository;
import dw.users.UserModel;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public List<UserModel> getAll() {
        return userRepository.findAll();
    }

    public UserModel addNewUser(UserModel userModel) {
        return userRepository.save(userModel);
    }
}
