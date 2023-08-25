import java.util.ArrayList; 

public class CafeUtil{
    public static void main(String[] args) {

    }

    public int getStreakGoal(){
        int total = 0;
        for(int i = 1; i<=10; i++){
            total = total + i;
        }
        return total;
    }

    public double getOrderTotal(double[] prices){
        double total = 0;
        for(int i = 0; i<prices.length; i++){
            total = total + prices[0];
        }
        return total;
    }

    public void displayMenu(ArrayList<String> menuItems){
        for(int i = 0; i<menuItems.size(); i++){
            System.out.print(i + " " + menuItems.get(i));
        }
    }


    public void addCustomer(ArrayList<String> customers){
        System.out.println("Please enter your name: ");
        String username = System.console().readLine();
        customers.add(username);
    }
}