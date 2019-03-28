package com.sanjay.service;

import com.sanjay.model.User;
import com.sanjay.service.Impl.UserServiceImpl;

public interface UserService extends  GenericService<User, Integer>{

    User findByFirstNameAndAndEmailAndLastName(String firstName, String email, String lastName);

}
