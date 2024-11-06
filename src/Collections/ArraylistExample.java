package Collections;
import java.util.*;

public class ArraylistExample {
    public static void main(String[] args) {
        ArrayList<Object> al = new ArrayList<Object>();// allows all datatypes
        // ArrayList<Integer> al = new ArrayList(); //when we want to use specific
        // datatype
        // List al = new ArrayList(); //another syntax to create arraylist.

        al.add(100);
        al.add("Welcome");
        al.add(15.5);
        al.add(true);
        System.out.println(al); // [100, Welcome, 15.5, true]

        al.remove(1); // or al.remove("Welcome")
        System.out.println("After removing Welcome " + al); // after removing

        al.add(1, "Welcome");
        System.out.println("After adding a element" + al); // Inserting a element.

        System.out.println(al.get(1)); // retriving the "Welcome".

        al.set(3, false);// replacing the element.
        System.out.println(al);

        System.out.println(al.contains(false)); // Searching -return true/false.

        System.out.println("No. of elements are " + al.size());// to display size.

        System.out.println(al.isEmpty()); // checking the arraylist is empty or not.

        // to read the elements in arraylist
        // 1.for loop
        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
        }
        // 2. for..each
        for (Object i : al) {
            System.out.println(i);
        }
        // 3.iterator()
        Iterator <Object> obj = al.iterator();
        while (obj.hasNext()) {
            System.out.println(obj.next());
        }

        // adding elements from one arraylist to anotherarraylist
        ArrayList <Object> al_dup = new ArrayList <Object>();
        al_dup.addAll(al);
        System.out.println(al_dup);

        // removing all elements from an arraylist.
        al_dup.removeAll(al);
        System.out.println(al_dup);

        // //Sort... Collections.sort()
        // System.out.println("Elements in the arraylist:" +al);
        // Collections.sort(al);
        // System.out.println("Elements after sorting:"+al);
        // //it is not working bcz datatypes i have used everything so it can't sort

        Collections.sort(al,Collections.reverseOrder());//it also not worked now.

        Collections.shuffle(al);
        System.out.println("Elements after shuffle" + al); // elements shuffle with index

        // create a string array and convert string array to arraylist.
        String arr[] = { "kkr", "kpr", "kar" };
        for (String val : arr) {
            System.out.println(val);
        }
        ArrayList<Object> all = new ArrayList<Object>(Arrays.asList(arr));
        System.out.println(all);
    }
}
