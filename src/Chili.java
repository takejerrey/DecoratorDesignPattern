class Chili extends Decorator{
    public Chili(FoodItem item) {
         super(item);
    }

    public double cost() {
        return 2.2;
    }
}
