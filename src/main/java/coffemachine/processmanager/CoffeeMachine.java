package coffemachine.processmanager;


import coffemachine.entity.containers.CoffeeContainer;
import coffemachine.entity.containers.GarbageContainer;
import coffemachine.entity.containers.MilkContainer;
import coffemachine.entity.containers.WaterContainer;
import coffemachine.entity.drinks.BlackCoffee;
import coffemachine.entity.drinks.Capuchino;
import coffemachine.entity.drinks.Drink;
import coffemachine.entity.drinks.HotMilk;
import coffemachine.services.IOService;
import coffemachine.services.IOServiceImpl;

import java.io.IOException;

public class CoffeeMachine {
    private CoffeeContainer coffeContainer;
    private GarbageContainer garbageContainer;
    private MilkContainer milkContainer;
    private WaterContainer waterContainer;
    private IOService ioService;
    private BlackCoffee blackCoffee;
    private Capuchino capuchino;
    private HotMilk hotMilk;

    public CoffeeMachine() {
        this.coffeContainer = new CoffeeContainer(10);
        this.garbageContainer = new GarbageContainer(0);
        this.milkContainer = new MilkContainer(3);
        this.waterContainer = new WaterContainer(3);
        this.ioService = new IOServiceImpl();
        this.blackCoffee = new BlackCoffee();
        this.capuchino = new Capuchino();
        this.hotMilk = new HotMilk();
    }

    public void run(){
        operationChoose();
    }

    private void operationChoose() {
        ioService.write("Выберите операцию:");
        ioService.write("Наберите 1 для черного кофе");
        ioService.write("Наберите 2 для капучино");
        ioService.write("Наберите 3 для горячего молока");
        ioService.write("Наберите 4 для просмотра заполненности контейнеров");
        Integer operation = readOperation();
        switch (operation) {
            case 0:
                ioService.write("Попробуйте снова");
                operationChoose();
                break;
            case 1:
                makedrink(blackCoffee);
                break;
            case 2:
                makedrink(capuchino);
                break;
            case 3:
                makedrink(hotMilk);
                break;
            case 4:
                currentCapacity();
                break;
        }
    }


    private int readOperation() {
        int i = ioService.read();
        if(i > 4){
            return 0;
        }
        return i;
    }
    private void makedrink(Drink drink){
        if(checkcontainers(drink)) {
            coffeContainer.make(drink);
            garbageContainer.make(drink);
            milkContainer.make(drink);
            waterContainer.make(drink);
            ioService.write(drink.getName() + " готов");
            run();
        }
        ioService.write("Проверьте контейнеры");
    }

    private boolean checkcontainers(Drink drink){
        if (milkContainer.checkcontainers(drink) && waterContainer.checkcontainers(drink) && coffeContainer.checkcontainers(drink)
        && garbageContainer.checkcontainers(drink)){
            return true;
        }
        return false;
    }

    private void currentCapacity(){
        ioService.write(coffeContainer.getCapacity());
        ioService.write(milkContainer.getCapacity());
        ioService.write(waterContainer.getCapacity());
        ioService.write(garbageContainer.getCapacity());
    }

}