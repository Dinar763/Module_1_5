package homeWork.patterns.structural.proxy;

public class RealSecretObject implements SecretObject {
    @Override
    public void giveAccess() {
        System.out.println("Доступ к секретному обьекту получен");
    }
}
