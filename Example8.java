public class Example8 {
    private String n;
    private int a;

    // first constructor with no arguments
    public Example8() {
        System.out.println("No-arg constructor called");
        n = "John Doe";
        a = 0;
    }

    // second constructor with one argument
    public Example8(String name) {
        System.out.println("Single-arg constructor called");
        n = name;
        a = 0;
    }

    // third constructor with two arguments
    public Example8(String name, int age) {
        System.out.println("Two-arg constructor called");
        n = name;
        a = age;
    }

    public void display() {
        System.out.println("Name: " + n);
        System.out.println("Age: " + a);
    }

    public static void main(String[] args) {
        // creating objects of each constructor type
        Example8 obj1 = new Example8();
        Example8 obj2 = new Example8("Alice");
        Example8 obj3 = new Example8("Bob", 30);

        // calling the display method of each object
        obj1.display();
        obj2.display();
        obj3.display();
    }
}
