class Binarysearch{
    public static void main(String[] args){
        int[] arr={2,3,4,8,55,78,99};
        int element=78;
        System.out.println(binarysearch(arr,element));
    }
    static int binarysearch(int[] arr,int element){
        
        int low=0,high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==element){
                return mid;
            }
            else if(arr[mid]>element){
                    high=mid-1;
            }
             else {
                low=mid+1;
            }
        }
        return -1;
    }
}