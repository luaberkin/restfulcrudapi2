package com.example.postgresdemo.repository;

import com.example.postgresdemo.modelClasses.Group;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupRepository extends JpaRepository<Group,Long> {
    void deleteById(Long id);
}
