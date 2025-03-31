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

        // start forloop, for each element in the array take one character and store as ch
        for (String ch : wrdArray) {
            // get ordefault to look inside of hashmap for the first ch, if it is not fount it returns 0 if it is it returns the value already storedto the ch. Increase the count(+1) 
            // go through each character one by one
            // check if its already in the hashmap
            // if its not it starts the count at 1
            // if it is in the hashmap it increases the count by 1
            // process continues untial all characters are counted
            myHashMap.put(ch,myHashMap.getOrDefault(ch, 0)+1);
        }

        System.out.println(myHashMap);
        sc.close();
        
    }

}
