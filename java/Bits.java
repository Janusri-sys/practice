class Bits{
    public static void main(String[] args){
        int n=4;
        int base=5;
        int ans=0;
        while(n>0){
            int last=n&1;
            
            ans+=last*base;
            base=base*5;
            n>>=1;

        }
        System.out.println(ans);
        int countBits=0;
        int num=8;
        while(num>0){
            countBits++;
            num>>=1;
        }
        System.out.println(countBits);

        int a=10;
        int b=2;
        int answer=(int)(Math.log(a)/Math.log(b))+1;
        System.out.println("10 in binary has no.of digits "+answer);

    }
}