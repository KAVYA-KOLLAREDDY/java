package Collections;

public class ExceptionsExample {
    public static void main(String[] args) {
            try {
                checkEligibility(17); 
                checkEligibility(20); 
            } catch (InvalidAgeException e) {
                System.out.println("Exception caught: " + e.getMessage());
            }
        }
    
        public static void checkEligibility(int age) throws InvalidAgeException {
            if (age < 18) {
                throw new InvalidAgeException("Age must be at least 18 to vote.");
            }
            System.out.println("Eligible to vote.");
        }
    }
    
    class InvalidAgeException extends Exception {
        public InvalidAgeException(String message) {
            super(message);
        }
    }
    
}
