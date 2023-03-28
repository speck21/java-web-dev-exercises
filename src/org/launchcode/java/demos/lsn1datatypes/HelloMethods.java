package org.launchcode.java.demos.lsn1datatypes;

import java.util.Scanner;

public class HelloMethods {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("sp, fr, jp, blank for eng");
        String message = Message.getMessage(scan.next());
        System.out.println(message);
    }

}
