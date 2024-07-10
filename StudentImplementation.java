package com.abstraction.java;

public class StudentImplementation extends StudentServices {

    StudentRepository studentRepository;

    public StudentImplementation(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    void addToDb(StudentInfo studentInfo) {
        studentRepository.addToDb(studentInfo);
        studentRepository.connectToDb();

    }
}
