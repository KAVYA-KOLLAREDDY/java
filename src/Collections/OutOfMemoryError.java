package Collections;

public class OutOfMemoryError {
    public static void main(String[]args){
        
        while(true){
            int[] array = new int[Integer.MAX_VALUE];
        }
    }
}
