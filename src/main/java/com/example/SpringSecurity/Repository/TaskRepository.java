package com.example.SpringSecurity.Repository;

import com.example.SpringSecurity.Entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface TaskRepository extends CrudRepository<UserEntity,Long> {
}
