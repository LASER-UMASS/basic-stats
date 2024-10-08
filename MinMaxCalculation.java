public class MinMaxCalculation {
    public static void main(String[] args) {
        int[] num = {45, 23, 8, 12, 20}; 
        int min = num[0];
        int max = num[0];

        for (int n : num) {
            if (n < min) {
                min = n;
            }
            if (n > max) {
                max = n;
            }
        }
       
        System.out.print("The given set of numbers is: ");
           for (int n : num) {
           System.out.print(n + " ");
           }
        System.out.println();

        System.out.println("Minimum of the numbers is : " + min);
        System.out.println("Maximum of the given numbers is : " + max);
    }
}