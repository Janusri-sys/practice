import java.util.Arrays;
class First_missing_pos_cyclic{
    public static void main(String[] args){
        int[] arr={3,4,-1,1};
        int ans=sort(arr);
        System.out.println(ans);
    }
    static int sort(int [] arr){
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if(arr[i]<arr.length && arr[i]>0 && arr[i]!=arr[correct]){
                int temp=arr[i];
                arr[i]=arr[correct];
                arr[correct]=temp;
            }
            else{
                i++;
            }
        }
        for(int index=0;index<arr.length;index++){
            if(arr[index]!=index+1){
                return index+1;
            }
        }
        //case 2 when N is missing
        return arr.length+1;
        }
    }