package com.lnt.lntspringbootredis.repository;

import com.lnt.lntspringbootredis.entity.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends CrudRepository<Student, String> {}
