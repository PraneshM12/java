abstract class abs{
    void display(int a, int b){
        System.out.println("Hai");
    }
    abstract void print();
}
class abs1 extends abs{
    void print(){
        System.out.println("hello");
    }

}

public class Abstract {
    public static void main(String args[]){
        abs s1 = new abs1();
        s1.print();

    }
    
}
