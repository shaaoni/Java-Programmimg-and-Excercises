import java.util.*;
public class SumOfTwoNumbers {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        //int res = num1 + num2;
        //System.out.println("Sum of the Two Number is: "+ res );
        //System.out.println("Sum of the Two Number is: "+ num1+num2 );// '+' has same precedence that is why
        // this line generates output like "sum of the number is 1020" not 30

        System.out.println("Division of the Two Number is: "+ num1/num2 ); // '/' has higher precedence that
//        is why it gives correct output
        //System.out.println("Subtraction of the Two Number is: "+ (num1-num2) );
        sc.close();
    }
}
