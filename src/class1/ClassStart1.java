package class1;

public class ClassStart1 {
    public static void main(String[] args) {
        Student student1 = new Student("황선태", 30, 90);
        Student student2 = new Student("박윤정", 33, 50);

        Student[] students = {student1, student2};
        for (Student student : students) {
            System.out.println(student.getName() + " " + student.getAge() + " " + student.getGrade());
        }
    }
}

class Student {
    private String name;
    private int age;
    private int grade;

    public Student(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }


}
