package ru.netolodgy.qa.javaqa16_Collections;

public class NotRegisteredException extends RuntimeException {
    public NotRegisteredException(String playerName) {
        //super(s);
        super("A player named" + playerName + "was not found");
    }
}
