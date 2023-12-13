package grades;

import java.util.HashMap;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student("Rimuru", "Tempest");
        Student student2 = new Student("Benimaru", "Tempest");
        Student student3 = new Student("Veldora", "Tempest");

        student1.addGrade(98);
        student2.addGrade(70);
        student3.addGrade(45);

//        System.out.println(student1.getFirstName() + " currently has a grade of :" + student1.getGrades());
//        System.out.println(student2.getFirstName() + " currently has a grade of :" + student2.getGrades());
//        System.out.println(student3.getFirstName() + " currently has a grade of :" + student3.getGrades());

        HashMap<Student, String> students = new HashMap<>();
        students.put(student1, "demonLordTempest");
        students.put(student2, "blackFlameOni");
        students.put(student3, "stormDragon");

        System.out.println(students);
    }
}
