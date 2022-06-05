import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class calc {

  public static double[] calculator(String path) {
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
            } // didn't work, moving over next String value
            // at that position int will have default value 0
            catch (NumberFormatException nfe) {
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
