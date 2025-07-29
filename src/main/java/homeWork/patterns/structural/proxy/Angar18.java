package homeWork.patterns.structural.proxy;

import java.io.Console;
import java.util.Objects;
import java.util.Scanner;

public class Angar18 implements SecretObject {
    private RealSecretObject realSecretObject;
    private String validParole;
    private String valiKey;

    public Angar18(String valiKey, String validParole) {
        this.valiKey = valiKey;
        this.validParole = validParole;
    }

    @Override
    public void giveAccess() {
        if (checkKeyAndParole()) {
            if (realSecretObject == null) {
                realSecretObject = new RealSecretObject();
            }
            realSecretObject.giveAccess();
        } else {
            System.out.println("Доступ запрещен!!!");
        }
    }

    private boolean checkKeyAndParole() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите включ: ");
        String inputKey = scanner.nextLine();
        System.out.print("Введите пароль: ");
        String inputParole = scanner.nextLine();
        return valiKey.equals(inputKey) && validParole.equals(inputParole);
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        Angar18 angar18 = (Angar18) object;
        return Objects.equals(realSecretObject, angar18.realSecretObject)
                && Objects.equals(validParole, angar18.validParole) && Objects.equals(valiKey, angar18.valiKey);
    }

    @Override
    public int hashCode() {
        return Objects.hash(realSecretObject, validParole, valiKey);
    }
}
