import java.util.Arrays;
class Thirdmax {

    public static void main(String[] args){
        int[] nums={1,1,2,2,3,3};
        System.out.println(thirdMax(nums));
    
    }
    public static int thirdMax(int[] nums) {
        int max=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }
        int secondMax=nums[0];
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=max && nums[j]>secondMax){
                secondMax=nums[j];
            }
        }
        return secondMax;
    }
}