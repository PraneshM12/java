import java.util.*;
public class Array1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of array");
        int n= in.nextInt();
        int sum =0;
        int arr[]= new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=in.nextInt();
            
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+ " ");
            sum+=arr[i];
        }
        System.out.println("Sum Of the Array values is"+ sum);

    }
    
}
