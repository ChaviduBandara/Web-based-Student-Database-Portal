package edu.icet.service;

import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService{

    @Override
    public String getStudent() {
        return "Kamal";
    }
}
