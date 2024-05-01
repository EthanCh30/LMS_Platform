public class Factorial {

    /**
     * Returns the factorial of the argument given
     *
     * @param n the number for which to calculate the factorial
     * @return the factorial
     * @throws IllegalArgumentException if the argument is negative or too large
     */
    public static int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is undefined for negative integers");
        }
        if (n > 16) {
            throw new IllegalArgumentException("Factorial(" + n + ") is too large - overflow occurs!");
        }

        int fact = 1;
        for (int i = n; i > 0; i--)
            fact *= i;
        return fact;
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        char response;

        do {
            try {
                System.out.print("Enter an integer: ");
                int num = scanner.nextInt();
                System.out.println("Factorial(" + num + ") = " + factorial(num));
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
            System.out.print("Another factorial? (y/n): ");
            response = scanner.next().charAt(0);
        } while (response == 'y' || response == 'Y');

        scanner.close();
    }
}
