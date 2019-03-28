package com.sanjay.service.Impl;

import com.sanjay.model.User;
import com.sanjay.repository.UserRepository;
import com.sanjay.service.GenericService;
import com.sanjay.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends GenericServiceImpl<User, Integer> implements UserService{

    @Autowired
    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        super(userRepository);
        this.userRepository = userRepository;
    }

    @Override
    public User findByFirstNameAndAndEmailAndLastName(String firstName, String email, String lastName) {
        return userRepository.findByFirstNameAndAndEmailAndLastName(firstName, email, lastName);
    }
}
