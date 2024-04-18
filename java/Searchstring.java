class Searchstring{
    public static void main(String[] args){
        String str="Janu sri Thota";
        char element='s';
        System.out.println(search(str,element));
        
        
    }
    static boolean search(String str,char element){
        if(str.length()==0){
            return false9;
        }
        // for(int i=0;i<str.length();i++){
        //     if(str.charAt(i)==element){
        //         return i;
        //     }
                
        // }

        for(char ch:str.toCharArray()){
            if(ch==element){
                return true;
            }
        }
        return false;
    }
}