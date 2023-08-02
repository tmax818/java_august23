import java.util.ArrayList;

public class CafeUtil {
    public int getStreakGoal() {
        int numWeeks = 10;
        int sum = 0;
        for (int i = 1; i <= numWeeks; i++) {
            sum += i;
        }
        return sum;
    }

    public double getOrderTotal(double[] prices) {
        double sum = 0;
        for (double price : prices) {
            sum += price;
        }
        return sum;
    }

    public void displayMenu(ArrayList<String> menuItems) {
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.printf("%d. %s\n", i + 1, menuItems.get(i));
        }
    }

    public void addCustomer(ArrayList<String> customers) {
        System.out.println("Please enter your name:");
        String username = System.console().readLine();
        System.out.printf("Hello, %s!\n", username);
        int numAhead = customers.size();
        System.out.printf("There are %d people in front of you.\n", numAhead);
        customers.add(username);
        System.out.println(customers);
    }
}