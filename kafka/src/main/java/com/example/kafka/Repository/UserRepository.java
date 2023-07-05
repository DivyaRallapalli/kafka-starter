package com.example.kafka.Repository;

import com.example.kafka.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

}
