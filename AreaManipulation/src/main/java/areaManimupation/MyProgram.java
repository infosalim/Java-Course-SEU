package areaManimupation;

import java.util.Scanner;

public class MyProgram {

    public static void main(String[] args) {
        int ch;
        Scanner sc = new Scanner(System.in);
        Area abc = new Area();

        System.out.print("1 for Circle\n");
        System.out.print("2 for Square\n");
        System.out.print("3 for Rectangle\n");
        System.out.print("4 for Triangle\n");
        
        System.out.print("Enter your choise: \n");

        ch = sc.nextInt();

        switch (ch) {
            case 1:
                System.out.print("\nEnter area of Circle: \n");
                double radius = sc.nextDouble();
                abc.areaCircle(radius);
                System.out.print("\nCircle Area: " + abc.getArea());
                break;
            case 2:
                System.out.print("\nEnter length of a side: \n");
                int length = sc.nextInt();
                abc.areaSquare(length);
                System.out.print("\nSquare Area: " + abc.getArea());
                break;
            case 3:
                System.out.print("\nEnter length: \n");
                int rectLength = sc.nextInt();

                System.out.print("\nEnter Width: \n");
                int rectWidth = sc.nextInt();
                abc.areaRectangle(rectLength, rectWidth);
                System.out.print("\nRectangle Area: " + abc.getArea());
                break;
            case 4:
                System.out.print("\nEnter length side of A: \n");
                int len_a = sc.nextInt();

                System.out.print("\nEnter length side of B: \n");
                int len_b = sc.nextInt();

                System.out.print("\nEnter length side of C: \n");
                int len_c = sc.nextInt();
                abc.areaTriangle(len_a, len_b, len_c);
                System.out.print("\nTringle Area: " + abc.getArea());
                break;
        }
    }
}
