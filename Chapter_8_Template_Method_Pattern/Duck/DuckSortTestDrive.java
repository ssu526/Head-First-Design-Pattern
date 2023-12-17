package Chapter_8_Template_Method_Pattern.Duck;

import java.util.Arrays;

public class DuckSortTestDrive {
    public static void main(String[] args) {
        Duck[] ducks = {
                new Duck("Daffy", 8),
                new Duck("Dewey", 2),
                new Duck("Howared", 7),
                new Duck("Donald", 10),
                new Duck("Huey", 2)
        };

        System.out.println("Before sorting...");
        display(ducks);

        Arrays.sort(ducks);

        System.out.println("\nAfter sorting...");
        display(ducks);
    }

    private static void display(Duck[] ducks){
        for(Duck d: ducks){
            System.out.print(d + " | ");
        }
    }
}
