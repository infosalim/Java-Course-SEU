package additionTwoNumbers;
import java.util.Scanner;

public class AdditionTwoNumbers {
    public static int add(int x, int y){
        return x + y;
    }
    int factorial(int x){
        int f = 1, i;
        for(i = 1; i <= x; i++)
            f*=i;
        return f;
    }
     public static void main(String[] args){
        AdditionTwoNumbers facto = new AdditionTwoNumbers();
        Scanner sc = new Scanner(System.in);
//        int a, b, result;
//          int a, b;
            int n, fact;
        
        System.out.println("Enter a Number: ");
//        a = sc.nextInt();
           n = sc.nextInt();
           fact = facto.factorial(n);
           System.out.println("Factorial is: " + fact);
           
//        System.out.println("\nEnter another Number: ");
//        b = sc.nextInt();
//        result = a + b;
//        result = add(a, b);
//        System.out.println("\nThe Addition is: " + result);

//        if(a > b)
//            System.out.println(a);
//        else
//            System.out.println(b);
    }
}
