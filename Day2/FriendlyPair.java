public class FriendlyPair {
    // Function to calculate the sum of divisors of a number
    public static int sumOfDivisors(int n) {
        int sum = 0;

        // Loop through all numbers from 1 to n
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {  // if i is a divisor
                sum += i;     // add it to sum
            }
        }
        return sum;
    }
    // Function to check if two numbers are Friendly Pair
    public static boolean isFriendlyPair(int a, int b) {
        // Find sum of divisors for both numbers
        int sumA = sumOfDivisors(a);
        int sumB = sumOfDivisors(b);

        // Check if (sumA / a) == (sumB / b)
        // To avoid fractions, we cross multiply:
        return (sumA * b) == (sumB * a);
    
    public static void main(String[] args) {
        int num1 = 6;
        int num2 = 28;

        if (isFriendlyPair(num1, num2)) {
            System.out.println(num1 + " and " + num2 + " are Friendly Pairs");
        } else {
            System.out.println(num1 + " and " + num2 + " are NOT Friendly Pairs");
        }
    }
}
