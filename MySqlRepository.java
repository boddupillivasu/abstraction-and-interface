package com.abstraction.java;

public class MySqlRepository implements StudentRepository {

    @Override
    public void connectToDb() {
        System.out.println("connect to  my sql");
    }

    @Override
    public void addToDb(StudentInfo studentInfo) {
        System.out.println("connected to database");

    }
}
