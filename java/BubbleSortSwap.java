import java.util.Arrays;
import java.util.Scanner;
class BubbleSortSwap{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String input1=sc.nextLine();
        String[] s1=input1.split("\\s+");
        int[] a=Arrays.stream(s1).mapToInt(Integer::parseInt).toArray();

        String input2=sc.nextLine();
        String[] s2=input2.split("\\s+");
        int[] b=Arrays.stream(s2).mapToInt(Integer::parseInt).toArray();

        Boolean swap=false;
        int n=a.length;
        for(int i=0;i<n-1;i++){
            swap=false;
            for(int j=0;j<n-i-1;j++){
                if(a[j]>a[j+1]){
                    int temp=b[j];
                    b[j]=b[j+1];
                    b[j+1]=temp;
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    swap=true;
                }

            }
        if(!swap){
            break;
        }
        }
       System.out.println(Arrays.toString(b)); 
    }

}