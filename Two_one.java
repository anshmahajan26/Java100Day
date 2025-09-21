public class Two_one {
    public static void main(String[] args) {
        int number = 29;

        if (isEven(number))
            System.out.println("Even");
        else
            System.out.println("Odd");
    }

    // Returns true if n is even, else odd
    static boolean isEven(int number) {
        // n & 1 == 1 means odd, else even
        return (number & 1) == 0;
    }
}
