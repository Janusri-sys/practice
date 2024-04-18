import java.util.ArrayList;
import java.util.Collections;
class CodeVita1{
    public static void main(String[] args){
        String p="polikujmnhytgbvfredcxswqaz";
        String s="abcd";
        String result="";
        ArrayList<Integer> li=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            li.add(p.indexOf(s.charAt(i)));
        }
        Collections.sort(li);
        for(int i=0;i<s.length();i++){
            result+=p.charAt(li.get(i));
        }
        System.out.println(result);

        
    }
}