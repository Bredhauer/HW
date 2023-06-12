package Day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("Lars", "FIAE");
        Teacher teacher = new Teacher("Herr Berk", "Hardwerk");
        student.printInfo();
        teacher.printInfo();

        System.out.println(student.getName());
        System.out.println(teacher.getName());
    }
}
