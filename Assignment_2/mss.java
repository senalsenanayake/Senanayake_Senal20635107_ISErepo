import java.util.Scanner;

public class mss {

  double kilogram;
  double lbs;
  double miligrams;
  double oz;
  int c;
  int k;
  double[] input;
  Scanner sc = new Scanner(System.in);

  public void gross() {
    c = sc.nextInt();
    switch (c) {
      case 1:
        System.out.println("enter in kilograms");
        System.out.println("1. Enter the string block");
        System.out.println("2. Enter the file path");

        k = sc.nextInt();
        System.out.println("enter the String");
        Scanner s = new Scanner(System.in);

        switch (k) { // to decide what method of input the user wants
          case 1:
            input = new double[1];
            input[0] = sc.nextDouble();
            break;
          case 2:
            String path = "";

            path = s.nextLine();
            input = calc.calculator(path);

            break;
        }
        for (int i = 0; i < input.length; i++) {
          lbs = input[i] * 2.2;
          System.out.println("value to convert :" + input[i]);
          System.out.println("the answer in lbs is: " + lbs);
        }

        break;
      case 2:
        System.out.println("enter in lbs");
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
            input = calc.calculator(path);

            break;
        }
        for (int i = 0; i < input.length; i++) {
          kilogram = input[i] / 2.2;
          System.out.println("value to convert :" + input[i]);
          System.out.println("the answer in kilograms is :" + kilogram);
        }

        break;
      case 3:
        System.out.println("enter in miligrams");
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
            input = calc.calculator(path);

            break;
        }
        for (int i = 0; i < input.length; i++) {
          oz = input[i] / 28350;
          System.out.println("value to convert :" + input[i]);
          System.out.println("the answer in oz is: " + oz);
        }

        break;
      case 4:
        System.out.println("enter in oz");
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
            input = calc.calculator(path);

            break;
        }
        for (int i = 0; i < input.length; i++) {
          miligrams = input[i] * 28350;
          System.out.println("value to convert :" + input[i]);
          System.out.println("the answer in miligrams is :" + miligrams);
        }

        break;
    }
  }
}
