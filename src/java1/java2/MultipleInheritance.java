package java1.java2;

public class MultipleInheritance extends Inheritance{
    public static void main(String[]args){
        Inheritance obj = new Inheritance();
        SingleInheritance obj2 = new SingleInheritance();
        obj2.Oops();
        Inheritance.age = 21;
        System.out.println("Your name is "+obj.name+" and your age is "+obj.age);
        
    }
    
}
