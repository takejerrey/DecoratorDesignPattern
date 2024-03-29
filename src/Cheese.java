class Cheese extends Decorator{
    public Cheese(FoodItem item) {
        super(item);
    }
    public double cost() {
        return super.cost() + 1.1;
    }
}
