package com.example.postgresdemo.service;

import com.example.postgresdemo.modelClasses.Group;
import com.example.postgresdemo.modelClasses.Student;
import com.example.postgresdemo.repository.GroupRepository;
import com.example.postgresdemo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collection;

@org.springframework.stereotype.Service
public class ServiceImpl implements Service {

    @Autowired
    private GroupRepository groupRepository;

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Group createGroup(Group group) {
        return groupRepository.save(group);
    }

    @Override
    public Group updateGroup(Group group) {
       return groupRepository.save(group);
    }

    @Override
    public void deleteGroup(Long id) {
        groupRepository.deleteById(id);
    }

    @Override
    public Collection<Group> getGroups() {
        return groupRepository.findAll();
    }

    @Override
    public Student createStudent(Student student) {
    return studentRepository.save(student);
    }

    @Override
    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }

    @Override
    public Collection<Student> getStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Collection<Student> getAllByGroupId(Long groupId) {
        return studentRepository.getAllByGroupId(groupId);
    }
}
