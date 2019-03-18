package com.zal.SerweryAplikacji.login.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.zal.SerweryAplikacji.login.model.User;

import java.util.List;

@Repository("userRepository")
public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
    @Query(value = "select * from user", nativeQuery = true)
	List<User> getAllUsers();
}