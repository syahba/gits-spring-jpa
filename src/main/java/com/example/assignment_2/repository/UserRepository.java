package com.example.assignment_2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.assignment_2.entity.User;

@Repository // indicates class provides the mechanism for crud on object

public interface UserRepository extends JpaRepository<User, Long> {

}
