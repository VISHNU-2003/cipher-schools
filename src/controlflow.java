import java.util.*;

class Students{
    String name;
    int marks;
    boolean checkPass() {
//		if(marks>40) {
//			return true;
//		}
//		else {
//			return false;
//		}
        if(marks>=40) return true;
        return false;
    }
}

public class controlflow {

    int findMax(int a, int b, int c){
        if(a>b)
        {
            if(a>c)
            {
                return a;
            }
            else {
                return c;
            }
        }
        else
        {
            if(b>c) {
                return b;
            }
            else {
                return c;
            }
        }
    }

    public static void main(String[] args) {
        Students s1 = new Students();
        s1.name = "Ram";
        s1.marks = 80;

        Students s2 = new Students();
        s2.name = "Stam";
        s2.marks = 80;

        System.out.println(s1.checkPass());
        System.out.println(s2.checkPass());

        controlflow cf = new controlflow();
        System.out.println(cf.findMax(10, 7, 15));
//		Scanner sc = new Scanner(System.in);

        char c = 'a';
        switch(c)
        {
            case 'a':
                System.out.println("HI I am A");
                break;

            case 'b':
                System.out.println("HI I am B");
                break;

            case 'c':
                System.out.println("HI I am C");
                break;

            default:
                System.out.println("I am not A,B and C;");
        }

        System.out.println("After Switch");
    }

}