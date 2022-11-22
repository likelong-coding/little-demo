package builder;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * @author likelong
 * @date 2022/11/21
 */
public class Builder<T> {

    /**
     * 存储调用方 指定构造类的 构造器
     */
    private final Supplier<T> constructor;

    /**
     * 存储 指定类 所有需要初始化的类属性
     */
    private final List<Consumer<T>> dInjects = new ArrayList<>();

    private Builder(Supplier<T> constructor){
        this.constructor = constructor;
    }

    public static <T> Builder<T> builder(Supplier<T> constructor){
        return new Builder<>(constructor);
    }

    public <P1> Builder<T> with(Builder.DInjectConsumer<T, P1> consumer , P1 p1){
        Consumer<T> c = instance -> consumer.accept(instance, p1);
        dInjects.add(c);
        return this;
    }

    public T build(){
        // 调用Supplier 生成类实例
        T instance = this.constructor.get();

        // 调用传入的Setter方法，完成属性初始化
        dInjects.forEach(dInject -> dInject.accept(instance));
        // 返回建造完成的类实例
        return instance;
    }

    @FunctionalInterface
    public interface DInjectConsumer<T, P1>{
        void accept(T t, P1 p1);
    }
}
