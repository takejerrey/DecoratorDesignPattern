import java.util.ArrayList;
import java.util.List;

class Order {
    private List<FoodItem> items = new ArrayList<>();
    public void addItem(FoodItem item) {
        items.add(item);
    }
    public double getTotal() {
        double total = 0.0;
        for (FoodItem item : items) {
            total += item.cost();
        }
        return total;
    }
}
