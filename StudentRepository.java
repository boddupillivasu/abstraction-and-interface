package com.abstraction.java;

public interface StudentRepository {

    void connectToDb();

    void addToDb(StudentInfo studentInfo);

}
