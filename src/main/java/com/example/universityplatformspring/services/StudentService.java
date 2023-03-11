package com.example.universityplatformspring.services;

import com.example.universityplatformspring.dtos.StudentResponseDTO;
import com.example.universityplatformspring.entities.Student;
import com.example.universityplatformspring.repositories.StudentRepository;
import jakarta.annotation.Resource;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Resource
    protected StudentRepository studentRepository;
    @Resource
    protected ModelMapper modelMapper;
    public StudentResponseDTO returnStringForTest(String id) {
        Student student = studentRepository.findById(id).orElse(null);
        return modelMapper.map(student, StudentResponseDTO.class);
    }
}
