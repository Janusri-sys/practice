class RecBinary{
    public static void main(String[] args){
        int[] arr={1,2,3,4,55,66,78};
        System.out.println(binarySearch(arr,8,0,arr.length-1));
    }
    static int binarySearch(int[] arr,int target,int low,int high){
        if(low>high){
            return -1;
        }
        int mid=low+(high-low)/2;
        if(arr[mid]==target)return mid;
        if(target<arr[mid]){
            return binarySearch(arr,target,low,mid-1);
        }
        return binarySearch(arr,target,mid+1,high);

    }
}