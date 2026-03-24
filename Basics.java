import java.util.*;
public class Basics {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num= in.nextInt();
        /* 
        if(num%2==0){
            System.out.println("Even");

        }
        else{
            System.out.println("odd");
        }
        */

    /*.  Factorial 
    int sum = 1;
        for(int i=1;i<=num;i++){
            sum *=i;

        }*/

    /* Prime Num 
       int count =0;
       for(int i=2;i<num;i++){
        if(num % i==0){
           
            count ++;
        }
        
        }
        if (count > 1){
            System.out.println("Its not a prime");
        }
        else{
            System.out.println("Its prime");
        }
            */
           /*Fibonacci Series */
           int a=0;
           int b=1;
           System.out.print(a+" ");
           System.out.print(b+" ");
           for (int i = 2; i < num; i++) {
            int c= a+b;
            System.out.print(c+" ");
               a=b;
               b=c;
           }
       }
   
    }
    

