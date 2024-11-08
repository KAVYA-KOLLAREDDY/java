package OOPs;

class Animal {
    void sound() {
        System.out.println("This Animal makes a sound");
    }
}
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("The dog barks");
    }
}
class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("The cat meows");
    }
}
public class PolymorphismExample {
    public static void main(String[] args) {
        Animal myAnimal = new Dog();
        myAnimal.sound();

    }
}
