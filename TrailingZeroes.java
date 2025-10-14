// java program to  count trailing zeroes in n!

class TrailingZeroes {
    public static int countZeroes(int n){
        //finding factorial
        long fact =1;
        for(int i=2; i<=n; i++){
            fact = fact*i;
        }

        //counting trailing zeroes. 
        int res =0;
        while(fact%10 == 0){
            res++;
            fact = fact/10;
        }
        return res;
    }

    public static void main(String[] args) {
        int input = 20;
        System.out.println(countZeroes(input));
    }
}