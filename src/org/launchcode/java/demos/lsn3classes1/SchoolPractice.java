package org.launchcode.java.demos.lsn3classes1;

import javax.sound.midi.SysexMessage;
import java.util.ArrayList;

public class SchoolPractice {
    public static void main(String[] args) {
        // Instantiate your Student class for part 2 here!
        ArrayList<Student> roster = new ArrayList<>();
        Student speck = new Student("Speck", 13, 1, 4.0);
        Student josh = new Student("Josh", 9,2,3.5);
        roster.add(speck);
        roster.add(josh);
        Course math = new Course("Math", 1323,3,roster);


    }
}
