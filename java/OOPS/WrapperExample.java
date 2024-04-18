class WrapperExample{
    public static void main(String[] args){
        //int a=10;
        Integer a=10;
        Integer b=20;
        swap(a,b);
        System.out.println(a+" "+b);

        final A obj=new A();
        A.name="Janu sri";

        //when a non primitive is final you cannot reassign it
        //obj=new A("new");
        System.out.println(A.name);
    }
    static void swap(Integer a,Integer b){
        int temp=a;
        a=b;
        b=temp;
    }
}
//if any variable is declared as final we ccannot modify it and the variable must be intialised.
//But you can change the value when it is an object
class A{
    final int num=10;
    static String name;
}

//finalize method will be called when java is decided to do garbage collection