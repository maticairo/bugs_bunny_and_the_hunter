package main.java.exceptions;

public class InvalidAnimalException extends Exception{
    /**
     * @param message
     */
    public InvalidAnimalException(String message) {
        super(message);
    }
}
