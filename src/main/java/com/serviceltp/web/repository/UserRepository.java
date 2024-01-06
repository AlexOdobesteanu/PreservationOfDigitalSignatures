package com.serviceltp.web.repository;

import com.serviceltp.web.models.User;
import org.springframework.boot.web.embedded.undertow.UndertowServletWebServer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Integer> {
    Optional<User> findByUsername(String username);

}
