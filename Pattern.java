public class Pattern {
    public static void main(String[] args) {
        int n=4;
        int ryt= n*n+1;
        int lft=0;

        for (int i = n; i > 0; i--) {
            for (int j = 1; j <= n; j++) {
                if((j+i)<= n){
                    System.out.print("--");
                }
                else{
                    System.out.print(++lft +"*");
                }
            }
            for (int k = n+1; k <= n+i; k++) {

                System.out.print(ryt+"*");
                ryt++;
                if(k== n+i){
                    ryt= ryt-(2*i-1);
                }
                
            }
            System.out.println();
            
        }

       
    }
    
}
