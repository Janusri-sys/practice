import java.util.Scanner;
class reverseString{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        // System.out.println("Enter a String:");
        String s="Janu sri";

        String[] words=s.split(" ");
        for(String tempString:words){
            System.out.println(tempString);
        }
        String reverseString="";
        // for(String w:words){
        //     String reverseWord="";
        //     for(int i=w.length()-1;i>=0;i--){
        //         reverseWord+=w.charAt(i);
        //     }
        //     reverseString+=reverseWord+" ";
        // }
        //     System.out.print(reverseString);

        for(int i=words.length-1;i>=0;i--){
            reverseString+=words[i]+" ";
        }
        System.out.print(reverseString.trim());


        // String[] words=s.split("\\s");
        // String reverseWord="";
        // for(String w:words){
            
        //     StringBuilder sb=new StringBuilder(w);
        //     sb.reverse();
        //     reverseWord+=sb.toString()+" ";
        // }
        // System.out.print(reverseWord);
    }
}