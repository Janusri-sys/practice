import java.util.Arrays;
class RotateArr{
    public static void main(String[] args){
        int[] arr={1,2,3,4,5};
        System.out.println(Arrays.toString(rotate(arr,3)));
    }
    public static int[] rotate(int[] arr,int n){
        for(int k=0;k<n;k++){
        int last=arr[arr.length-1];
        for(int i=arr.length-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=last;
        }
        return arr;
    }
}