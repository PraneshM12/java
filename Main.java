class Student {
    String name;
    int age;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(); // object 1
        s1.name = "Alice";
        s1.age = 21;

        Student s2 = new Student(); // object 2
        s2.name = "Bob";
        s2.age = 22;

        s1.display();
        s2.display();
    }
}