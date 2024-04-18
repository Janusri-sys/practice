import java.util.Arrays;
class Equalitystr{
    public static void main(String[] args){
        String[] word1={"abc","d"};
        String[] word2={"ab","cd"};
        System.out.println(arrayStringsAreEqual(word1,word2));
    }
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String res1="",res2="";
        for(String w1:word1){
            res1+=w1;
        }
        for(String w2:word2){
            res2+=w2;
        }
        System.out.println(res1);
        System.out.println(res2);
        if(res1.equals(res2)){
            return true;
        }
        else{
            return false;
        }
    }
}