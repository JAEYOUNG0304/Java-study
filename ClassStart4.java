package class1;

public class ClassStart4 {

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        Student[] students = new Student[2];

        // 배열에 아직 메모리주소를 대입하지 않음 -> null
        System.out.println(students[0]);
        System.out.println(students[1]);

        // 배열에 메모리주소를 대입
        students[0] = student1;
        students[1] = student2;
        // 배열의 각 항목은, student1, student2가 담고 있는 메모리주소(참조값)을 담는다.
        System.out.println(students[0]);
        System.out.println(students[1]);

        System.out.println("이름:" + students[0].name + " 나이:" + students[0].age + " 성적:" + students[0].grade);
        System.out.println("이름:" + students[1].name + " 나이:" + students[1].age + " 성적:" + students[1].grade);
    }
}
