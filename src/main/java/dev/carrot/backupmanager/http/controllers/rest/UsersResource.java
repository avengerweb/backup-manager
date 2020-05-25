package dev.carrot.backupmanager.http.controllers.rest;

import dev.carrot.backupmanager.entities.User;
import dev.carrot.backupmanager.repositories.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/1/users")
public class UsersResource {
    final UserRepository userRepository;

    public UsersResource(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping()
    public List<User> allUsers() {
        return userRepository.findAll();
    }
}
