package coffemachine.processmanager;


import coffemachine.entity.containers.CoffeeContainer;
import coffemachine.entity.containers.GarbageContainer;
import coffemachine.entity.containers.MilkContainer;
import coffemachine.entity.containers.WaterContainer;
import coffemachine.services.IOService;
import coffemachine.services.IOServiceImpl;

public class CoffeeMachine {
    private CoffeeContainer coffeContainer;
    private GarbageContainer garbageContainer;
    private MilkContainer milkContainer;
    private WaterContainer waterContainer;
    private IOService ioService;

    public CoffeeMachine() {
        this.coffeContainer = new CoffeeContainer(10);
        this.garbageContainer = new GarbageContainer(5);
        this.milkContainer = new MilkContainer(3);
        this.waterContainer = new WaterContainer(6);
        this.ioService = new IOServiceImpl();
    }


    private void operationChoose() {
        ioService.write("Выберите операцию:");
        ioService.write("Наберите 1 для черного кофе");
        ioService.write("Наберите 2 для капучино");
        ioService.write("Наберите 3 для горячего молока");
        ioService.write("Наберите 4 для просмотра заполненности контейнеров");
        ioService.write("Наберите 5 для выхода");
        Integer operation = ioService.read();
        switch (operation) {
            case 1:
                break;
            case 2:

                break;
            case 3:

                break;
            case 4:

                break;
            case 5:

                break;
        }
    }


}