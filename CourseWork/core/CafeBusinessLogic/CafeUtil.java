public class CafeUtil {

    /**
     * 
     * @return goal
     */
    int getStreakGoal(){
        int Goal = 0;

        for(int i = 0; i <= 10; i++){
            Goal += i;
        }
        return Goal;
    }

    /**
     * 
     * @param numWeeks <int>
     * @return goal <int>
     */
    int getStreakGoal(int numWeeks){
        int Goal = 0;
        for(int i = 0; i <= numWeeks; i++){
            Goal += i;
        }
        return Goal;
    }
    
}
