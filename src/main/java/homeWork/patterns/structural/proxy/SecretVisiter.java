package homeWork.patterns.structural.proxy;

import java.io.Console;

public class SecretVisiter {
    public static void main(String[] args) {
        SecretObject object = new Angar18("12345", "qwerty");
        object.giveAccess();
    }
}
