import java.util.Arrays;
class Insertionsort{
    //two parts sorted unsorted
    public static void main(String[] args){
        int[] arr={5,4,3,1,2};
        // for(int i=0;i<arr.length-1;i++){
        //     for(int j=i+1;j>0;j--){
        //         if(arr[j]<arr[j-1]){
        //             int temp=arr[j];
        //             arr[j]=arr[j-1];
        //             arr[j-1]=temp;
        //         }
        //         else{
        //             break;
        //         }
        //     }
        // }
        for(int i=1;i<arr.length;i++){
            int current=arr[i];
            int j=i-1;
            while(j>=0 && current<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current;
        }
        System.out.println(Arrays.toString(arr));
    }
}