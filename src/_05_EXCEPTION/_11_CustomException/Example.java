package _05_EXCEPTION._11_CustomException;

public class Example{
   static class InvalidAgeException extends Exception {
        InvalidAgeException(String s) {
            super(s);
        }
    }

    static void validate(int age) throws InvalidAgeException {
       if(age < 18){
           throw new InvalidAgeException("not valid");
       }
        else {
           System.out.println("welcome to vote");
       }
    }

    public static void main(String[] args) {
        try {
            validate(13);
        } catch (Exception m){
            System.out.println("Exception occured: " + m);
        }
        System.out.println("rest of the code ...");
    }
}
