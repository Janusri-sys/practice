class InfinityArray{
    public static void main(String[] args){
        int[] arr={3,4,5,7,10,89,100,138,150};
        int element=10;
        System.out.println(findingRange(arr,element));
    }
    static int findingRange(int[] arr,int element){
        int start=0;
        int end=1;

        while(element>arr[end]){
            int newStart=end+1;
            end=end+(end-start+1)*2;
            start=newStart;
        }
        return binarysearch(arr,start,end,element);
    }
    static int binarysearch(int[] arr,int low,int high,int element){
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