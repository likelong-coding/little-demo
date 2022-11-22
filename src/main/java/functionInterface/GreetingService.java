package functionInterface;

/**
 * @author likelong
 * 函数式接口(Functional Interface)就是一个有且仅有一个抽象方法，但是可以有多个非抽象方法的接口。
 */
@FunctionalInterface
public interface GreetingService {
    void sayMessage(String message);
}
