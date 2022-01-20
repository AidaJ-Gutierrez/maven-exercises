import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class DependencyExercise {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter something:");
        String userInput = sc.nextLine();
        System.out.printf("You entered: %d ", userInput );

        if (StringUtils.isNumeric(userInput)){
            System.out.printf("\n\"%s\" is a number\n", userInput);
            System.out.println("Flipped Case: Not Applicable");
        }else{
            System.out.printf("\n\"%s\" is not a number\n", userInput);
            //flips the case of the string
            System.out.println("Flipped Case: " + StringUtils.swapCase(userInput));
        }

        //reverses the string
        System.out.println("Reversed: " + StringUtils.reverse(userInput));

    }

}


