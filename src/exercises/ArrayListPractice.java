package exercises;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args){
        ArrayList<Integer> arrList = new ArrayList();
        for(int i = 0; i<50; i+=5){
            arrList.add(i);
        }
        System.out.println(arrList);
        System.out.println("Sum: "+sum(arrList));
        //do part 2
        ArrayList<String> arrStr = new ArrayList<>();
        arrStr.add("blue");
        arrStr.add("three");
        arrStr.add("yellow");
        arrStr.add("first");
        letterPrint(arrStr);
        String str = "I would not, could not, in a box. I would not, could not with a fox." +
                " I will not eat them in a house. I will not eat them with a mouse.";
        str = str.replace(".", "");
        str = str.replace(",", "");
        String[] strArr = str.split(" ");
        ArrayList<String> strList = new ArrayList<>(Arrays.asList(strArr));
        letterPrint(strList);

    }
    public static int sum(ArrayList<Integer> arr){
        int sum =0;
        for(int i =0;i<arr.size(); i++){
            sum+= arr.get(i);
        }
        return sum;
    }
    public static void letterPrint(ArrayList<String> arr){
        int userChoice;
        Scanner scan = new Scanner(System.in);
        System.out.println("What length word would you like to search for? ");
        userChoice = scan.nextInt();
        for(int i=0;i<arr.size();i++){
            if(arr.get(i).length() ==userChoice){
                System.out.println(arr.get(i));
            }
        }

    }
}
