package com.codewithriya.MyFirstProject.StudentRepo;

import com.codewithriya.MyFirstProject.Models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudRepo extends JpaRepository<Student,Integer> {

}
