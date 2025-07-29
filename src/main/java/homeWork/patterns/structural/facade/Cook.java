package homeWork.patterns.structural.facade;

public class Cook {
    public void prepareCook(OrderMenuInKitchen order) {
        if (order.isActiveOrdering()){
            System.out.println("Cook prepare food");
        } else {
            System.out.println("Cook cuts blanks");
        }
    }
}
