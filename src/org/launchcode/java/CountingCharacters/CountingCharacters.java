package org.launchcode.java.CountingCharacters;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class CountingCharacters {
    public static void main(String[] args) {
        String defaultString = "If the product of two terms is zero then common sense says at least one of the two terms has " +
                "to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a " +
                "form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty " +
                "straightforward from there.";
        System.out.println("Please enter string for counting, '1' to read local file, or press ENTER for default. String: ");
        Scanner scan = new Scanner(System.in);
        String choice = scan.nextLine();
        String countString = "";
        if(choice.equals("")){
            countString = defaultString.replaceAll("[^a-zA-Z]","");
        }else if(choice.equals("1")) {
            try{
                File strFile = new File("src/org/launchcode/java/CountingCharacters/String.txt");
                Scanner myReader = new Scanner(strFile);
                String fileCount = "";
                while(myReader.hasNextLine()) {
                    fileCount += myReader.nextLine();
                }
                myReader.close();
                countString = fileCount.replaceAll("[^a-zA-Z]", "");
            }catch(FileNotFoundException e) {
                System.out.println("An error occurred");
                e.printStackTrace();
            }
        }else{
                countString = choice.replaceAll("[^a-zA-Z]","");
        }
        char[] charactersInString = countString.toLowerCase().toCharArray();
        HashMap<Character, Integer> countMap = new HashMap<>();
    /*Loop through character array
      At each index, check if that character is in the hashmap
      If not, add to hashmap and set value to 1
      If so, increment value
     */
        for (char letter : charactersInString) {
            if(countMap.containsKey(letter)){
                countMap.put(letter, countMap.get(letter)+1);
            }else{
                countMap.put(letter,1);
            }
        }
        for(Map.Entry<Character, Integer> map:countMap.entrySet()){
            System.out.println(map);
        }
    }

}

