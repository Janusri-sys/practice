class RmvA{
    public static void main(String[] args){
        String str="baccad";
        System.out.println(skip("baccad"));
        System.out.println(skipApple("bacapplecad"));

    }
    static String skip(String up){
        if(up.isEmpty()){
            return "";
        }
        char ch=up.charAt(0);
        if(ch=='a')
            return skip(up.substring(1));
        else{
            return ch+skip(up.substring(1));
        }
    }
    static String skipApple(String up){
        if(up.isEmpty()){
            return "";
        }
        char ch=up.charAt(0);
        if(up.startsWith("apple")){
            return skipApple(up.substring(5));
        }
        else{
            return ch+skipApple(up.substring(1));
        }
    }
}
