package jakester.jakester.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jakester.jakester.auth.entity.User;
import jakester.jakester.services.UserService;

@RestController
public class UserController {
    
    @Autowired UserService userService;

    @GetMapping("/api/users/{username}")
    public ResponseEntity<User> getUserByUsername(@PathVariable String username){
        User user = userService.findUserByUsername(username);
        return ResponseEntity.ok().body(user);
    }

    @GetMapping("/api/users/user/{id}")
    public ResponseEntity<User> getUserById(@PathVariable Long id){
        User user = userService.findUserById(id);
        return ResponseEntity.ok().body(user);
    }

    @PostMapping("/api/users/update/{id}")
    public ResponseEntity<User> updateUser(@PathVariable Long id, @RequestBody User updatedUser) {
        User user = userService.findUserById(id);
        user.setProfile_pic(updatedUser.getProfile_pic());
        user = userService.updateUser(user);
        return ResponseEntity.ok().body(user);
    }

}
