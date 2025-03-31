import java.util.Scanner;
import java.util.HashMap;
// IMPORT scanner to use to capture user input

public class App {
    public static void main(String[] args) throws Exception {
        // create scanner object for user input
        Scanner sc = new Scanner(System.in);
        // creat string variable
        String word;
        // ask user for input
        System.out.println("Enter a input so we can count the the frequencies: ");
        // save scanner object to string variable
        word = sc.nextLine();
        // use string variable to first replace all spaces with no spaces, then lower all characters to lowercase
        word = word.replaceAll("\\s", "").toLowerCase();
        // create array variable that has the string variable as the array, then split the string into the array
        String[] wrdArray = word.split("");
        // Create an empty HashMap
        HashMap<String, Integer> myHashMap = new HashMap<>();

        // use for loop to loop through array and check if all of the characters in the string are correctly split and displayed
        for (String string : wrdArray) {
            System.out.println(string);
        }
    }

}
