import java.util.*; // import all

public class unit1 {
    public static void main(String[] args) {    
        System.out.println("Hello World!");


        // primtive data types
        // integer value
        int age; // initialize variable and defaults to 0 
        age = 16; // reassigns it to value
        System.out.println("I am " + age + " years old.");

        // double (decimal) value
        double height; // can declare double value as an integer, but can not declare integer as a double value
        
        // boolean
        boolean old = true;
        
        // character
        char grade = 'D';

        // Reference data types (2 ways to declare strings)
        // 1) string literal
        String name = "Elle Kim";
        // 2) formal
        String address = new String("1 Grizzly Way");

        // primitive data type NOT on the AP test
        float gpa = 2.14f; // use f to identify that it is a float, not a double 
        short kids = 3;
        long life = 108;

        // taking inputs
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter your name: ");
        name = userInput.nextLine();
        System.out.println("Hi " + name + "!");

        System.out.println("Enter your age: ");
        age = userInput.nextInt();

        userInput.nextLine(); // clear the integer buffer return to string



    }
}