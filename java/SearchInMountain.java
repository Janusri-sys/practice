class SearchInMountain{
    public static void main(String[] args){
        int[] arr={1,2,3,4,1,0};
        int target=3;
        System.out.println(search(arr,target));

    }
    public static int search(int[] arr ,int target){
        int peak=peakIndexInMountainArray(arr);
        int firstTry=binarysearch(arr,target,0,peak);
        if(firstTry!=-1){
            return firstTry;
        }
        return binarysearch(arr,target,peak+1,arr.length-1);
    }

    public static int peakIndexInMountainArray(int[] arr) {
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end=mid;
            }
            else{
                start=mid+1;
            }
        }
        return start;
    }
    static int binarysearch(int[] arr,int low,int high,int element){
        boolean isAsc=arr[low]<arr[high];
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==element){
                return mid;
            }
            if(isAsc){
                if(arr[mid]>element){
                    high=mid-1;
                }
                else {
                    low=mid+1;
                }
            }
            else{
                if(arr[mid]>element){
                    low=mid+1;
                }
                else {
                    high=mid-1;
                }
            }
        }
        return -1;
    }
}