package Chapter_07_Adapter_Facade_Pattern.Duck;

public class TurkeyTestDrive {
    public static void main(String[] args) {
        Turkey turkey = new WildTurkey();

        Duck duck = new MallardDuck();
        Turkey duckPretendToBeTurkey = new DuckAdapter(duck);

        System.out.println("I am a real turkey....");
        turkey.gobble();
        turkey.fly();

        System.out.println("---------------------------");

        System.out.println("Duck pretending to be a turkey...");
        duckPretendToBeTurkey.gobble();
        duckPretendToBeTurkey.fly();
    }
}
