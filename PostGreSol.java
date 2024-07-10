package com.abstraction.java;

public class PostGreSol implements StudentRepository {


    @Override
    public void connectToDb() {
        System.out.println("connect to postgresql");
    }

    @Override
    public void addToDb(StudentInfo studentInfo) {
        System.out.println("connected to database");

    }
}

