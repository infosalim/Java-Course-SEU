
package ArrayManipulation;

import java.util.Scanner;

public class ArrayManipulation {
    int max_size = 4;
    int a[] = new int[max_size];
    int max = 0, min = 9999;
    
    void userInput(){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < max_size; i++)
            a[i] = sc.nextInt();
    }
    
    void checkMaxNumber(){
        for(int i = 0; i < max_size; i++){
            if(a[i] > max){
                max = a[i];
            } 
            if(a[i] < min){
                 min = a[i];
            }     
        }
    }
    
    void sortInput(){
        for(int i = 0; i < max_size - 1; i ++){
            for(int j = i + 1; j < max_size; j ++){
                if( a[i] > a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
    
    public static void main(String[] args){
        ArrayManipulation ref = new ArrayManipulation();
        
        System.out.println("Enter " + ref.max_size + " numbers as array value...");
        ref.userInput();
        ref.checkMaxNumber();
        ref.sortInput();
//        System.out.println("Max Number is: "+ ref.max);
//        System.out.println("Min Number is: "+ ref.min);

        System.out.println("Max Number is: "+ ref.a[0]);
        System.out.println("Min Number is: "+ ref.a[ref.max_size - 1]);
    }
    
}
