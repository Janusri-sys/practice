class Power{
    public static void main(String[] args){
        int base=3;
        int power=6;
        int ans=1;
        while(power>0){
            if((power&1)==1){
                ans=ans*base;
            }
            base=base*base;
            power>>=1;
        }
        System.out.println(ans);
        System.out.println(XOR0toa(4));
        //range xor for a,b=xor(b)^xor(a-1)
        int a=3,b=9;
        System.out.println(XOR0toa(b)^XOR0toa(a-1));
    }
    static int XOR0toa(int a){
        if(a%4==0)return a;
        if(a%4==1)return 1;
        if(a%4==2)return a+1;
        return 0;
    }
}