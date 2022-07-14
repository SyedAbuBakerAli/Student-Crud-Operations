package com.project.demo.Service;


import com.project.demo.Entity.StudentEntity;
import com.project.demo.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository repository;

    public StudentEntity createStudent(StudentEntity entity){
        StudentEntity entity1 = repository.save(entity);
        return entity1;
    }

    public StudentEntity updateStudent(StudentEntity entity){
        StudentEntity entity1 = repository.save(entity);
        return entity1;
    }

    public StudentEntity studentEntityList(Integer studentId){
        StudentEntity entity = repository.getById(studentId);
        return entity;
    }

    public void deleteStudent(Integer studentId){
        repository.deleteById(studentId);
    }
}
