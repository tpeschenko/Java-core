package org.task4;

public class WrongLoginException extends Exception {
    private static final String MESSAGE = "Длина логина меньше 20 символов.";

    public WrongLoginException(){
        this(MESSAGE);
    }

    public WrongLoginException(String message) {
        super(message);
    }
}

