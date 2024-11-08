package FunctionalInterface;
interface Vehicle{
    void start();
    void stop();
}
class Car implements Vehicle{
    @Override
    public void start(){
        System.out.println("Car Started");
    }
    @Override
    public void stop(){
        System.out.println("Car stopped");
    }
}
public class AnonymousClass{
    public static void main(String[] args) {
        Vehicle v = new Vehicle(){
            @Override
            public void start(){
                System.out.println("Started");
            }
            @Override
            public void stop(){
                System.out.println("Stopped");
            }
        };
        v.start();
        v.stop();
    }
}