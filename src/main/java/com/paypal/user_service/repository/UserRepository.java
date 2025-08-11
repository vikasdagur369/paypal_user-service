package com.paypal.user_service.repository;

import com.paypal.user_service.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository {
    Optional<User> findByEmail(String email);


}
