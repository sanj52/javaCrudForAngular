package com.sanjay.repository;

import com.sanjay.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    User findByFirstNameAndAndEmailAndLastName(String firstName, String email, String lastName);
}
