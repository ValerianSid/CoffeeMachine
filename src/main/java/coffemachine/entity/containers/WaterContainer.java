package coffemachine.entity.containers;

import coffemachine.entity.drinks.Drink;

public class WaterContainer extends Container{
    public WaterContainer(int capacity) {
        super(capacity);
        this.name="контейнер для воды";
    }

    public void make(Drink drink) {
        capacity = capacity - drink.getWater();
    }

    @Override
    public boolean checkcontainers(Drink drink) {
        if(capacity > drink.getWater()){
            return true;
        }
        return false;
    }
}
