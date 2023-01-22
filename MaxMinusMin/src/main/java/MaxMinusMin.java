
import java.util.List;

public class MaxMinusMin {
    /**
     * Return the difference between the highest and lowest values of the List.
     * This will require you to know some of the List interface methods.
     *
     * @param nums an List<Integer> containing varying nums.
     * @return the max value of nums minus the min value of nums.
     */
    public int difference(List<Integer> nums){

        int maxValue = 0;

        for (int i = 0; i < nums.size(); i++){

            if (nums.get(i) > maxValue) {
                maxValue = nums.get(i);
            }
        }

        int minValue = nums.get(0);

        for (int i = 1; i < nums.size(); i++){

            if (minValue > nums.get(i)) {
                minValue = nums.get(i);
            }
        }

        int result = maxValue - minValue;

        return result;
    }
}
