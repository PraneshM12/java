import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number");
        int n = scanner.nextInt();

        if (n > 0 && (n & (n - 1)) == 0)
            System.out.println("Power of Two");
        else
            System.out.println("Not a Power of Two");
    }
}
