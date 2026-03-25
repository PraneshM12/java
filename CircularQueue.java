class CircularQueue {
    int size = 5;
    int arr[] = new int[size];
    int front = -1, rear = -1;

    void enqueue(int value) {
       
        if ((rear + 1) % size == front) {
            System.out.println("Queue Overflow");
            return;
        }

    
        if (front == -1) {
            front = rear = 0;
        } else {
            rear = (rear + 1) % size;
        }

        arr[rear] = value;
        System.out.println(value + " inserted");
    }


    void dequeue() {
      
        if (front == -1) {
            System.out.println("Queue Underflow");
            return;
        }

        System.out.println(arr[front] + " removed");

 
        if (front == rear) {
            front = rear = -1;
        } else {
            front = (front + 1) % size;
        }
    }


    void display() {
        if (front == -1) {
            System.out.println("Queue is empty");
            return;
        }

        int i = front;
        while (true) {
            System.out.print(arr[i] + " ");
            if (i == rear) break;
            i = (i + 1) % size;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        CircularQueue q = new CircularQueue();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50); 

        q.display();

        q.dequeue();
        q.dequeue();

        q.enqueue(60);
        q.enqueue(70); 

        q.display();
    }
}