public class MinMaxCalculation{
    public static void main(String[] args){
        int[] numberSet = {20, 40, 33, 100, 25, 10};

        //Initializing the min and max to the first element of the array for comparison
        int min = numberSet[0];
        int max = numberSet[0];

        for(int i = 1; i < numberSet.length; i++){
            if (numberSet[i] > max)
            {
                max = numberSet[i];
            }
            if (numberSet[i] < min)
            {
                min = numberSet[i];
            }
        }

        //Prints the results
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);   
    }
}