package Java.W3Practise;
/*11. Write a Java program to print the area and perimeter of a circle. Go to the editor
Test Data:
Radius = 7.5
Expected Output
Perimeter is = 47.12388980384689
Area is = 176.71458676442586*/
public class A11 {
    public static void main(String[] args) {
        double radius = 7.5;
        double perimeter = 2*3.14159*radius;
        double area = 3.14159*radius*radius;
                System.out.println("Perimeter of circle is "+ perimeter);
        System.out.println("Area of circle is "+ area);
    }
}
