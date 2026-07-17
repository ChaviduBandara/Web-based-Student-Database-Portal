package edu.icet.service;

import edu.icet.dto.Student;

import java.util.List;

public interface StudentService {

    public List<Student> getStudent();

    public void addStudent(Student student);

    public void deleteStudentById(Integer id);

    public void updateStudent(Student student);

    public List<Student> findByName(String name);
}
