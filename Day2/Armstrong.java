public class Armstrong {
    // Function to check Armstrong number
    public static boolean isArmstrong(int num) {
        int original = num;
        int sum = 0;
        // Count digits
        int digits = String.valueOf(num).length();
        // Calculate sum of powers of digits
        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num /= 10;
        }
        return sum == original;
    }
    // Main method to test
    public static void main(String[] args) {
        int number = 153;
        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong Number");
        } else {
            System.out.println(number + " is NOT an Armstrong Number");
        }
    }
}



