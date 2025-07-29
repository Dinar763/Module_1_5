package homeWork.patterns.structural.facade;

public class Workflow {
    Cook cook = new Cook();
    Food food = new Food();
    OrderMenuInKitchen order = new OrderMenuInKitchen();

    public void doOrders() {
        food.cook();
        order.startCooking();
        cook.prepareCook(order);
    }
}
