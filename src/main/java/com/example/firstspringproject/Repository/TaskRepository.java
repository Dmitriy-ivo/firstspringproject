package com.example.firstspringproject.Repository;

import com.example.firstspringproject.Entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface TaskRepository extends CrudRepository<UserEntity,Long> {
}
