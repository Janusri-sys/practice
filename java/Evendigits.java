public class Evendigits{
    public static void main(String[] args){
        int[] arr={12,33,67,1,8234};
        System.out.println(findNumbers(arr));
    }
    static int findNumbers(int[] nums){
        int c=0;
        for(int n:nums){
            int count=0;
            while(n>0){
                count++;
                n=n/10;
            }
            if(count%2==0){
                c++;
            }
        }
        return c;
    }
}