import java.util.ArrayList;
class Arrayrec{
    public static void main(String[] args){
        int[] arr={1,2,5,4,1,6};
        int target=1;
        ArrayList<Integer> list=new ArrayList<>();
        //System.out.println(linearSearch(arr,target,0));
        //System.out.println(isSorted(arr,0));
        //System.out.println(searchAllIndexList(arr,target,0,list));
        System.out.println(searchAllIndexList2(arr,target,0));
    }
    static boolean isSorted(int[] arr,int i){
        if(i==arr.length-1)return true;
        return arr[i]<arr[i+1] && isSorted(arr,i+1);
        
    }
    static boolean linearSearch(int[] arr,int target,int i){
        if(i==arr.length)return false;
        return arr[i]==target||linearSearch(arr,target,i+1);
    }
    static ArrayList<Integer> li=new ArrayList<>();
    static int searchAllIndex(int[] arr,int target,int i){
        if(i==arr.length)return -1;
        if(arr[i]==target)li.add(i);
        return searchAllIndex(arr,target,i+1);
    }

    //with list as a parameter
    static ArrayList<Integer> searchAllIndexList(int[] arr,int target,int i,ArrayList<Integer> list){
        if(i==arr.length)return list;
        if(arr[i]==target)list.add(i);
        return searchAllIndexList(arr,target,i+1,list);
    }
    static ArrayList<Integer> searchAllIndexList2(int[] arr,int target,int i){
        ArrayList<Integer> list=new ArrayList<>();
        if(i==arr.length){
            return list;
        }
        //this will contain answer for that function call only
        if(arr[i]==target){
            list.add(i);
        }
        ArrayList<Integer> ansFromBelowCalls=searchAllIndexList2(arr,target,i+1);
        list.addAll(ansFromBelowCalls);
        return list;
    }
}