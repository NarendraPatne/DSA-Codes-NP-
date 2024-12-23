class StaticExample {
    // Static variable
    static int count = 0;

    // Instance variable
    int instanceValue = 100;

    // Constructor
    StaticExample() {
        count++; // Increment static variable
    }

    // Static method
    static void displayCount() {
        System.out.println("Count of objects: " + count);
    }
}

public class Main {
    public static void main(String[] args) {
        StaticExample obj1 = new StaticExample();
        StaticExample obj2 = new StaticExample();

        // Accessing static method
        StaticExample.displayCount(); // Output: Count of objects: 2
    }
}
