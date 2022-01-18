package Java.Itvedant.Daily;

import java.util.Optional;

class Student{
    Long id;
    String name;

    public Student(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class OptionalNullableEx {
    public static void main(String[] args) {
        Student s2= null;
        Student s = new Student(5L,"abc");
        Long i= Optional.ofNullable(s)
                .map(Student::getId)
                .orElse(null);
        System.out.println(i);
        i=Optional.ofNullable(s2).map(s3->s3.getId()).orElse(null);
        System.out.println(i);

    }
}
