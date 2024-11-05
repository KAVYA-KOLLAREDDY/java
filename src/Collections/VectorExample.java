package Collections;

import java.util.Arrays;
import java.util.Vector;

public class VectorExample {
    public static void main(String args[]){
       Vector<String> v1 = new Vector<>();

       int[] arr1= new int[]  {1,2,3,4,5,6,7};
       Vector<Object> v4=new Vector<Object>(Arrays.asList(arr1));
System.out.println(v4);
       Vector<Object> v5=new Vector<>(200);
System.out.println(v5.capacity());
       v1.add("kkr");
       v1.add("kar");
       v1.add("kpr");
       v1.add("rrp");


       Vector<String> v2= new Vector<>();

       //methods for vctor

       v1.add("pramila");
       v2.addAll(v1);
       v1.size();
       v1.capacity();
       v1.get(1);
       System.out.println(v1.firstElement());
      System.out.println( v1.lastElement());
       v1.remove(4);
       v1.set(3,"Kavya");

        System.out.print(v1);
        System.out.println(v2);
        Object[] arr=v1.toArray();
for(Object element:arr){

        System.out.println(element);
    }
}
}
