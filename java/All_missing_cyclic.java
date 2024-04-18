import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

class All_missing_cyclic{
    public static void main(String[] args){
        List<Integer> myList=new ArrayList<>();
        int[] arr={4,3,2,7,8,2,3,1};
        myList=missing_nums(arr);
        for (int element : myList) {
        System.out.print(element);
        }
    }
    static List<Integer> missing_nums(int [] arr){
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
        List<Integer> myList=new ArrayList<>();
        for(int j=0;j<arr.length;j++){
            if(arr[j]!=j+1){
                myList.add(j+1);
            }
        }
        return myList;
    }
}