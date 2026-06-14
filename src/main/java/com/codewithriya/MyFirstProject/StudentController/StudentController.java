package com.codewithriya.MyFirstProject.StudentController;

import com.codewithriya.MyFirstProject.Models.Student;
import com.codewithriya.MyFirstProject.StudentRepo.StudRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudRepo studrepo;

    @GetMapping("/allStudents")
    public List<Student> getAllStudents (){
        List<Student> students = studrepo.findAll()  ;
        return students;
    }

    @GetMapping("/getStudentbyId/{id}")
    public Student getStudentById(@PathVariable int id){
        Student s1 = studrepo.findById(id).get();
        return s1;
    }
}
