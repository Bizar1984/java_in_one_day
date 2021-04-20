import java.util.Scanner;

public class interactivity {
    public static void main(String[] args) {
        System.out.println("We are about to learn about interactivity");

        System.out.println("Hello\nWorld");

        System.out.println("Hello\tWorld");

        System.out.println("\\");

        System.out.println("I am 5' 9\" tall");

        System.out.println("The answer of 9/5 is: " + (9.25/5));

        System.out.printf("The answer for %.2f divided by %.1f is %.4f.", 5.45, 3.5, 5.45/3);
        // whats in green is the string to be formatted, %xf determines the amount of decimals
        // they are known as format specifiers, they always begin with a percent sign and end with a converter
        System.out.printf("%n%d\t%d", 12, 3);

        System.out.printf("%n%12d", 1247856);

        System.out.printf("\n%6.2f", 12.60458);
        // in total a width of six spaces, round the number to two decimals. 5 characters, so one small indentation

        System.out.printf("\t\t\t%,.1f", 125225.4590);

        // lets move on to accepting user input





    }
}
