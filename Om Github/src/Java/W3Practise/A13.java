package Java.W3Practise;
/*13. Write a Java program to print the area and perimeter of a rectangle. Go to the editor
Test Data:
Width = 5.5 Height = 8.5*/
public class A13 {
    public static void main(String[] args) {
        double Width = 5.5;
        double Height = 8.5;
        double perimeter = 2 *(Width + Height);
        double area = (Width * Height);
        System.out.println("Perimeter of rectangle is :"+ perimeter);
        System.out.println("Area of rectangle is :"+ area);
    }
}
