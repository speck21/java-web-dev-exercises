package exercises;
import java.util.Scanner;
public class MilesPerGallon {
    public static void main(String[] args){
        float miles;
        float gallonsOfGas;
        Scanner scan = new Scanner(System.in);
        System.out.println("How many miles have you driven and how many gallons of gas did it take? \nMiles: ");
        miles = scan.nextFloat();
        System.out.println("Gas (gallons): ");
        gallonsOfGas = scan.nextFloat();
        System.out.println("MPG: " + Math.round((miles/gallonsOfGas)*100)/100.00);
    }
}
