//Write a Java program to swap two variables.
import java.util.*;
public class SwapVariables {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("Num1 = "+ num1 + " Num2 = "+ num2);
        num1 = num1 ^ num2;
        num2 = num1 ^ num2;
        num1 = num1 ^ num2;
        System.out.println("Num1 = "+ num1 + " Num2 = "+ num2);
        sc.close();
    }
}
