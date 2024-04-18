import java.util.*;
class LogicWorks{
    public static void main(String[] args){
        ArrayList<Integer> li=new ArrayList<>(Arrays.asList(2,4,5,6,8,10));
        int element=9;
        // Scanner sc=new Scanner(System.in);
        // int element=sc.nextInt();
        // int n=sc.nextInt();
        // for(int i=0;i<n;i++){
        //     li.add(sc.nextInt());
        // }
        int index=binarySearch(li,element);
        System.out.println(index);
        li.add(index,element);
        System.out.println(li);
    }
    public static int binarySearch(ArrayList<Integer> li,int element){
        int low=0,high=li.size()-1;
        
        while(low<high){
            int mid=low+(high-low)/2;
            if(li.get(mid)>element){
                high=mid-1;
            }
            else if(li.get(mid)<element){
                low=mid+1;
            }
        }
        return low;
    }
}