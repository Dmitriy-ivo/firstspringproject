package com.example.firstspringproject.Repository;

import com.example.firstspringproject.Entity.Role;
import com.example.firstspringproject.Entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface RoleRepository extends CrudRepository<Role, Long> {

}