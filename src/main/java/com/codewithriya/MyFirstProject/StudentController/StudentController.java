package com.codewithriya.MyFirstProject.StudentController;

import com.codewithriya.MyFirstProject.Models.Student;
import com.codewithriya.MyFirstProject.StudentRepo.StudRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
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

    @PostMapping("/createStudent")
    public List<Student> createStudent (@RequestBody Student s1){
        studrepo.save(s1);
        List<Student> Stdl = studrepo.findAll();
        return Stdl;
    }

    @DeleteMapping("/delete/{id}")
    public List<Student> deleteStudent (@PathVariable int id){
        Student s1 = studrepo.findById(id).get();
        studrepo.delete(s1);
        List<Student> Stdl = studrepo.findAll();
        return Stdl;
    }

    // sending data to the view:

    @GetMapping("/home")
    public String welcome(Model model) {
        model.addAttribute("msg", "Welcome Riya!");
        return "home";
    }

    @GetMapping("/seeStudent")
    public String getStudent(Model model) {
        Student s = new Student();
        s.setS_name("Riya");
        s.setS_id(125);
        s.setAge(23);
        s.setS_class("Msc");

        model.addAttribute("msg2", "New Student added: ");
        model.addAttribute("student", s);

        return "seeStudent";
    }

}
