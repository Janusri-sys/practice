class CeilingLetter{
    public static void main(String[] args){
        char[] arr={'c','f','j'};
        char element='j';
        System.out.println(binarysearch(arr,element));
    }
    static char binarysearch(char[] arr,char element){
        
        int low=0,high=arr.length-1;

        while(low<=high){
            int mid=low+(high-low)/2;
                if(arr[mid]>element){
                    high=mid-1;
                }
                else{
                     low=mid+1;
                }
        }
        return arr[low %arr.length];
    }
}