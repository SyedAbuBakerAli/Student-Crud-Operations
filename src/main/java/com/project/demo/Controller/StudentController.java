package com.project.demo.Controller;


import com.project.demo.Entity.StudentEntity;
import com.project.demo.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {

    @Autowired
    private StudentService service;

    @GetMapping("/studentList")
    public StudentEntity studentList(@RequestParam ("studentId") Integer studentId){
        return service.studentEntityList(studentId);
    }

    @PostMapping("/createstudent")
    public StudentEntity createStudent(@RequestBody StudentEntity entity){
        return service.createStudent(entity);
    }

    @PutMapping("/updatestudent")
    public StudentEntity updateStudent(@RequestBody StudentEntity entity){
        return service.updateStudent(entity);
    }

    @DeleteMapping("/deletestudent")
    public void deleteStudent(@RequestParam("studentId") Integer studentId){
        service.deleteStudent(studentId);
    }
}
