/**
 * Created by wgnalle on 2/2/2015.
 */
public class TemperatureConverter {
  public static void main(String[] args) {
    float temp = 0;

    if (args.length <= 1) {
      System.out.println("Usage: TemperatureConverter <base> <temp>");
      System.exit(0);
    }

    if (args[0] == "-f") {
      // convert to Celcius
      temp = (Integer.parseInt(args[1]) * (9/5)) + 32;
      System.out.printf("%S f is %4.2f C", args[1], temp);
    }
    else if (args[0] == "-c") {
      // convert to Fahrenheit
      temp = (Integer.parseInt(args[1]) - 32) * (5/9);
      System.out.printf("%S C is %4.2f f", args[1], temp);
    }
    else {
      // error
      System.out.println("Usage: TempteratureConverter <base> <temp>");
      System.exit(0);
    }

  }
}
