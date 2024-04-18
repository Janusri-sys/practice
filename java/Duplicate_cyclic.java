import java.util.Arrays;
class Duplicate_cyclic{
    public static void main(String[] args){
        int[] arr={3,1,3,4,2};
        int dup=duplicate_num(arr);
        System.out.println(dup);
    }
    static int duplicate_num(int [] arr){
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if(arr[i]==arr[correct]){
                i++;
            }
            else{
                int temp=arr[i];
                arr[i]=arr[correct];
                arr[correct]=temp;
            }
        }
        return arr[arr.length-1];
    }
}