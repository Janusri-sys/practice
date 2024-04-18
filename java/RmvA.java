class RmvA{
    public static void main(String[] args){
        String str="baccad";
        remove_a(str);
    }
    static void remove_a(String str){
        StringBuilder sb=new StringBuilder(str);
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)=='a'){
                sb.deleteCharAt(i);
            }
        }
        System.out.println(sb.toString());
    }
}