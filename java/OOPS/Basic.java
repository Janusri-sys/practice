class Basic{
    public static void main(String[] args){
        Student s1=new Student(19,"janusri",96.0f);
        Student s2=new Student(20,"Gowtham",90.0f);
        Student random=new Student();
        Student one=new Student();
        Student two=one;
        one.name="srinivas";
        System.out.println(two.name);
        // s1.rno=19;
        // s1.name="janu sri";
        // s1.marks=97.0f;
        s1.greeting();
        System.out.println(s1.rno);
        System.out.println(s2.name);
        System.out.println(s1.marks);
    }
}

class Student{
    Student(int rno,String name,float marks){
    //this : One word to access all the objects
    this.rno=rno;
    this.name=name;
    this.marks=marks;
    }
    //this is how to call a constructor from another constructor

    Student(){
        this(18,"default person",100.0f);
    }
    void greeting(){
        System.out.println("Hello "+this.name);
    }
    int rno=10;
    String name;
    float marks=96.0f;
}