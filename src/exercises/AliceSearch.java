package exercises;
import java.util.Locale;
import java.util.Scanner;

public class AliceSearch {
    public static void main(String[] args){
        String alice = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: " +
                "once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, " +
                "'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        Scanner scan = new Scanner(System.in);
        alice = alice.toLowerCase(Locale.ROOT);
        System.out.println("Enter word to search for in given string: ");
        String searchedWord = scan.next();
        System.out.println("Word found: "+alice.contains(searchedWord));
        System.out.println("Index of word: "+ alice.indexOf(searchedWord)+ " Length: " + searchedWord.length());
        String[] modifiedString = alice.split(searchedWord);
        for(int i =0;i<modifiedString.length;i++){
            System.out.println(modifiedString[i]);
        }
    }
}
