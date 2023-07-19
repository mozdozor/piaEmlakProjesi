package com.emlakProject.Emlak.repository;


import com.emlakProject.Emlak.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository  extends MongoRepository<User, String > {

    User existsByEmail(String email);

    User findByEmail(String email);
    User findByEmailAndPassword(String email,String password);




}
