package jakester.jakester.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakester.jakester.auth.entity.User;
import jakester.jakester.auth.repository.UserRepository;

@Service
public class UserService {
    
    @Autowired UserRepository userRepository;

    public User findUserByUsername(String username){
        return userRepository.findByUsername(username);
    }

    public User findUserById(Long id){
        return userRepository.findById(id).get();
    }

    public User updateUser(User user){
        return userRepository.save(user);
    }

}
