class Ceilingnum{
    public static void main(String[] args){
        int[] arr={2,8,10,14,16,17,23};
        int element=13;
        System.out.println(binarysearch(arr,element));
    }
    static int binarysearch(int[] arr,int element){
        
        int low=0,high=arr.length-1;
        boolean isAsc=arr[low]<arr[high];

        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==element){
                return arr[mid];
            }
            if(isAsc){
                if(arr[mid]>element){
                    high=mid-1;
                }
                else if(arr[mid]<element){
                
                    low=mid+1;
                }
            }
            else{
                if(arr[mid]<element){
                    high=mid-1;
                }
                else if(arr[mid]>element){
                
                    low=mid+1;
                }

            }
        }
        return arr[low];
    }
}