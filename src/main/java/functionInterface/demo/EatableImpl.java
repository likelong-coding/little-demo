package functionInterface.demo;

public class EatableImpl implements Eatable {
    @Override
    public void eat() {
        System.out.println("一日三餐，必不可少");
    }
}
