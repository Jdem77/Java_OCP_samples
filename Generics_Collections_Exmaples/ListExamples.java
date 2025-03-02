package Generics_Collections_Exmaples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

// List is an ordered collection of elements that allows duplicates.
// List is an interface that extends Collection.
// ArrayList and LinkedList are classes that extend List.

public class ListExamples {

    public static void main(String[] args) {
        List<String> arr = new ArrayList<String>();
        List<String> que = new LinkedList<>();

        String[] array = { "a", "b", "c", "d" };
        List<String> asList = Arrays.asList(array); // returns a fixed-size list backed by the specified array, can
        // replace but not add or delete ele

        List<String> of = List.of(array); // returns immutable list that but cannot add, replace or delete elements

        List<String> copy = List.copyOf(asList); // return immutable list with copy of original collection values,
        // cannot add,replace,delete elements

        array[0] = "z";
        System.out.println(asList); // changes
        System.out.println(of); // does not change
        System.out.println(copy); // does not change

        asList.set(0, "x");
        System.out.println(Arrays.toString(array)); // original array changes

        // List Methods
        /*
         * boolean add(E e) - adds an element to the end of list
         * void add(int index, E element) - adds an element at specified index
         * E get(int idx) - returns the ele at specified index
         * E remove(int idx) - removes the ele at specified index
         * void replaceAll(UnaryOperator<E> op) - replaces all elements with the result
         * of applying the operator
         * E set(int idx, E e) - replaces the ele at specified index with specified ele
         */
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add(0, "b");
        list.set(1, "c");
        list.remove("b");

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
        nums.replaceAll(x -> x * 2);

        // iterate a list
        for (String s : list) {
            System.out.println(s);
        }

        Iterator<Integer> iter = nums.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
