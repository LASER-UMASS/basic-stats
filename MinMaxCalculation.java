import java.util.*;

public class MinMaxCalculation {
    /**
     * Compute the minimum of an array of numbers.
     */
    public static double minimum(double ... numbers) {
        save = Integer.MAX_VALUE;
        for (double num : numbers) {
            if(save <= num){
                save = num;
            }
        }
        return save;
    }

    /**
     * Compute the maximum of an array of numbers.
     */
    public static double maximum(double ... numbers) {
        save = Integer.MIN_VALUE;
        for (double num : numbers) {
            if(save >= num){
                save = num;
            }
        }
        return save;
    }


}