package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;

public class Course {
    private String courseName;
    private int courseID;
    private int credits;
    private ArrayList<Student> roster = new ArrayList<>();

    public Course(String name, int id, int cred, ArrayList<Student> roster){
        this.courseName = name;
        this.courseID = id;
        this.credits = cred;
        this.roster = roster;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public int getCourseID() {
        return courseID;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public int getCredits() {
        return credits;
    }

    public ArrayList<Student> getRoster() {
        return roster;
    }
    public void addStudent(Student student){
        this.roster.add(student);
    }
}
