public class Max3 {
    /**
     * Method to find the maximum of three integers
     *
     * @param num1 the first number
     * @param num2 the second number
     * @param num3 the third number
     * @return the maximum of num1, num2, and num3
     */
    public static int max3(int num1, int num2, int num3) {
        // Compare num1 with num2 and num3 to find the maximum
        int max = num1;
        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }
        return max;
    }
}
