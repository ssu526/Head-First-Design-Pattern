package Chapter_09_Iterator_Composite_Pattern.MenuIterator_Composite_Iterator;

public class MenuTestDrive {
    public static void main(String[] args) {
        MenuComponent dinerMenu = new Menu("Diner MENU", "Lunch");
        MenuComponent dessertMenu = new Menu("DESSERT MENU", "Dessert");
        MenuComponent cafeMenu = new Menu("Cafe MENU", "Dinner");
        MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU", "Breakfast");

        MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");
        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        dinerMenu.add(new MenuItem("Pasta", "Spagehetti with marinara sauce, and a slice of sourdough bread", true, 3.89));
        dinerMenu.add(new MenuItem("BLT", "Bacon with lettuce and tomato on whole wheat", false, 2.99));
        dinerMenu.add(new MenuItem("Vegetarian BLT", "(Fakin) Bacon with lettuce and tomato on whole wheat", true, 2.99));
        dinerMenu.add(new MenuItem("Soup of the day", "A bowl of the soup of the day, with a side of potato salad", true, 3.29));
        dinerMenu.add(new MenuItem("Hotdog", "A hot dog, with saurkraut, relish, onions, topped with cheese", false, 3.05));
        dinerMenu.add(new MenuItem("Steamed Veggies and Brown Rice", "Steamed vegetables over brown rice", true, 3.99));
        dinerMenu.add(dessertMenu);
        dessertMenu.add(new MenuItem("Apple Pie", "Applie pie with a flakey crust, topped with vanilla icecream", true, 1.59));
        dessertMenu.add(new MenuItem("Cheesecake", " Creamy New York cheesecake, with a chocolate graham crust", true, 1.99));
        dessertMenu.add(new MenuItem("Sorbet", "A scoop of raspberry and a scoop of lime", true, 1.89));

        cafeMenu.add(new MenuItem("Veggie Burger and Air Fries", "Veggie burger on a whole wheat bun, lettuce, tomato, and fries", true, 3.99));
        cafeMenu.add(new MenuItem("Soup of hte day", "A cup of the soup of the day, with a side salad", false, 3.69));
        cafeMenu.add(new MenuItem("Burrito", "A large burrito, with whole pinto beans, salsa, guacamole", true, 4.29));

        pancakeHouseMenu.add(new MenuItem("K&B's Pancake Breakfast", "Pancakes with scrambled eggs, and toast", true, 2.99));
        pancakeHouseMenu.add(new MenuItem("Regular Pancake Breakfast", "Pancakes with fried eggs, sausage", false, 2.99));
        pancakeHouseMenu.add(new MenuItem("Blueberry Pancakes", " Pancakes made with fresh blueberries, and blueberry syrup", true, 3.49));
        pancakeHouseMenu.add(new MenuItem("Waffles", " Waffles, with your choice of blueberries or strawberries", true, 3.59));

        Waitress waitress = new Waitress(allMenus);
        waitress.printVegetarianMenu();
    }
}
