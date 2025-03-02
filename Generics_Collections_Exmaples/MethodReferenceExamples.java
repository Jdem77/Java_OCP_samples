package Generics_Collections_Exmaples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

// Method References and lambdas behave the same at runtime.

/* There are four formats for method references
 * 
 *  1. Static methods
 *  2. Instance methods on a particular instance
 *  3. Instance methods on an instance to be determined at runtime
 *  4. Constructors
 * 
 * 
 *  Types           |  Before Colon  |  After colon     | Example
 *  Static method   |  Class name    |  Method name     | Collections::sort
 *                  |
 *  Instance method |  Object ref    |  Method name     | str::startsWith
 *  on a object     |
 *                  |
 *  Instance method |
 * on a parameter   |  Class name    |  Method name     | String::startsWith 
 * 
 */
public class MethodReferenceExamples {

    public static void main(String[] args) {

        // Example 1: Static Method sort from the Collections class
        // sort() takes a List and returns void - hence Consumer Usage
        Consumer<List<Integer>> lambdaExp = l -> Collections.sort(l);
        Consumer<List<Integer>> methodRef = Collections::sort;

        // Example 2: Calling the instance method startsWith on the String Class
        // startsWith() takes a String and returns a boolean - hence Predicate Usage
        var str = "instance - method reference example";
        Predicate<String> lambdaExp2 = s -> str.startsWith(s);
        Predicate<String> methodRef2 = str::startsWith;

        var random = new Random();
        Supplier<Integer> methodRef2_2 = random::nextInt;
        Supplier<Integer> lambdaExp2_2 = () -> random.nextInt();

        // Example 3: Calling the instance method length on the String Class
        // length() takes no arguments and returns an int - hence Supplier Usage
        Supplier<Integer> lambdaExp3 = () -> str.length();
        Supplier<Integer> methodRef3 = str::length;

        BiPredicate<String, String> lambdaExp4 = (s, p) -> s.startsWith(p);
        BiPredicate<String, String> methodRef4 = String::startsWith;

        // Example 4: Calling the constructor of a class
        Supplier<List<String>> lambdaExp5 = () -> new ArrayList();
        Supplier<List<String>> methodRef5 = ArrayList::new;

        Function<Integer, List<String>> lambdaExp6 = i -> new ArrayList(i);
        Function<Integer, List<String>> methodRef6 = ArrayList::new;
    }

}