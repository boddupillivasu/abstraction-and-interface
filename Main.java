package com.abstraction.java;


public class Main {
    public static void main(String[] args) {
        StudentInfo student4 = new StudentInfo("Nishi", "9666462662", "nri", "ece");
/*
when ever we declare abstract class or abstract method to the service class  that time we never
create  any objects to the student service class
 */
//        StudentServices studentServices;
//        studentServices = new StudentServices();
//        studentServices.addToDb(student4);


        PostGreSol postGreSol = new PostGreSol();
        MySqlRepository mySqlRepository = new MySqlRepository();
        StudentImplementation studentImplementation = new StudentImplementation(postGreSol);
        studentImplementation.addToDb(student4);
        studentImplementation.displayDetails(student4);
    }
}

/*
1.in the first step we have create student info class and in that
class we have to declare instance variables and  default,non argument constructors
and display details
2.we have to create student service in that class declare a method in that
method we pass student info details write a sout statement
3.we create another class that name was main in that main class declare non argument constructor
and create an object based service class and call the method with parameter
4.and next we can create repository  abstract class in that class we declare  two abstract methods in one method we
pass the student info details
5.and also create mysql class it extends repository class it overrides the methods
and it add to the my sql and database
5.again we can create another class that is post gre sql it also extends repository class
and override methods and add postgresql and database
6.we can create implementation class because it takes the contract with service class
and extends that class and also create one repository instance variable
and create non argument constructor and database method which is same as service class method
and pass the student info details in that method accessing the both two method that is repository
methods with instance variable reference
7.finally in main class we create an object for postgresql,mysql,and implement class
and pass what we require  that is may be postgresql or my sql and call the method database
with pass the student reference
8.replace abstract with interface it have only abstract methods not other methods

 */