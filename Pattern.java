public class Pattern {
    public static void main(String[] args) {
        int n=4;
        int sum =0;
        for (int i = 0; i < n; i++) {
            for (int k = 0; k< i; k++) {
                System.out.print("--");
                
            }
            for (int j = i; j < n; j++) {
                System.out.print(++sum+"*");
            }
            System.out.println();
            
        }
    }
    
}
