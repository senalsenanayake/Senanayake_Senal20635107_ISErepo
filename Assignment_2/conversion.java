
import java.util.Scanner;
import java.io.FileNotFoundException;

public class conversion{
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("WELCOME TO THE CONVERSION PROGRAM");
        System.out.println("pick an option from the given menu below to interact with it");

        System.out.println("1. Conversion of String\r\n");
        System.out.println("2. COnversion of Units\r\n");

        int x;
        
        
        Scanner sc = new Scanner(System.in);
        
        
        x = sc.nextInt();

        switch (x) {
            case 1:

                System.out.println("Pick an option from the below displayed menu \r\n");
                System.out.println("1. Conversion of string to Upper/Lower Case\r\n");
                System.out.println("2. Identify numeric values in a string\r\n");
                System.out.println("3. Verify whether the entered String is a valid number\r\n");
                System.out.println("4. Remove numeric values in the string and convert to Upper/Lower case");

               
                
                
                break;

            case 2:
                System.out.println("Select from the below menu\r\n");

                System.out.println("1.Converto of length");
                System.out.println("2.Converto of mass");
                System.out.println("3.Converto of time");

                

        }

    }

}
