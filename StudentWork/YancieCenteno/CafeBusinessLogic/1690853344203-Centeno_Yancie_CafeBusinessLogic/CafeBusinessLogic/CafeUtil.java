import java.util.ArrayList;
import java.util.Arrays;

public class CafeUtil {
    public int getStreakGoal(int numWeeks){
        int sum = 0;
        for (int i = 1; i <= numWeeks; i++ ){
            sum += i;
        }
        return sum;
    }

    public double getOrderTotal(double[] prices){
        int sum = 0;
        for (int i = 0; i < prices.length; i++){
            sum += prices[i];
        }
        return sum;
    }

    public void displayMenu(ArrayList<String> menuItems){
        for (String menu : menuItems){
            System.out.println(menu);
        }
    }

    public void addCustomer(ArrayList<String> customers){
        System.out.println("Please enter your name:");

        //This allows to type into console
        String username = System.console().readLine();
        String newCustomer = String.format("Hello, %s!", username);
        System.out.println(newCustomer);

        int totalCustomer = customers.size(); 

        String currentCustomer = String.format("There are %d people in front of you.", totalCustomer);
        System.out.println(currentCustomer);

        for(String customer : customers){ 
            System.out.println(customer);
        }

        customers.add(username); 
    }
}