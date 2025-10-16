public class AllDivisors {

// Naive Solution O(n)
    // public void printDivisor(int n){
    //     for(int i =1; i<n; i++){
    //         if(n%i==0) System.out.println(i);
    //     }
    // }

// efficient solution O(n^1/2) but not ordered

    // public void printDivisor(int n){
    //     for(int i =1; i*i<=n; i++){
    //         if(n%i==0){
    //             System.out.print(i+" ");
    //             if(i!=n/i) System.out.println(n/i);
    //         }
    //     }
    // }

// effcient solution ordered

    
    public void printDivisor(int n){
        int i;
        for(i=1;i*i<=n;i++){
            if(n%i==0) System.out.print(i+" ");
        }
        for(;i>=1; i--){
            if(n%i==0) System.out.print(n/i+" ");
        }
    }


    public static void main(String[] args) {
        AllDivisors ad = new AllDivisors();
        ad.printDivisor(120);
    }
}
