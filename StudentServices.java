package com.abstraction.java;

public abstract class StudentServices {
    /*
    here  the basic student info data we add to the Db so that's why i am using this method

     */
//  public   void addToDb(StudentInfo studentInfo){
//        System.out.println("here we add student object  to db successfully");
//    }


    abstract void addToDb(StudentInfo studentInfo);

    void displayDetails(StudentInfo studentInfo) {
        System.out.println("student name:" + studentInfo.name);
        System.out.println("student id :" + studentInfo.mobileNum);
        System.out.println("student branch:" + studentInfo.college);
        System.out.println("student percentage:" + studentInfo.department);


    }

}
