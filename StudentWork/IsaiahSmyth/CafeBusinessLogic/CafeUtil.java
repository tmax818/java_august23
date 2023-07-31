


import java.util.ArrayList;
import java.util.Scanner;

public class CafeUtil {

    public int getStreakGoal() {
        int sum = 0;
        for(int i=1; i<=10; i++){
            sum += i;
        }
        return sum;    //This will return 55
    }

    public double getOrderTotal(double[] prices) {
        double total = 0;
        for (double price : prices) {
            total += price;
        }
        return total;   //This will return the sum of the price
    }

    public void displayMenu(ArrayList<String> menuItems) {
        for  (int i=0; i<menuItems.size(); i++){
            System.out.println(i+" " + menuItems.get(i));   //This will drip coffee, cappuccino, latte, mocha
        }
    }

    public void addCustomer(ArrayList<String> customers) {
        System.out.println("Please enter your name: ");
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        System.out.printf("Hello, " + username + "!");
        // System.out.printf("There are " + customers.size() );
        customers.add(username);
        System.out.println(customers);
        // scanner.close();
    }
}