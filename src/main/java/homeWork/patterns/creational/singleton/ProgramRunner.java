package homeWork.patterns.creational.singleton;

public class ProgramRunner {
    public static void main(String[] args) {
        AccessControlModule.getAccessControlModule().showControl();
        AccessControlModule.getAccessControlModule().showControl();
        AccessControlModule.getAccessControlModule().getControl();
        AccessControlModule.getAccessControlModule().showControl();
        System.out.println(AccessControlModule.getAccessControlModule().toString());
        System.out.println(AccessControlModule.getAccessControlModule().toString());
        System.out.println(AccessControlModule.getAccessControlModule().toString());
        System.out.println(AccessControlModule.getAccessControlModule().toString());

    }
}
