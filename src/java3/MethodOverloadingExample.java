package java3;
class Animal{
    int a;
    void sound(){
        System.out.println("This animal makes a sound");
    }
    void sound(String animalType){
        System.out.println("This" + animalType + " makes a sound");
    }
    void sound(int times){
        System.out.println("This animal makes a sound" + times + "times.");
    }
}
public class MethodOverloadingExample {
    public static void main(String[] args){
        Animal animal = new Animal();
        
        animal.sound("Dog");
        animal.sound(3);
    }
}
