public class MinMaxCalculation {
    public static void main(String[] args) {

        int[] array_numbers = {-12,-1,0,1,22,3,43,54,62,74}; 

        int minimum = array_numbers[0];

        int maximum = array_numbers[0];

        for (int i : array_numbers) {
            if (i < minimum) {
                minimum = i;
            }
            if (i > maximum) {
                maximum = i;
            }
        }

        System.out.println("Minimum: " + minimum);
        System.out.println("Maximum: " + maximum);
    }
}
