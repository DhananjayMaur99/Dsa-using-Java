class CalculatePower{

    // int power(int x, int n){
    //     if(n==0) return 1;
    //     int temp = power(x, n/2);
    //     temp=temp*temp;
    //     if(n%2==0) return temp;
    //     else return temp*x;
    // }

    int power(int x, int n){
        int  res =1;
        while(n>0){
            if(n%2!=0){
                res=res*x;
            }
            x=x*x;
            n=n/2;
        }
        return res;
    }

    public static void main(String[] args) {
        CalculatePower cp = new CalculatePower();
        System.out.println(cp.power(3,2));
    }
}