package main.java.com.example.kanban.service;

import main.java.com.example.kanban.model.User;
import main.java.com.example.kanban.repository.UserRepository;

public class UserService {

    @AutoWired
    private UserRepository userRepository;

    @AutoWired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public User registerUser(User user){
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        return userRepository.save(user);
    }

    public User loginUser(User user){
        User founduser = userRepository.findByUserName(user.getUserName());
        if(founduser != null){
            if(bCryptPasswordEncoder.isEqual(user.getPassword(), foundUser.getPassword())){
                return founduser;
            }
        }
        return null;
    }
    
}
