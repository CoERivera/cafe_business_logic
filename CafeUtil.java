import java.util.ArrayList;
import java.text.NumberFormat;

public class CafeUtil {

    // Calculates the amount of drinks you need after x amount of weeks.
    // If the number of weeks isn't set, it defaults to 10.
    int getStreakGoal() {
        int drinkAmount = 0;
        for (int i = 1; i <= 10; i++) {
            drinkAmount += i;
        }
        return drinkAmount;
    }

    // Method overload for weeks specified.
    int getStreakGoal(int numWeeks) {
        int drinkAmount = 0;
        for (int i = 1; i <= numWeeks; i++) {
            drinkAmount += i;
        }
        return drinkAmount;
    }

    // Obtains all the items to calculate the total amount owed for the order.
    double getOrderTotal(double[] prices) {
        double orderTotal = 0.0;
        for (double price : prices) {
            orderTotal += price;
        }
        return orderTotal;
    }

    // Display array of items in the menu
    void displayMenu(ArrayList<String> menuItems) {
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.printf("%d. %s \n", i + 1, menuItems.get(i));
        }
        System.out.print("\n");
    }

    // Adds a customer to an array
    ArrayList<String> addCustomer(ArrayList<String> customers) {
        System.out.print("Please enter your name: ");
        String userName = System.console().readLine();

        System.out.print("\nHello, " + userName + "! ");

        if (customers.size() == 1) {
            System.out.println("There is 1 person ahead of you.");
        } else {
            System.out.println("There are " + customers.size() + " people ahead of you.");
        }

        customers.add(userName);

        for (int i = 0; i < customers.size(); i++) {
            System.out.printf("%d. %s \n", i + 1, customers.get(i));
        }

        return customers;
    }

    // Gives price chart for item and the max amount you can buy, along with price
    // and discounts
    void printPriceChart(String product, double price, int maxQuantity) {
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        double discount = 0.0;
        System.out.println(product + ":");

        for (int i = 1; i <= maxQuantity; i++) {
            System.out.printf("%d - %s%n", i, formatter.format((price * i) - discount));
            discount += 0.5;
        }
    }
}
