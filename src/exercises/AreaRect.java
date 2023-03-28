package exercises;
import java.util.Scanner;
public class AreaRect {
    public static void main(String[] args){
        float length;
        float width;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter length and width to calculate area.\n Length: ");
        length = scan.nextFloat();
        System.out.println("Width: ");
        width = scan.nextInt();
        System.out.println("Area is: " + (length * width));

    }
}
