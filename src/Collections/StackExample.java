package Collections;
import java.util.*;
public class StackExample {
  public static void main(String[] args) {
        Stack<Object> s=new Stack<Object>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.pop();
        Iterator <Object> itr=s.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
