package coffemachine.entity.containers;

import coffemachine.entity.drinks.Drink;

public class MilkContainer extends Container {
    public MilkContainer(int capacity) {
        super(capacity);
        this.name="контейнер для молока";
    }

    public void make(Drink drink) {
        capacity = capacity - drink.getMilk();
    }
    @Override
    public boolean checkcontainers(Drink drink) {
        if(capacity > drink.getMilk()){
            return true;
        }
        return false;
    }
}
