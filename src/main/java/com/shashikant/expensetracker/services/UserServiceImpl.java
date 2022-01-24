package com.shashikant.expensetracker.services;

import com.shashikant.expensetracker.model.User;
import com.shashikant.expensetracker.entityexceptions.EtAuthException;
import com.shashikant.expensetracker.repositories.UserRepository;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.regex.Pattern;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public User validateUser(String email, String password) throws EtAuthException {
        if(email != null) email = email.toLowerCase();
        return userRepository.findByEmail(email);
    }

    @Override
    public User registerUser(int id,String firstName, String lastName, String email, String password) throws EtAuthException {

        Pattern pattern = Pattern.compile("^(.+)@(.+)$");
        if(email != null) email = email.toLowerCase();
        if(!pattern.matcher(email).matches())
            throw new EtAuthException("Invalid email format");

        //Integer userId = userRepository.create(firstName, lastName, email, password);
        String hashedPassword = BCrypt.hashpw(password, BCrypt.gensalt(10));

        User user = new User(id,firstName,lastName,email,hashedPassword);
        return userRepository.save(user);
       // return userRepository.findById(user.getUserId());
    }
}
