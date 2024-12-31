import java.util.Scanner;
public class Calculator {
   public static void main(String[] args) {
      double num1;
      double num2;
      double ans;
      char op;
      Scanner reader = new Scanner(System.in);
			System.out.print("Enter nama kamuu: ");
      String name = reader.nextLine();
      System.out.print("Enter kedua angka (contoh:2 10): ");
      num1 = reader.nextDouble();
      num2 = reader.nextDouble();
      System.out.print("\nEnter operator (  +  -  *  /  ): ");
      op = reader.next().charAt(0);
      switch(op) {
         case '+': ans = num1 + num2;
            break;
         case '-': ans = num1 - num2;
            break;
         case '*': ans = num1 * num2;
            break;
         case '/': ans = num1 / num2;
            break;
      default: System.out.printf("Error! Operator tidak tepat!");
         return;
      }
      System.out.println("\n///// " + name);
      System.out.println(num1 + " " + op + " " + num2 + " = " + ans);
   }
}
