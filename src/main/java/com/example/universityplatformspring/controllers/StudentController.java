package com.example.universityplatformspring.controllers;

import com.example.universityplatformspring.dtos.StudentResponseDTO;
import com.example.universityplatformspring.services.StudentService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @Resource
    StudentService studentService;

    @GetMapping("/test/{id}")
    public StudentResponseDTO test(@PathVariable String id) {
        return studentService.returnStringForTest(id);
    }

}
