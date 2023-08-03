package StudentWork.KyMiller.CafeBusinessLogic;



import java.util.ArrayList;

public class CafeUtil{

    public int getStreakGoal(){

        int[] arrStreak;
        arrStreak = new int[10];

        for(int i = 0; i < 10; i++){
            if(i == 0){
                arrStreak[0] = 1;
            }
            else{
                arrStreak[i] = (i+1) + arrStreak[i-1];
            }
        }

        int streak;
        streak = arrStreak[9];
        return streak;
    }

    public double getOrderTotal(double[] prices){
        double total = 0;
        for(int i = 0; i < prices.length; i++ ){
            total += prices[i];
        }
        return total;
    }

    public void displayMenu(ArrayList<String> menuItems){
        for(int i = 0; i < menuItems.size(); i++){
            System.out.println(i + " " + menuItems.get(i));
            System.out.println(" ");
        }
    }

    public void addCustomer(ArrayList<String> customers){
        System.out.println("Please enter your name:");
        String username = System.console().readLine();
        System.out.println("Hello, " + username);
        System.out.println("There are " + customers.size() + " customers ahead of you");
        customers.add(username);
    }
}