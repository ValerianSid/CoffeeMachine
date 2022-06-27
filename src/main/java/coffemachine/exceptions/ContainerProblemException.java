package coffemachine.exceptions;

public class ContainerProblemException extends Exception{
    public ContainerProblemException(String name) {
        super("Проверьте контейнер " + name);
    }
}
