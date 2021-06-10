package com.example.postgresdemo.repository;

import com.example.postgresdemo.modelClasses.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    void deleteById(Long id);
    Collection<Student> getAllByGroupId(Long groupId);
}
