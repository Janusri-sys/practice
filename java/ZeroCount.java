class ZeroCount{
    public static void main(String[] args){
        int L=5,K=3;
        int ans=count(L,K);
        System.out.println(ans);
    }
    public static int count(int L,int K){
        if(K==0){
            return L;
        }
        if(K==L){
            return 0;
        }
        int min_count=0;
        if(K>0){
            min_count=1;
        }
        return min_count;
    }

}