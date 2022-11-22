package functionInterface.test;

import functionInterface.GreetingService;

/**
 * @author likelong
 * @date 2022/11/22
 */
public class Main {

    public static void main(String[] args) {
        // Lambda表达式来表示该接口的一个实现
        GreetingService greetingService = message -> System.out.println("Hello " + message);

        greetingService.sayMessage("world");
    }
}
