import java.util.ArrayList;
import java.util.Arrays;
public class CafeUtil {
    public int getStreakGoal() {
        int sum = 0;
        for (int i = 0; i< 11; i++) {
            sum += i;
        }
        System.out.println(sum);
        return sum;
    }

    public double getOrderTotal(double[] lineItems) {
        double total = 0.0;
        for (int i=0; i<lineItems.length; i++) {
            total += lineItems[i];
        }
        System.out.println(total);
        return total;
    }

    public void displayMenu(ArrayList<String> menu) {
        for (int i=0; i < menu.size(); i++) {
            System.out.println(i + " " + menu.get(i));
        }
    }

    public void addCustomer(ArrayList<String> customers) {
        System.out.println("Please enter your name.");
        String username = System.console().readLine();
        System.out.printf("Hello, " + username + "!");
        int persons = customers.size();
        System.out.printf("There are" + " " + persons + " " + "people ahead of you.");
        customers.add(username);
        System.out.println(customers);
    }

}