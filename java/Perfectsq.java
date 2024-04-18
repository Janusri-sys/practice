class Perfectsq{
    static boolean isPerfect(int x){
        int sum=0;
        for(int i=1;i<=x/2;i++){
            if(x%i==0){
                sum+=i;
            }
        }
        if(sum==x)return true;
        else return false;
    }
    public static void main(String[] args){
        int n=400;
        for(int i=n+1;i<1000;i++){
            if(isPerfect(i)){
                System.out.println(i);
                break;
            }
        }
    }
}