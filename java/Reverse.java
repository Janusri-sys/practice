import java.util.Arrays;
class Reverse{
    static int[] reverse(int[] a){
        int start=0;
        int end=a.length-1;
        while(end>start){
            swap(a,start,end);
            start++;
            end--;
        }
        return a;
    }
    static void swap(int[] a,int i, int j){
        int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
    }
    public static void main(String[] args){
        int[] a={1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(reverse(a)));
        
    }
}