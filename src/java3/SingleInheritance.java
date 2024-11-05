package java3;
class Animal {
    void eat() {
        System.out.println("This animal can eat");
    }
}
class Dog extends Animal {
    void eat() {
        System.out.println("The dog can bark");
    }
}
public class SingleInheritance {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.eat();
    }
}
