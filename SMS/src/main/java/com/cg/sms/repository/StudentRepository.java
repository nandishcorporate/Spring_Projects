package com.cg.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.sms.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
