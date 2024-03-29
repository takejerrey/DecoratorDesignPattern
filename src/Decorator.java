abstract class Decorator implements FoodItem{
    private FoodItem item;

    public Decorator(FoodItem item){
        this.item = item;
    }

    @Override
    public double cost() {
        return item.cost();
    }
}
