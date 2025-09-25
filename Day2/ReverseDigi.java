public class ReverseDigi{
    public static void main(String args[]) {
        // variables initialization
        int num = 1234, reverse = 0, rem;

        // loop to find reverse number
        while (num != 0) {
            rem = num % 10;
            reverse = reverse * 10 + rem;
            num /= 10;
        } // ✅ only closing brace, no semicolon

        // output
        System.out.println("Reversed Number: " + reverse);
    }
}

//method2
public class Main
 {
   public static void main (String[]args)
   {
     //variables initialization
     int num = 1234, rev = 0;
     //output
       System.out.println ("Reversed Number: " + getReverse(num, rev));
   }
   static int getReverse (int num, int rev)
   {
     if (num == 0)
       return rev;
     int rem = num % 10;
     rev = rev * 10 + rem;
     return getReverse (num / 10, rev);
   }
 }