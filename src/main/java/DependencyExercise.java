import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class DependencyExercise {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter something:");
        String userInput = sc.nextLine();
        System.out.println("You entered:  " + userInput );

        // checks if input is number: StringUtils.isNumeric
        if (StringUtils.isNumeric(userInput)){
            System.out.printf( userInput + " is a number\n");
            System.out.println("Flipped Case: Not able to flip");
        }else{
            System.out.printf("\n\"%s\" is not a number\n", userInput);
            //flips the case of the string: StringUtils.swapCase
            System.out.println("Flipped Case: " + StringUtils.swapCase(userInput));
        }

        //reverses the string
        System.out.println("Reversed Case: " + StringUtils.reverse(userInput));

    }

}


