class Recur3{
    public static void main(String[] args){
       // System.out.println(countzeros(300209,0));
       System.out.println(noOfSteps(14,0));
    }
    static int noOfSteps(int n,int c){
        if(n==0)return c;
        if(n%2==0){
            return noOfSteps(n/2,c+1);
        }
        else{
            return noOfSteps(n-1,c+1);
        }
    }
    static int countzeros(int n,int c){
        if(n==0)return c;
        int rem=n%10;
        if(rem==0){
            return countzeros(n/10,c+1);
        }
        else{
            return countzeros(n/10,c);
        }
    }
}