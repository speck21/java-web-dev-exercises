package exercises;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args){
        int[] numArr = {1,1,2,3,5,8};
        for(int i=0;i<numArr.length;i++){
            if(numArr[i]%2 == 1) {
                System.out.println(numArr[i]);
            }
        }
        String str = "I would not, could not, in a box. I would not, could not with a fox. " +
                "I will not eat them in a house. I will not eat them with a mouse.";
        String[] splitSpace = str.split(" ");
        System.out.println(Arrays.toString(splitSpace));
        String[] splitPeriod = str.split("[.]");
        System.out.println(Arrays.toString(splitPeriod));
    }
}
