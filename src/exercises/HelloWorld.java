package exercises;
import java.util.Scanner;

public class HelloWorld {
    public static void  main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name? ");
        String name = input.next();
        System.out.println("Hello " + name);

    }
}
