package Chapter_06_Command_Pattern.Diner;

public class Waitress {
    Order order;

    public Waitress(){}

    public void takeOrder(Order order){
        this.order = order;
        order.orderUp();
    }
}
