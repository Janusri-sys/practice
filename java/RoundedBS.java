class RoundedBS{
    public static void main(String[] args){
        int[] arr={4,5,6,7,1,2,3};
        System.out.println(search(arr,4));
    
    }
    static int search(int[] arr,int element){
        int pivot=findPivot(arr);
        if(pivot==-1){
            return binarysearch(arr,element,0,arr.length-1);
        
        }
        if(arr[pivot]==element){return pivot;}

        if(element>arr[0]){
            return binarysearch(arr,element,0,pivot-1);
        }
        return binarysearch(arr,element,pivot+1,arr.length-1);

    
    }
    static int binarysearch(int[] arr,int element,int low,int high){
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
    public static int findPivot(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                    return mid;
            }
            if(arr[mid]<arr[mid-1]){
                    return mid-1;
            }
            if(arr[mid]<=arr[start]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }

    }
    return -1;
}
}