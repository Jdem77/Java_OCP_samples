package Generics_Collections_Exmaples;

public class MethodReferenceExamples {
    public static void main(String[] args) {
        // Method reference to a static method
        // Syntax: ContainingClass::staticMethodName
        // Example: String::valueOf
        // Example: Integer::parseInt
        // Example: System.out::println
        // Example: Math::max

        // Method reference to an instance method of a particular object
        // Syntax: object::instanceMethodName
        // Example: System.out::println
        // Example: "Hello"::toUpperCase
        // Example: "Hello"::substring

        // Method reference to an instance method of an arbitrary object of a particular
        // type
        // Syntax: ContainingType::methodName
        // Example: String::compareToIgnoreCase
        // Example: Integer::compare
        // Example: Math::max
        // Example: Math::min
    }
}