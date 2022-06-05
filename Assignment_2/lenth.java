import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class lenth {

  Scanner sc = new Scanner(System.in);
  double[] input;
  int k;
  int f;
  double feet;
  double meters;
  double centimeters;
  double inches;

  public void ftm() {
    f = sc.nextInt();
    switch (f) {
      case 1:
        System.out.println("enter in feet\r\n");
        Scanner s = new Scanner(System.in);

        System.out.println("Pick the desired method of input");

        System.out.println("1. Enter the string block");
        System.out.println("2. Enter the file path");

        k = sc.nextInt();
        System.out.println("enter the String");

        switch (k) { // to decide what method of input the user wants
          case 1:
            input = new double[1];
            input[0] = sc.nextDouble();
            break;
          case 2:
            String path = "";

            path = s.nextLine();
            input = meth(path);

            break;
        }

        for (int i = 0; i < input.length; i++) {
          meters = input[i] * 0.325;
          System.out.println("value to convert :" + input[i]);
          System.out.println("the answer in meters is :" + meters);
        }

        break;
      case 2:
        System.out.println("enter in meters \r\n");
        System.out.println("Pick the desired method of input");

        System.out.println("1. Enter the string block");
        System.out.println("2. Enter the file path");

        k = sc.nextInt();
        System.out.println("enter the String");
        s = new Scanner(System.in);

        switch (k) { // to decide what method of input the user wants
          case 1:
            input = new double[1];
            input[0] = sc.nextDouble();
            break;
          case 2:
            String path = "";

            path = s.nextLine();
            input = meth(path);

            break;
        }
        for (int i = 0; i < input.length; i++) {
          feet = input[i] / 0.325;
          System.out.println("value to convert :" + input[i]);
          System.out.println("the answer in feet is :" + feet);
        }

        break;
      case 3:
        System.out.println("enter in centimeters \r\n");
        System.out.println("Pick the desired method of input");

        System.out.println("1. Enter the string block");
        System.out.println("2. Enter the file path");

        k = sc.nextInt();
        System.out.println("enter the String");
        s = new Scanner(System.in);

        switch (k) { // to decide what method of input the user wants
          case 1:
            input = new double[1];
            input[0] = sc.nextDouble();
            break;
          case 2:
            String path = "";

            path = s.nextLine();
            input = meth(path);

            break;
        }
        for (int i = 0; i < input.length; i++) {
          inches = input[i] / 2.54;
          System.out.println("value to convert :" + input[i]);
          System.out.println("the answer in inches is :" + inches);
        }

        break;
      case 4:
        System.out.println("enter in inches \r\n");
        System.out.println("Pick the desired method of input");

        System.out.println("1. Enter the string block");
        System.out.println("2. Enter the file path");

        k = sc.nextInt();
        System.out.println("enter the String");
        s = new Scanner(System.in);

        switch (k) { // to decide what method of input the user wants
          case 1:
            input = new double[1];
            input[0] = sc.nextDouble();
            break;
          case 2:
            String path = "";

            path = s.nextLine();
            input = meth(path);

            break;
        }
        for (int i = 0; i < input.length; i++) {
          centimeters = input[i] * 2.54;
          System.out.println("value to convert :" + input[i]);
          System.out.println("the answer in centimeter is: " + centimeters);
        }

        break;
      default:
        System.out.println("invalid option");
        break;
    }
  }

  public static double[] meth(String path) {
    String line = null;
    try {
      BufferedReader br = new BufferedReader(new FileReader(path));

      try {
        while ((line = br.readLine()) != null) {
          String[] values = line.split(",");

          double[] intValues = new double[values.length];
          // looping over String values
          for (int i = 0; i < values.length; i++) {
            // trying to parse String value as int
            try {
              // worked, assigning to respective int[] array position
              intValues[i] = Double.parseDouble(values[i]);
            } catch (NumberFormatException nfe) { // at that position int will have default value 0 // didn't work, moving over next String value
              continue;
            }
          }

          return intValues;
        }
      } catch (IOException e) {
        e.fillInStackTrace();
      }
    } catch (FileNotFoundException e) {
      System.out.println("dad");
      e.fillInStackTrace();
    }
    return null;
  }
}
