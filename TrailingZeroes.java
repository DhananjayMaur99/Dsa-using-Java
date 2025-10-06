// java program to  count trailing zeroes in n!

class TrailingZeroes {

    // Function to return the count of trailing zeroes in n!
    static int countTrailingZeroes(int n) {
        // Initialize result
        int count = 0;

        // Keep dividing n by powers of 5 and update count
        for (int i = 5; n / i >= 1; i *= 5)
            count += n / i;

        return count;
    }

    // Driver method
    public static void main(String[] args) {
        int n = 100;
        System.out.println("Count of trailing zeroes in " + n
                + "! is " + countTrailingZeroes(n));
    }
}