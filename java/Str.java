class Str{
    public static void main(String[] args){
        String s="Java Programming eheifuh wuefh";
        int total=s.length();
        // int total2=s.replace("a","").length();
        // int count=total-total2;
        // System.out.println(count);
        int count=0;
        for(int i=0;i<total-1;i++){
            if(s.charAt(i)==' ' && s.charAt(i+1)!=' '){
                count++;
            }
        }
        System.out.println(count);
    }
}