import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class conversion {

  public static void main(String[] args) throws FileNotFoundException {
    System.out.println("WELCOME TO THE CONVERSION PROGRAM");
    System.out.println(
      "pick an option from the given menu below to interact with it"
    );

    System.out.println("1. Conversion of String\r\n");
    System.out.println("2. COnversion of Units\r\n");

    int x;
    int y;
    int z;
    int k;
    int v;
    String block = "";

    Scanner sc = new Scanner(System.in);

    x = sc.nextInt();

    switch (x) {
      case 1:
        System.out.println("Pick an option from the below displayed menu \r\n");
        System.out.println("1. Conversion of string to Upper/Lower Case\r\n");
        System.out.println("2. Identify numeric values in a string\r\n");
        System.out.println(
          "3. Verify whether the entered String is a valid number\r\n"
        );
        System.out.println(
          "4. Remove numeric values in the string and convert to Upper/Lower case"
        );

        y = sc.nextInt();

        Scanner p = new Scanner(System.in);

        System.out.println("Pick the desired method of input");

        System.out.println("1. Enter the string block");
        System.out.println("2. Enter the file path");

        k = sc.nextInt();
        System.out.println("enter the String");

        switch (k) { // to decide what method of input the user wants
          case 1:
            block = p.nextLine(); // this line is if the user wants to enter a value manually
            break;
          case 2:
            String fly = p.nextLine(); //user wanting to read a file as the input
            File file = new File(fly);
            Scanner scan = new Scanner(file);

            while (scan.hasNextLine()) { //reading the file
              block = scan.nextLine() + block;
            }
        }

        conv i = new conv();
        switch (y) {
          case 1:
            System.out.println("1. Conversion of string to UpperCase");
            System.out.println("2. Conversion of string to LowerCase");

            z = sc.nextInt();

            switch (z) {
              case 1:
                i.upcse(block);
                break;
              case 2:
                i.lwcse(block);
                break;
              default:
                System.out.println("Invalid input");
                break;
            }
            break;
          case 2:
            i.ident(block);
            break;
          case 3:
            i.number(block);

            break;
          case 4:
            i.extrxt(block);

            break;
          default:
            System.out.println("Invalid option");
            break;
        }
        break;
      case 2:
        System.out.println("Select from the below menu\r\n");

        System.out.println("1.Converto of length");
        System.out.println("2.Converto of mass");
        System.out.println("3.Converto of time");

        v = sc.nextInt();
        lenth lng = new lenth();
        mss hvy = new mss();
        tme min = new tme();
        switch (v) {
          case 1:
            System.out.println("1.Feet to Meters");
            System.out.println("2.Meters to Feet");
            System.out.println("3.Centimeters to inches");
            System.out.println("4. Inches to Centimeters");

            lng.ftm();

            break;
          case 2:
            System.out.println("Please select from the below menu\r\n");

            System.out.println("1. Kilogram to lbs");
            System.out.println("2. lbs to Kilograms");
            System.out.println("3. miligrams to oz");
            System.out.println("4. oz to miligrams");

            hvy.gross();
            break;
          case 3:
            System.out.println("Select from the menu below\r\n");

            System.out.println("1. Hour to minute");
            System.out.println("2. minute to hour");
            System.out.println("3. minute to second");
            System.out.println("4. second to minute");

            min.times();
            break;
        }
    }
  }
}
