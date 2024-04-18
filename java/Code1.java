class Code1{
    public static void main(String[] args){
        String s="alabama";
        int count=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='a' && ((i+1)%2)!=0){
            s=s.replace(s.charAt(i),'#');
            count++;
                }
        }
        System.out.println(count);
        System.out.println(s);

    }
}