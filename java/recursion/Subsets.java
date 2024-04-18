import java.util.*;
class Subsets{
    public static void main(String[] args){
        HashSet <String> set=new HashSet<>();
        subset("","aaa",set);
        System.out.println(list);
        
    }
    // static void subset(String p,String up){
    //     if(up.isEmpty()){
    //         System.out.println(p);
    //         return;
    //     }
    //     char ch=up.charAt(0);
    //     subset(p+ch,up.substring(1));
    //     subset(p,up.substring(1));
    // }
    static ArrayList<String> list=new ArrayList<String>();
    static void subset(String p,String up,HashSet <String> set){
        if(up.isEmpty()){
            //System.out.println(p);
            if(!set.contains(p)){
                set.add(p);
                list.add(p);
                return;
            }
        }
        char ch=up.charAt(0);
        subset(p+ch,up.substring(1),set);
        subset(p,up.substring(1),set);
    }

}