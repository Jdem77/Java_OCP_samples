package Generics_Collections_Exmaples;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/* 
 *  boolean add() - adds an ele to a collection and returns if ele was added succesfully
 *  boolean remove() - removes an ele from a collection and returns if ele was removed succesfully
 *  boolean isEmpty() - returns if a collection is empty
 *  int size() - returns the number of elements in a collection
 *  void clear() - removes all elements from a collection
 *  boolean contains(Object o) - returns if a collection contains a specified ele
 *  boolean containsAll(Collection<?> c) - returns if a collection contains all elements of another collection
 *  boolean addAll(Collection<? extends E> c) - adds all elements of a collection to another collection
 *  boolean removeAll(Collection<?> c) - removes all elements of a collection from another collection
 */
public class CommonCollectionMethodsExample {
    public static void main(String[] args) {
        List<String> ls = new ArrayList<String>();
        Set<String> set = new HashSet<String>();
        Queue<String> q = new LinkedList<String>();
        Map<String, String> map = new HashMap<>();

        boolean added1 = ls.add("ele1");
        boolean added2 = set.add("ele2");
        boolean added3 = q.add("ele3");
        map.put("1", "hey");

        System.out.println(ls.contains("ele1"));
        System.out.println(set.contains("ele2"));
        System.out.println(q.contains("ele3"));
        System.out.println(map.containsKey("1"));

        boolean wasRemoved1 = ls.remove("ele1");
        boolean wasRemoved2 = set.remove("ele2");
        boolean wasRemoved3 = q.remove("ele3");
        map.remove("1");

        ls.add("cannot");
        ls.add("remove");
        ls.add("using");
        ls.add("for-each");
        // for (String s : ls) {
        // ls.remove(s);
        // }
        // above loop throws ConcurrentModificationException

        // regular for loop is ok
        for (int i = 0; i < ls.size(); i++) {
            ls.remove(i);
        }
        ls.removeIf(s -> s.startsWith("A"));
        set.removeIf(s -> s.startsWith("A"));
        q.removeIf(s -> s.startsWith("A"));

        ls.forEach(System.out::println);
        set.forEach(System.out::println);
        q.forEach(System.out::println);
        map.forEach((k, v) -> System.out.println(k + " " + v));

        System.out.println(ls.isEmpty());
        System.out.println(set.isEmpty());
        System.out.println(q.isEmpty());
        System.out.println(map.isEmpty());

        ls.clear();
        set.clear();
        q.clear();
        map.clear();

    }
}
