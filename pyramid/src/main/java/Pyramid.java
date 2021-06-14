
import java.util.Scanner;

public class Pyramid {

  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
    int rows, k = 0;

    System.out.println("Enter pyramid row: ");
    rows = sc.nextInt();
    for (int i = 1; i <= rows; ++i, k = 0) {
      for (int space = 1; space <= rows - i; ++space) {
        System.out.print("  ");
      }

      while (k != 2 * i - 1) {
        System.out.print("* ");
        ++k;
      }

      System.out.println();
    }
  }
}