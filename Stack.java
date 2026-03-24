class Node{
    int da;
    Node ne;
    Node(int n){
        this.da=n;
        this.ne=null;
    }
}
class Stack{
    Node top;

    void push(int n){
        Node nn =new Node(n);
        nn.ne= top;
        top=nn;
    }
    int pop(){
        int v= top.da;
        top=top.ne;
        return v;
    }
    int peek(){
        return top.da;
    }
    void Display(){
        Node temp=top;
        while(temp!=null){
            System.out.print(temp.da+ " ");
            temp=temp.ne;
        }
        System.out.println(" ");
    }
    void Search(int n){
        Node temp=top;
        int pos=1;
        while(temp !=null){
            if(temp.da==n){
                System.out.println(temp.da+" at "+pos);
                return;
            }
            temp=temp.ne;
        }
        System.out.println("Not found");
    }
   public static void main(String[] args) {
    Stack s = new Stack();
    s.push(10);
    s.push(20);
    s.push(30);
    s.push(40);
    s.Display();
    s.Search(30);
    System.out.println(s.pop()+ " Popped Successfully");
    s.Display();
    System.out.println(s.pop()+ " Popped Successfully");
    s.Display();

       
   } 
}