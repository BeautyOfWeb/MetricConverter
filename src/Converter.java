import java.util.Scanner;

class MetricConverter {
  public static float converter(float sourceNum, String fromMetric, String toMetric) {
    System.out.println("Welcome to MetricConverter!");
    float targetNum = 0;
    switch (fromMetric) {
      case "kg":
        switch (toMetric) {
          case "g":
            targetNum = sourceNum * 1000;
          default:
        }
        break;

    }
    System.out.printf("%.2f %s = %.2f %s%n", sourceNum, fromMetric, targetNum, toMetric);
    return targetNum;
  }
}

public class Converter {
  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    String str;
    String[] strs;
    float sourceNum;
    String fromMetric;
    String toMetric;
    while (true) {
      System.out.println("Please input the metrics to convert. For example: 1 kg = g");
      str = scanner.nextLine();
      strs = str.split(" ");
      if (str.equals("exit")){
        break;
      }
      if (strs.length < 3 || strs.length > 4) {
        System.out.printf("Your input is %s, which is not handled%nPlease try again", str);
        continue;
      } else if (strs.length == 3) {
        sourceNum = Float.parseFloat(strs[0]);
        fromMetric = strs[1];
        toMetric = strs[2];
      } else {
        sourceNum = Float.parseFloat(strs[0]);
        fromMetric = strs[1];
        toMetric = strs[3];
      }
      MetricConverter.converter(sourceNum, fromMetric, toMetric);
    }
    scanner.close();
  }
}
