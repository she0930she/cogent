package com.cogent.batch65_SpringBootThree.DAO_repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cogent.batch65_SpringBootThree.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

}
