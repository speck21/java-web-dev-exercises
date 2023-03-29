package org.launchcode.java.demos.lsn3classes1;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

public class Student {

    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    public Student(String name, int id, int numCred, double gpa){
        this.name = name;
        this.studentId = id;
        this.numberOfCredits = numCred;
        this.gpa = gpa;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name1){
        this.name = name1;
    }
    public int getStudentId(){
        return this.studentId;
    }
    private void setStudentId(int id){
        this.studentId = id;
    }
    public int getNumberOfCredits(){
        return this.numberOfCredits;
    }
    public void setNumberOfCredits(int credits){
        this.numberOfCredits = credits;
    }
    public double getGpa(){
        return this.gpa;
    }
    public void setGpa(double gpa1){
        this.gpa = gpa1;
    }

}