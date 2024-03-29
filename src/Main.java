import java.beans.Customizer;

public class Main {
    public static void main(String[] args) {
        FoodItem burger = new Burger();
        FoodItem fries = new Fries();
        FoodItem hotDog = new HotDogs();
        Order order = new Order();
        Double discount = .15;

        burger = new Cheese(burger);
        fries = new Chili(fries);
        fries = new Cheese(fries);
        hotDog = new Chili(hotDog);

        order.addItem(burger);
        order.addItem(fries);
        order.addItem(hotDog);

        System.out.println("Total without loyalty discount: $" + order.getTotal());
        System.out.print("Total AFTER loyalty discount: $" + LoyaltyProgram.discount(order.getTotal(), discount));

    }
}