package Chapter_06_Command_Pattern.Diner;

public class Customer {
    Waitress waitress;
    Order order;

    public Customer(Waitress waitress){
        this.waitress = waitress;
    }

    public void createOrder(Order order){
        this.order = order;
    }

    public void hungry(){
        waitress.takeOrder(order);
    }
}
