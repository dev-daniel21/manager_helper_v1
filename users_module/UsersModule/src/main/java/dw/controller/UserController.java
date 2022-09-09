package dw.controller;

import dw.service.UserService;
import dw.users.UserModel;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(value = "/check")
    public String healthCheck() {
        return "\n* * * * * * *\nusers module running \n * * * * * * *\n";
    }

    @GetMapping("/getall")
    public List<UserModel> getAllUsers() {
        return userService.getAll();
    }

    @PostMapping("/addnew")
    public UserModel addNewUser(@RequestBody UserModel userModel) {
        return userService.addNewUser(userModel);
    }

}
