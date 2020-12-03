package ru.job4j.ex;

public class ElementNotFoundException extends Exception {
    public ElementNotFoundException() {
          super("Element is not found");
    }
}
