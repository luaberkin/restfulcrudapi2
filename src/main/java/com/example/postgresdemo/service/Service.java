package com.example.postgresdemo.service;
import com.example.postgresdemo.modelClasses.*;

import java.util.Collection;

public interface Service {
    public abstract Group createGroup(Group group);
    public abstract Group updateGroup(Group group);
    public abstract void deleteGroup(Long id);
    public abstract Collection<Group> getGroups();

    public abstract Student createStudent(Student student);
    public abstract Student updateStudent(Student student);
    public abstract void deleteStudent(Long id);
    public abstract Collection<Student> getStudents();
    public abstract Collection<Student> getAllByGroupId(Long groupId);
}
