package edu.icet.service;

import edu.icet.dto.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{

    @Override
    public List<Student> getStudent() {

        ArrayList<Student> stdList = new ArrayList<>();

        stdList.add(new Student(1, "kamal", "kegalle"));
        stdList.add(new Student(2, "Saman", "mawenella"));
        stdList.add(new Student(3, "pasindu", "hettimulla"));
        stdList.add(new Student(4, "lalantha", "matara"));

        return stdList;
    }
}
