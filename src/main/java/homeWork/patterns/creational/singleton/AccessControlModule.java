package homeWork.patterns.creational.singleton;

public class AccessControlModule {
    private static volatile AccessControlModule accessControlModule;
    private Boolean control = false;

    public static AccessControlModule getAccessControlModule() {
        if (accessControlModule == null) {
            accessControlModule = new AccessControlModule();
        }
        return accessControlModule;
    }

    private AccessControlModule(){
    }

    public void getControl() {
        control = true;
    }

    public void showControl() {
        if (control) {
            System.out.println("Контроль управления доступом получен");
        } else {
            System.out.println("Контроль управления доступом не получен");
        }
    }
}
