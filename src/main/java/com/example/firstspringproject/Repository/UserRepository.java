package com.example.firstspringproject.Repository;

import com.example.firstspringproject.Entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<UserEntity, Long> {
    UserEntity findByUsername(String username);
}
