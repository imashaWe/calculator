package lk.imasha.uni;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     final TextReader textReader = new TextReader("D:\\Projects\\Uni Projects\\Software Constructions\\calculator\\numbers.text");
     final Scanner scanner = new Scanner(System.in);
     double num1 = Double.parseDouble(textReader.readLine()[0]);
     double num2 = Double.parseDouble(textReader.readLine()[1]);
     boolean isRunning = true;

     while (isRunning) {
         System.out.print("Enter the method that you want (add/sub/mul):");
         final String method = scanner.nextLine();
         switch (method) {
             case "add":
                 System.out.println( MathFunction.add(num1, num2));
                 isRunning = false;
                 break;
             case "sub":
                 System.out.println(MathFunction.sub(num1, num2));
                 isRunning = false;
                 break;
             case "mul":
                 System.out.println(MathFunction.mul(num1, num2));
                 isRunning = false;
                 break;
             default:
                 System.out.println("Invalid Entry");

         }
     }

    }
}
