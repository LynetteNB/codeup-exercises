import org.apache.commons.lang3.StringUtils;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
//        Create a new class with a main method that prompts the user for input and does the following
//
//        Tells whether or not what the user entered is a number
//        Flips the case of the string
//        Reverses the string
//        Example Console Output
//
//
//        Enter Something: Life, The Universe, and Everything
//        You Entered: "Life, The Universe, and Everything"
//        "Life, The Universe, and Everything" is not a number
//        Flipped Case: lIFE, tHE uNIVERSE, AND eVERYTHING
//        Reversed: gnihtyrevE dna ,esrevinU eht ,efiL
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Something: ");
        String input = scan.nextLine();
        System.out.println("You entered: " + input);
        if(StringUtils.isNumeric(input)) {
            System.out.println(input + " is a number");
        } else {
            System.out.println(input + " is not a number");
        }
        System.out.println("Flipped Case: " + StringUtils.swapCase(input));
        System.out.println("Reversed: " + StringUtils.reverse(input));


    }
}
