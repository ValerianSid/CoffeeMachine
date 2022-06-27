package coffemachine.entity.containers;

import coffemachine.entity.drinks.Drink;

public class CoffeeContainer extends Container{
    public CoffeeContainer(int capacity) {
        super(capacity);
        this.name="контейнер для кофе";
    }

    public void make(Drink drink) {
        capacity = capacity - drink.getCoffee();
    }
    @Override
    public boolean checkcontainers(Drink drink) {
        if(capacity > drink.getCoffee()){
            return true;
        }
        return false;
    }

}
