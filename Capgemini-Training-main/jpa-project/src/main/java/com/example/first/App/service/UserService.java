package com.example.first.App.service;

import com.example.first.App.exceptions.UserNotFoundException;
import com.example.first.App.model.User;
import com.example.first.App.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class UserService {
//    private Map<Integer, User> userDb = new HashMap<>();
    private UserRepository userRepository;
    private final Logger logger = LoggerFactory.getLogger(UserService.class);

   public UserService(UserRepository userRepository) {
       this.userRepository = userRepository;
   }

    public User createUser(User user) {
        logger.info("Creating user .....INFO");
        logger.debug("Creating user.....DEBUG");
        logger.trace("Creating user.....TRACE");
        logger.warn("Creating user.....WARN");
        logger.error("Creating user.....ERROR");
        System.out.println(user.getEmail());
        return userRepository.save(user);
    }

    public User updateUser(User user) {
//        if (!userDb.containsKey(user.getId())) throw new UserNotFoundException("User With ID : "+user.getId()+"Does not exist");
        Optional<User> userOptional = userRepository.findById(user.getId());
        User existing = userOptional.orElseThrow(()->new UserNotFoundException("User With ID : "+user.getId()+"Does not exist"));

        existing.setName(user.getName());
        existing.setEmail(user.getEmail());
        return userRepository.save(existing);
    }

    public boolean deleteUser(int id) {
        if (!userRepository.existsById(id)) {
            throw new UserNotFoundException("User With ID : "+id+"Does not exist");
        }
        userRepository.deleteById(id);
        return true;
    }

    public List<User> getAllUsers() {
       List<User> users = userRepository.findAll();
        if(users.isEmpty())throw new NullPointerException("userDb is empty");
        return  users;
    }

    public User getUserById(int id) {
       return userRepository.findById(id).orElseThrow(()->new UserNotFoundException("User With ID : "+id+"Does not exist"));
    }

    public List<User> searchUsers(String name, String email) {
        return userRepository.findByNameIgnoreCaseAndEmailIgnoreCase(name,email);
    }
}
