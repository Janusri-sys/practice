import java.util.Arrays;
class Missing_cyclic{
    public static void main(String[] args){
        int[] arr={3,5,2,0,};
        int miss=missing_num(arr);
        System.out.println(miss);
    }
    public static int missing_num(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct=arr[i];
            if(arr[i]<arr.length && arr[i]!=arr[correct]){
                int temp=arr[i];
                arr[i]=arr[correct];
                arr[correct]=temp;
            }
            else{
                i++;
            }
        }
        //search
        for(int index=0;index<arr.length;index++){
            if(arr[index]!=index){
                return index;
            }
        }
        //case 2 when N is missing
        return arr.length;
    }
}