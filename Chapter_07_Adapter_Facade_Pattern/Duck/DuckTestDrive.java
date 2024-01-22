package Chapter_07_Adapter_Facade_Pattern.Duck;

public class DuckTestDrive {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();

        Turkey turkey = new WildTurkey();
        Duck turkeyPretendToBeDuck = new TurkeyAdapter(turkey);

        Drone drone = new SuperDrone();
        DroneAdapter dronePretendToBeDuck = new DroneAdapter(drone);

        System.out.println("I am a real duck...");
        duck.quack();
        duck.fly();

        System.out.println("---------------------------");

        System.out.println("Turkey tries to be a duck...");
        turkeyPretendToBeDuck.quack();
        turkeyPretendToBeDuck.fly();
;

        System.out.println("---------------------------");
        System.out.println("Drone tries to be a duck...");
        dronePretendToBeDuck.quack();
        dronePretendToBeDuck.fly();

    }
}
