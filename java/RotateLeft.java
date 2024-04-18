import java.util.Arrays;
class RotateLeft{
    public static void main(String[] args){
        int[] a={1,2,3,4,5,6};
        int[] temp=new int[a.length];
        int n=a.length;
        int k=1;
        for(int i=0;i<k;i++){
            temp[i]=a[i];
        }
        for(int i=0;i<n-k;i++){
            a[i]=a[i+k];
        }
        for(int i=n-k;i<n;i++){
            a[i]=temp[k-n+i];
        }
        System.out.println(Arrays.toString(a));
    }
}