package java1;
import java1.java2.Person;

public class Main{
    public static void main(String[] args){
        Person john;
        john = new Person();
        john.name = "John Smith";
        john.age = 37;
        Person mary = new Person();
        mary.name = "Mary Brown";
        mary.age = 33;
        mary.birthday();
        john.birthday();
    }
}