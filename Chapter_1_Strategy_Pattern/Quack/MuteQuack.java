package Chapter_1_Strategy_Pattern.Quack;

public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("<< Silent >>");
    }
}
