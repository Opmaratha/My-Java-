package JavaCodes.Itvedant.Daily;

public interface A {
    default void m(){
        System.out.println("Hi im defaut");
        o();
    }
    public static void n(){
        System.out.println("hello static method");
        o();
    }
    private static void o(){
        System.out.println("hey private method");
    }
}




