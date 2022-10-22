package com.example.finance.project.service;
import com.example.finance.project.model.User;
import com.example.finance.project.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;

    public User createUser(User user){
        return userRepo.save(user);
    }

    public List<User> findAllUsers(){
        return userRepo.findAll();
    }

    public User findUserById(Long id){
        return userRepo.findById(id).get();
    }
    public void deleteUser(Long id){
        userRepo.deleteById(id);
    }
}
