package com.cogent.batch65_SpringBootOne.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cogent.batch65_SpringBootOne.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
