class Recursion{
    // static void print(int n){
    //     if(n==5){
    //         System.out.println(5);
    //         return;
    //     }
    //     System.out.println(n);
    //     print(n+1);
        
    // }
    static int fibo(int n){
        if(n==1||n==0)return n;
        return fibo(n-1)+fibo(n-2);
    }
    public static void main(String[] args){
        System.out.println(fibo(3));
    }
}