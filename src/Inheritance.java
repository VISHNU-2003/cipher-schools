class A{
    int a,b;

    public void show() {
        System.out.println("Hello!");
    }
}

//class B extends A{
//	public void speak() {
//		System.out.println("Writing!");
//	}
//}

interface b{
    public void eat();
}

interface D extends b{
    public void sleep();
}
class C implements b,D{
    int e,f;
    public void speak() {
        System.out.println("Speaking");
    }

    @Override
    public void eat() {

    }

    @Override
    public void sleep() {

    }
}

public class Inheritance {

    public static void main(String[] args) {
//		B b = new B();
//		C c = new C();
    }


}