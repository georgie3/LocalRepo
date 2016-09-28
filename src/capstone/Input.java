import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        
// Prompt the user for input
        System.out.println("Please enter the radius of the circle: ");
        
// Read the input using a Scanner object
        Scanner input = new Scanner(System.in);
        double radiusFromUser = input.nextDouble();
        
// Use the input value to calculate area of the circle
        double circleArea = 3.1415927 * radiusFromUser * radiusFromUser;
        
// Present the output to the user
        System.out.println("The area is " + circleArea);
        
    }
}
