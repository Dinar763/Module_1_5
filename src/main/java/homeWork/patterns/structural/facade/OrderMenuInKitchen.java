package homeWork.patterns.structural.facade;

public class OrderMenuInKitchen {
    private boolean isNeedCooking;

    public boolean isActiveOrdering() {
        return isNeedCooking;
    }

    public void startCooking() {
        System.out.println("Заказ начал готовится");
        isNeedCooking = true;
    }

    public void finishCooking() {
        System.out.println("Заказ готов");
        isNeedCooking = false;
    }
}
