package Java.Itvedant.Daily;

public class B implements A {
    public static void main(String[] args) {
        B b = new B();
        b.m(); //this id default method
        A.n(); // this is Static method that why we can call directly using interface object

    }
}





