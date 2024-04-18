import java.util.ArrayList;
import java.util.*;

class Startend{
    public static void main(String[] args){
        int[] nums={5,6,6,7,7,7,7,8,8,8,9};
        int target=7;
        int[] list=new int[2];
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                list[0]=i;
                break;
            }
            
        }
        int end=list[0];
        while(nums[end]==target){
            end++;
        }
        list[1]=end-1;
        System.out.println(Arrays.toString(list)); 
    }
}