import java.util.HashMap;
class Duplicate{
    static void findDuplicateWords(String str){
        String[] s=str.split(" ");
        HashMap<String,Integer> hm=new HashMap<>();
        for(String tempString:s){
            hm.put(tempString,1);
        }
        System.out.println(hm);
    }
    public static void main(String[] args){
        findDuplicateWords("I am am learning java java");
    }
}