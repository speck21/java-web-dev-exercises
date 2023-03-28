package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;
public class Area {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter radius of circle: ");
        Double radius = scan.nextDouble();
        while(radius.isNaN() || radius < 0){
            System.out.println("Error! Value must be a positive number.\nEnter radius of circle: ");
            radius = scan.nextDouble();
        }
        System.out.println(Circle.getArea(radius));

    }
}
