package com.bosonit.block7crudvalidation.domain.repository;

import com.bosonit.block7crudvalidation.domain.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
}
