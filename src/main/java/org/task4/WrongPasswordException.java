package org.task4;
public class WrongPasswordException extends Exception {
    private static final String MESSAGE = "Длина пароля меньше 20 символов.";

    public WrongPasswordException(){
        this(MESSAGE);
    }

    public WrongPasswordException(String message) {
        super(message);
    }
}