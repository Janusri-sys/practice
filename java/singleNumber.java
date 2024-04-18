import java.util.Arrays;
class singleNumber{
    public static void main(String[] args){
        int[] nums={1,0,1};
        Arrays.sort(nums);
        // System.out.println(Arrays.toString(nums));
        int single=findSingleElement(nums);
        System.out.println(single);
}
    public static int findSingleElement(int[] nums){
        int single=-1;
        for(int i=0;i<nums.length;i++){
            int count=0;
            for(int j=1;j<nums.length;j++){
                if(i!=j&&nums[i]==nums[j]){
                    count++;
                    break;
                }
            }
        if(count==0){
            single=nums[i];
        }
    }
        return single;
    }
}