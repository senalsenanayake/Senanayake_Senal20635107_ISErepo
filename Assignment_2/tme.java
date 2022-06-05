import java.util.Scanner;

public class tme {

  double hour;
  double minute;
  double second;
  int g;
  int k;
  double[] input;

  Scanner sc = new Scanner(System.in);

  public void times() {
    g = sc.nextInt();

    switch (g) {
      case 1:
        System.out.println("enter in hours");
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
          minute = input[i] * 60;
          System.out.println("value to convert :" + input[i]);
          System.out.println("the answer in minutes is :" + minute);
        }

        break;
      case 2:
        System.out.println("enter in minutes");
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
          hour = input[i] / 60;
          System.out.println("value to convert :" + input[i]);
          System.out.println("the answer in hour is: " + hour);

          System.out.println(hour);
        }

        break;
      case 3:
        System.out.println("enter in minutes");
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
          second = input[i] * 60;
          System.out.println("value to convert :" + input[i]);
          System.out.println("the answer in second is :" + second);
        }

        break;
      case 4:
        System.out.println("enter in second ");
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
          minute = input[i] / 60;
          System.out.println("value to convert :" + input[i]);
          System.out.println("the answer in minute is :" + minute);
        }

        break;
      default:
        System.out.println("invalid option");
        break;
    }
  }
}
