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

        // assignment operators (+, -, *, /, %)
        System.out.println(7/4); // int and int will return an int
        System.out.println(7.0/4); // double and an integer will return a double

        System.out.println(5 % 7.0); // modulus returns remainder of the division, returns double
        
        //System.out.println(7/0); // zero division error

        // order of operations - PEMDAS
        System.out.println( (5*45.0) * 2 / (4+11) - 15);

        // compound assignment operators (+=, -=, *=, /=, %=)
        int number = 0;
        System.out.println(number);
        number += 10; // number = number + 10
        System.out.println(number);
        number -= 50; // number = number - 50
        System.out.println(number);
        number *= 80; // number = number * 80
        System.out.println(number);
        number /= 100; // number = number / 100
        System.out.println(number);
        number %= 60; // number = number % 60
        System.out.println(number);

        number++; // number += 1
        System.out.println(number);
        number--; // number -= 1
        System.out.println(number);

        System.out.println((double) 7/4); // type casting 7 as a double value -> 7.0

    }


}