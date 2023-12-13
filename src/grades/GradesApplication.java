package grades;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
    public static void getStudentGrades (HashMap<Student, ArrayList<Integer>> studentGrades){
        double avgGrade = 0;
        for (Student student : studentGrades.keySet()) {
             avgGrade += student.getGradeAverage();
        }
        System.out.println(avgGrade/studentGrades.size());
    }

    public static void main(String[] args) {
        Student student1 = new Student("Rimuru", "Tempest");
        Student student2 = new Student("Benimaru", "Tempest");
        Student student3 = new Student("Veldora", "Tempest");
        Student student4 = new Student("Shuna", "Tempest");

        student1.addGrade(98);
        student1.addGrade(100);
        student1.addGrade(100);

        student2.addGrade(70);
        student2.addGrade(70);
        student2.addGrade(70);

        student3.addGrade(45);
        student3.addGrade(50);
        student3.addGrade(45);

        student4.addGrade(100);
        student4.addGrade(100);
        student4.addGrade(100);

        HashMap<String, Student> students = new HashMap<>();
        students.put("demonLordTempest", student1);
        students.put("blackFlameOni", student2);
        students.put("stormDragon", student3);
        students.put("oniPrincess", student4);

        System.out.println("Here's a list of the GitHub usernames of our students:");
        for (String username : students.keySet()) {
            System.out.println("| " + username + " |");
        }

        String userInput;
        do {
            System.out.println("Which student would you like to see more information on?");
            Scanner scanner = new Scanner(System.in);
            userInput = scanner.nextLine();
            if (students.containsKey(userInput)) {
                System.out.println("Name: " + students.get(userInput).getFirstName() + " " + students.get(userInput).getLastName() + " - GitHub Username: " + userInput);
                System.out.println("Grades: " + students.get(userInput).getGrades());
                System.out.println("Current Average: " + students.get(userInput).getGradeAverage());
            } else {
                System.out.println("Sorry, no student found with the GitHub username of " + userInput);
            }
            System.out.println("Would you like to see another student?");
            userInput = scanner.nextLine();
        } while (userInput.equalsIgnoreCase("y"));

        //build a hashmap that allows me access to the students grades

        HashMap<Student, ArrayList<Integer>> studentGrades = new HashMap<>();
        studentGrades.put(student1, student1.getGrades());
        studentGrades.put(student2, student2.getGrades());
        studentGrades.put(student3, student3.getGrades());
        studentGrades.put(student4, student4.getGrades());

        getStudentGrades(studentGrades);
    }
}
