
import java.util.Arrays;



public class SieveOfEratosthenes {


    // public void sieve(int n){
    //     boolean isPrime [] = new boolean[n+1];
    //     Arrays.fill(isPrime, true);
    //     for(int i =2; i*i<=n;i++){
    //         if(isPrime[i]){
    //             for(int j =i*2; j<=n; j=j+i){
    //                 isPrime[j] = false;
    //             }
    //         }
    //     }

    //     for(int i =2;i<=n;i++){
    //         if(isPrime[i]) System.out.println(i);
    //     }
    // }

    // Shorter and effcient algo.

    public void sieve(int n){
        boolean isPrime [] = new boolean[n+1];
        Arrays.fill(isPrime, true);

        for(int i=2; i<=n; i++){
            if(isPrime[i]){
                System.out.print(i+" ");
                for(int j = i*i; j<=n; j=j+i){
                    isPrime[j] = false;
                }
            }
        }
    }

    public static void main(String[] args) {
        SieveOfEratosthenes se = new SieveOfEratosthenes();
        se.sieve(15);
    }
}
