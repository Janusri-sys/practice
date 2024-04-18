import java.util.Arrays;
class Selectionsort{
    public static void main(String[] args){
        int[] arr={7,8,3,2,1};
        int max,index=0;
        for(int i=0;i<arr.length-1;i++){
            int k=arr.length-i-1;
            max=arr[0];
            index=0;
            for(int j=1;j<arr.length-i;j++){
                if(arr[j]>max){
                    max=arr[j];
                    index=j;
                }
            }   
                if(index==k)break;
                int temp=arr[index];
                arr[index]=arr[k];
                arr[k]=temp;

        }
        System.out.println(Arrays.toString(arr));
    }
}