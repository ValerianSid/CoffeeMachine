package coffemachine.entity.containers;

import coffemachine.entity.drinks.Drink;

public class GarbageContainer extends Container {
    private int currentState;

    public GarbageContainer(int capacity) {
        super(capacity);
        this.name="контейнер для мусора";
        this.currentState=0;
    }

    @Override
    public boolean isEmpty() {
        return currentState<capacity;
    }

    public void make(Drink drink) {
        capacity = capacity + 1;
    }
}
