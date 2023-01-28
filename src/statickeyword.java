class Student{
    int rollNo;
    String name;
    static int count =0;

    Student(int rollNo, String name){
        this.rollNo = rollNo;
        this.name = name;
        count++;

    }
    static void showCount()
    {
        System.out.println(count);
    }
}
public class statickeyword {
    public static void main(String[] args){
        Student s1 = new Student(1, "Ram");
        System.out.println(s1.count);
        Student s2 = new Student(1, "Sita");
        System.out.println(s2.count);
        Student s3 = new Student(1, "Alex");
        System.out.println(s3.count);


    }
}
