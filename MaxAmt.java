import java.util.*;
public class MaxAmt {
    static int rob(int houses[]) {
    int n = houses.length;

    if (n == 0) {
        return 0;
    }

    if (n == 1) {
        return houses[0];
    }

    int dp[] = new int[n];
    dp[0] = houses[0];
    dp[1] = Math.max(houses[0], houses[1]);

    for (int i = 2; i < n; i++) {
        dp[i] = Math.max(dp[i - 1], houses[i] + dp[i - 2]);
    }

    return dp[n - 1];
}
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);  
        int n=sc.nextInt();
        int houses[]=new int[n];
        for(int i=0;i<n;i++){
            houses[i]=sc.nextInt();
        }
        System.out.println(rob(houses));    

    }

    
}
