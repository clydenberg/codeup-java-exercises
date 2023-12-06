import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int i = 5;
//        while(i <= 15) {
//            System.out.println(i);
//            i++;
//        }

//        int i = 0;
//        do {
//            System.out.println(i);
//            i += 2;
//        } while(i <= 100);

//        int i = 100;
//        do {
//            System.out.println(i);
//            i -= 5;
//        } while(i >= -10);

//        long i = 2;
//        do {
//            System.out.println(i);
//            i *= i;
//        } while(i < 1000000);

//        for(int i = 5; i <= 15; i++) {
//            System.out.println(i);
//        }

//        for(int i = 0; i <= 100; i += 2) {
//            System.out.println(i);
//        }

//        for(long i = 2; i < 1000000; i *= i) {
//            System.out.println(i);
//        }

//        for(int i = 1; i <= 100; i++) {
//            if(i % 15 == 0) {
//                System.out.println("FizzBuzz");
//            } else if(i % 5 == 0) {
//                System.out.println("Buzz");
//            } else if(i % 3 == 0) {
//                System.out.println("Fizz");
//            } else {
//                System.out.println(i);
//            }
//        }

//        System.out.println("Enter a number between 1 and 10: ");
//        String userInput = sc.nextLine();
//        int userInt = Integer.parseInt(userInput);
//        int i = 1;
//        if(i <= userInt){
//            System.out.println("Here is your table!");
//            System.out.println("number | squared | cubed");
//            System.out.println("------ | ------- | -----");
//            for(i = 1; i <= userInt; i++) {
//                System.out.printf("%-7d| %-8d| %-5d%n", i, i * i, i * i * i);
//            }
//        } else {
//            System.out.println("Please enter a number between 1 and 10");
//        }

        System.out.println("Enter your grade: ");
        String userInput = sc.nextLine();
        int userInt = Integer.parseInt(userInput);
        if(userInt >= 95){
            System.out.println("A+");
        } else if(userInt >= 92){
            System.out.println("A");
        } else if(userInt >= 88){
            System.out.println("A-");
        } else if(userInt >= 85){
            System.out.println("B+");
        } else if(userInt >= 82){
            System.out.println("B");
        } else if(userInt >= 80){
            System.out.println("B-");
        } else if(userInt >= 75){
            System.out.println("C+");
        } else if(userInt >= 70){
            System.out.println("C");
        } else if(userInt >= 67){
            System.out.println("C-");
        } else if(userInt >= 65){
            System.out.println("D+");
        } else if(userInt >= 62){
            System.out.println("D");
        } else if(userInt >= 60){
            System.out.println("D-");
        } else if(userInt >= 59){
            System.out.println("F");
        } else {
            System.out.println("You didn't enter a number between 0 and 100");
        }


    }
}
