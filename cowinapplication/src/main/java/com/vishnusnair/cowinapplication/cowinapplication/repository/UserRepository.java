package com.vishnusnair.cowinapplication.cowinapplication.repository;

import com.vishnusnair.cowinapplication.cowinapplication.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UserRepository extends MongoRepository<User,String> {
    Optional<User> findByUsername(String username);

    Boolean existsByUsername(String username);

    Boolean existsByEmail(String email);
}
