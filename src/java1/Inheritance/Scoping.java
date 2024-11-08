package java1.Inheritance;
public class Scoping {
    public void doSomething(){
        int x=12;
        {
            x=100;
            int q=96;
            System.out.println(x);
            System.out.println(q);
        }
        System.out.println(x);
    }
    public static void main(String[]args){
        Scoping obj= new Scoping(); 
        obj.doSomething();
    }
}
