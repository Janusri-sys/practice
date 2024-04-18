class Recur1{
    public static void main(String[] args){
        int n=123;
        //range_nto1(n);
        //range_1ton(n);
        //System.out.println(factorial(n));
        //System.out.println(noOfDig(n,0));
        //System.out.println(sumOfDig(n));
        
    }
    static void reverse(int n){
        if(sum==0){
            return;
        }
    }
    static int sumOfDig(int n){
        if(n<=0){
            return 0;
        }
        int rem=n%10;
        return rem+sumOfDig(n/10);
    }
    static int noOfDig(int n,int c){
        if(n<=0){
            return c;
        }
        return noOfDig(n/10,c+1);
    }
    static int factorial(int n){
        if(n==1){
            return 1;
        }
        return n*factorial(n-1);
    }
    static void range_nto1(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        range_nto1(n-1);
    }
    static void range_1ton(int n){
        if(n==0){
            return;
        }
        range_1ton(n-1);
        System.out.println(n);
    }
}