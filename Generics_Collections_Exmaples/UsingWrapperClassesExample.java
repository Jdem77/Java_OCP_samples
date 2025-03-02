package Generics_Collections_Exmaples;

import java.util.ArrayList;

public class UsingWrapperClassesExample {

    public static void main(String[] args) {

        // letter is first autoboxed to Wrapper Character from char
        Character letter = "Hello AutoBoxing".charAt(0);
        System.out.println(letter instanceof Character);

        // letter is then unboxed to a char type
        char unboxed = letter;
        System.out.println(unboxed);

        // Diamond operator may leave out types on the righthand side only to shorten
        // code
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(null);
        // int err = arr.get(0); //Throws a null pointer exception

    }
}
