package com.vishnusnair.cowinapplication.cowinapplication.repository;


import com.vishnusnair.cowinapplication.cowinapplication.model.ERole;
import com.vishnusnair.cowinapplication.cowinapplication.model.Role;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface RoleRepository extends MongoRepository<Role, String> {
    Optional<Role> findByName(ERole name);
}