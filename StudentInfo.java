package com.abstraction.java;

public class StudentInfo {


    // instance variables

    public String name;
    public String mobileNum;
    public String college;
    public String department;

    // default constructor

    public StudentInfo() {
        System.out.println(" this is default const");
        name = "roman";
        college = "nri institute of technology";
        department = "cse";
        mobileNum = "9398180481";

    }

    public StudentInfo(String name, String mobileNum, String college, String department) {
        // instance variable = local variable
        this.name = name;
        this.mobileNum = mobileNum;
        this.college = college;
        this.department = department;

    }

    public void basicInformation() {

        System.out.println("student name:" + name);
        System.out.println("student id :" + mobileNum);
        System.out.println("student branch:" + college);
        System.out.println("student percentage:" + department);


    }
}
