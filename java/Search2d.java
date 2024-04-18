class Search2d{
    public static void main(String[] args){
        int[][] arr={
                {23,4,12},
                {16,34,67,9},
                {1,4,7,8,2,99},
                {18,22}

        };
        int element=344;
        System.out.println(search(arr,element));


    }
    static boolean search(int[][] arr,int element){ qqq
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]==element)
                return true;
            }
        }
        return false;
    }
}