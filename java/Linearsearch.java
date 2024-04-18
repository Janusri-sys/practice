class Linearsearch{
    public static void main(String[] args){
        int[] arr={2,4,1,6,22,88};
        int element=20;
        int index=search(arr,element);
        System.out.println(index);
    }
    static int search(int[] arr,int element){
        if(arr.length==0)return -1;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==element){
                return i;

            }
        }
        return -1;
    }
}