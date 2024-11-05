package Collections;
import java.util.*;

public class LinkedListExample {
    public static void main(String[] args) {
    
    
    //LinkedList <Integer> l = new ListedList<Integer>();
    //LinkedList <String> l = new ListedList<String>();
    LinkedList<Object> l=new LinkedList<>(); 

    l.add(100);
    l.add("Welcome");
    l.add(15.5);
    l.add(true);
    l.add(null);
    System.out.println(l);

    l.remove(1);
    System.out.println("After removing list"+l);

    l.add(1,"Welcome");
    System.out.println("After inserting"+l);

    System.out.println(l.size());//size

    System.out.println(l.get(3));//retriving 

    l.set(3,false);
    System.out.println("After replacing"+l);

    System.out.println(l.contains("Welcome"));

    System.out.println(l.isEmpty());


    //Iterating the loop
    for(int i=0;i<=l.size();i++){
        System.out.println(i);
    }

    for(Object i : l){
        System.out.println(i);
    }

    Iterator<Object> obj = l.iterator();
    while(obj.hasNext()){
        System.out.println(obj.next());
    }

    LinkedList<Object> l_dup=new LinkedList<Object>();
    l_dup.addAll(l);
    System.out.println(l_dup);

    l_dup.removeAll(l);
    System.out.println(l_dup);

    // Collections.sort(l);
    // System.out.println(l);

    // Collections.sort(l,Collections.reverseOrder();
    // System.out.println(l);

    Collections.shuffle(l);
    System.out.println("After Shuffle"+l);

    //Queue methods
    l.addFirst("Dog");
    l.addLast("Leo");
    System.out.println(l);

    System.out.println(l.getFirst());
    System.out.println(l.getLast());

    l.removeLast();
    l.removeFirst();
    System.out.println(l);
} 
}

