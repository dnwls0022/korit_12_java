package ch21_exception.age_exception;

public class InvalidAgeEception extends  Exception{
    public InvalidAgeEception(String message) {
        super(message);
    }
}
