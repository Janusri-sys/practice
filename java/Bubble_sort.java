import java.util.Arrays;
class Bubble_sort{
    public static void main(String[] args){
        int[] a={5,1,2,3,4};
        Boolean swap=false;
        int n=a.length;
        for(int i=0;i<n-1;i++){
            swap=false;
            for(int j=0;j<n-i-1;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    swap=true;
                }

            }
        if(!swap){
            break;
        }
        }
       System.out.println(Arrays.toString(a)); 
    }

}