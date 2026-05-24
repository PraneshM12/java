public class Demo {
    private double sal;

    public void setSal(double s){
        if(s>0){
            sal= s;
        }
        else
        System.out.println("Invalid");

    }
    public double getSal(){
        return sal;
    }
}
    public class SalaryCheck{
        public static void main (String a[]){
            Demo sc = new Demo();
            sc.setSal(500000);
            System.out.println(sc.getSal());

        }
    }
    

