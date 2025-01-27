package io.maven.spring.MySQL.demo;

import org.springframework.data.repository.CrudRepository;
import io.maven.spring.MySQL.demo.User;

public interface UserRepository extends CrudRepository<User,Integer>{
}
