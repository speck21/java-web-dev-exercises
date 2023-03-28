package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RosterHashMap {
    public static void main(String[] args) {
        HashMap<String,String> roster = new HashMap<>();
        Scanner scan = new Scanner(System.in);
        String studentID;
        System.out.println("Enter student information. Enter to finish.");
        do{
            System.out.println("Student ID: ");
            studentID = scan.nextLine();
            if(!studentID.equals("")){
                System.out.println("Name: ");
                String studentName = scan.nextLine();
                roster.put(studentID,studentName);
            }

        }while(!studentID.equals(""));

        System.out.println("/nClass Roster: ");
        for(Map.Entry<String, String> student: roster.entrySet()){
            System.out.println(student);
        }
    }


}
