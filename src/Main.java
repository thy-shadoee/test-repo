import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
  public static int checkNumber(int num) {
    if (num >= 100) {
      throw new ArithmeticException("Number is too large.");
    } else {
      return num;
    }
  }

  public static int provideSum(int x, int y) {
    return x + y;
  }

  public static int provideQuotient(int x, int y) {
    return x / y;
  }

  // TODO
  // Add more methods

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter your name: ");
    String name = input.nextLine();

    System.out.println("Hello, " + name + "!");
    try {
      System.out.print("Enter any number: ");
      int num1 = checkNumber(input.nextInt());
      System.out.print("Enter a number below 100: ");
      int num2 = checkNumber(input.nextInt());

      int sum = provideSum(num1, num2);
      int quotient = provideQuotient(num1, num2);
      // TODO
      // Add other results i.e., difference, product
      
      System.out.println("Result of " + num1 + " and " + num2 + ":");
      System.out.println("Sum: " + sum);
      System.out.println("Quotient: " + quotient);
      // System.out.println("Difference: " + difference);

    } catch (InputMismatchException e) {
      // TODO
      // Write error message
    } catch (ArithmeticException e) {
      System.err.println("[ERR] " + e.getMessage());
    } finally {
      input.close();
    }
  }
}
