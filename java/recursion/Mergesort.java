import java.util.Arrays;
//     static int[] mergesort(int[] arr){
//         if(arr.length==1)return arr;

//         int mid=arr.length/2;
//         int[] left=mergesort(Arrays.copyOfRange(arr,0,mid));
//         int[] right=mergesort(Arrays.copyOfRange(arr,mid,arr.length));

//         return merge(left,right);
//     }
//     static int[] merge(int[] first,int[] second){
//         int[] mix=new int[first.length+second.length];
//         int i=0,j=0,k=0;
//         while(i<first.length&&j<second.length){
//             if(first[i]<second[i]){
//                 mix[k]=first[i];
//                 i++;
//             }
//             else{
//                 mix[k]=second[j];
//                 j++;
//             }
//             k++;
//         }
//         while(i<first.length){
//             mix[k]=first[i];
//             k++;
//             i++;
//         }
//         while(j<second.length){
//             mix[k]=second[j];
//             k++;
//             j++;
//         }
//     return mix;
//     }
// }

class Mergesort{
    public static void merge(int[] arr,int low,int mid,int high){
        int[] merged=new int[high-low+1];
        int i=low;
        int j=mid+1;
        int k=0;
        while(i<=mid && j<=high){
            if(arr[i]<arr[j]){
                merged[k]=arr[i];
                i++;
            }
            else{
                merged[k]=arr[j];
                j++;
            }
            k++;
        }
        while(i<=mid){
            merged[k]=arr[i];
            k++;
            i++;
        }
        while(j<=high){
            merged[k]=arr[j];
            k++;
            j++;
        }
        for(i=0,j=low;i<merged.length;i++,j++){
            arr[j]=merged[i];
        }

    }

    public static void mergeSort(int[] arr,int low,int high){
        if(low>=high)return;
        int mid=low+(high-low)/2;
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }
    public static void main(String[] args){
        int[] arr={9,8,7,6,5,4,3,2,1};
        mergeSort(arr,0,arr.length-1);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

}
