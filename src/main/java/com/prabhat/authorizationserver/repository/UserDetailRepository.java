package com.prabhat.authorizationserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prabhat.authorizationserver.model.User;

import javax.jws.soap.SOAPBinding;
import java.util.Optional;

public interface UserDetailRepository extends JpaRepository<User,Integer> {


    Optional<User> findByUsername(String name);

}
