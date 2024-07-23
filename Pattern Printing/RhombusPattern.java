public class RhombusPattern {

  public static void main(String args[]) {
    if (args.length != 2) {
      System.out.println(
        "Error: Expected 2 arguments, where the first argument is rowCount and the second is columnCount"
      );
      System.exit(1);
    }

    int rowsToPrint = Integer.parseInt(args[0]);
    int columnsToPrint = Integer.parseInt(args[1]);

    for (int i = 1; i <= rowsToPrint; i++) {
      for (int j = 1; j <= columnsToPrint; j++) {
        System.out.print("*");
      }
      if (i != rowsToPrint) {
        System.out.println();
        for (int space = 1; space <= i; space++) {
          System.out.print(" ");
        }
      }
    }
  }
}
