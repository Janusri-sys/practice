class TwoSum{
    public static void main(String[] args){
        int[] arr={2,8,12,15,7};
        int target=9;
        int[] newArray=twosum(arr,target);
        for(int n:newArray){
            System.out.print(n+" ");
        }
    }
    static int[] twosum(int[] arr,int target){
        for(int i=0;i<arr.length;i++){
            int compliment=target-arr[i];
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]==compliment){
                    return new int[] {i,j};
                }
            }
        }
        return null;
    }
}