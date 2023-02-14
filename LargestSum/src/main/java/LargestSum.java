
import java.util.List;

public class LargestSum {
    /**
     * Get the largest possible sum that can be obtained from a pair of values in the list. A number can't be added
     * to itself, unless there are duplicates.
     *
     * @param nums a list of ints.
     * @return the largest possible sum of separate numbers from nums.
     */
    public int bigSum(List<Integer> nums){
        
        int max_num = Integer.MIN_VALUE;
        int second_max_num = Integer.MIN_VALUE;

        for(int i = 0; i < nums.size(); i++){
                int current = nums.get(i);

                if(current > max_num){
                    second_max_num = max_num;
                    max_num = current;
                }else if(current > second_max_num){
                    second_max_num = current;
                }
            
        }

        return max_num + second_max_num;
    }
}