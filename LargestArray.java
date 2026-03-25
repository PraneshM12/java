import java.util.*;
public class LargestArray{
    public static void main(String[] args) {
        int arr[]= new int[8];
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Array Elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i]= in.nextInt();
            
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        Arrays.sort(arr);
        System.out.println("After sorting");
         for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        int n=5;
        int max=0;
        int size= arr.length-1;
        for (int i = 0; i < n; i++) {
            max= arr[size];
            size--;
        
        }
        System.out.println("5th largest is:"+ max);
    }
}