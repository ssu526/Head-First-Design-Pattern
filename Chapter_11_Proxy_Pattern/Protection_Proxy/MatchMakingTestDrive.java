package Chapter_11_Proxy_Pattern.Protection_Proxy;

import java.lang.reflect.Proxy;
import java.util.HashMap;

public class MatchMakingTestDrive {
    HashMap<String, Person> datingDB = new HashMap<>();

    public static void main(String[] args) {
        MatchMakingTestDrive test = new MatchMakingTestDrive();
        test.drive();
    }

    public MatchMakingTestDrive(){
        initializeDatabase();
    }

    public void drive(){
        Person peter = getPersonFromDatabase("peter Javabean");
        Person ownerProxy = getOwnerProxy(peter);
        System.out.println("Name is " + ownerProxy.getName());
        ownerProxy.setInterests("bowling, Go");
        System.out.println("Interest set from owner proxy");

        try{
            ownerProxy.setHotOrNotRating(10);
        }catch (Exception e){
            System.out.println("Can't set rating from owner proxy");
        }
        System.out.println("Rating is " + ownerProxy.getHotOrNotRating());

        Person nonOwnerProxy = getNonOwnerProxy(peter);
        System.out.println("Name is " + nonOwnerProxy.getName());

        try {
            nonOwnerProxy.setInterests("bowling, Go");
        } catch (Exception e) {
            System.out.println("Can't set interests from non owner proxy");
        }
        nonOwnerProxy.setHotOrNotRating(3);
        System.out.println("Rating set from non owner proxy");
        System.out.println("Rating is " + nonOwnerProxy.getHotOrNotRating());
    }


    Person getOwnerProxy(Person person){
        return (Person) Proxy.newProxyInstance(
                person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new OwnerInvocationHandler(person)
        );
    }

    Person getNonOwnerProxy(Person person){
        return (Person) Proxy.newProxyInstance(
                person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new NonOwnerInvocationHandler(person)
        );
    }

    Person getPersonFromDatabase(String name){
        return (Person)datingDB.get(name);
    }

    void initializeDatabase() {
        Person peter = new PersonImpl();
        peter.setName("peter Javabean");
        peter.setInterests("cars, computers, music");
        peter.setHotOrNotRating(7);
        datingDB.put(peter.getName(), peter);

        Person kelly = new PersonImpl();
        kelly.setName("Kelly Klosure");
        kelly.setInterests("ebay, movies, music");
        kelly.setHotOrNotRating(6);
        datingDB.put(kelly.getName(), kelly);
    }
}
