package helloworld;
import java.util.Scanner;

/**
 * This class +++ Insert class description here +++
 *
 * @author Blend Mustafa
 */
public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String input = kb.next(); //not nextLine() because this is just meant for one word
        char[] arr = new char[input.length()];
        
        for (int i = input.length() - 1; i >= 0; i--){
            arr[input.length() - 1 - i] = input.charAt(input.length() - 1 - i);
        }
        
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[arr.length - 1 - i]);
        }
        System.out.println("");
    }

}
