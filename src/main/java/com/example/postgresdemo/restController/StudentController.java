package com.example.postgresdemo.restController;

import com.example.postgresdemo.modelClasses.Student;
import com.example.postgresdemo.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    Service productServiceS;

    @GetMapping("/get")
    public Collection<Student> getStudents(){
        return productServiceS.getStudents();
    }

    @GetMapping("/get/all/group/{group_id}")
    public Collection<Student> getAllByGroupId(@PathVariable("group_id") Long groupId){
        return productServiceS.getAllByGroupId(groupId);
    }

    @PostMapping("/create")
    public Student createStudent(@RequestBody Student student){
        return productServiceS.createStudent(student);
    }

    @PutMapping("/update")
    public Student updateStudent(@RequestBody Student student){
        return productServiceS.updateStudent(student);
    }

    @DeleteMapping("/delete/{student_id}")
    public void deleteStudent(@PathVariable(name="student_id") Long id){
        productServiceS.deleteStudent(id);
    }


}
