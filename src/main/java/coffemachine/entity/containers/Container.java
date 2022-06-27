package coffemachine.entity.containers;

import coffemachine.entity.drinks.Drink;

public abstract class Container {
    int capacity;
    String name;

    public Container(int capacity) {
        this.capacity = capacity;
    }

    public boolean isEmpty(){
        return capacity==0;
    }

    public abstract void make(Drink drink);

    public abstract boolean checkcontainers(Drink drink);

    public String getCapacity() {
        return name + " " + String.valueOf(capacity);
    }
}
