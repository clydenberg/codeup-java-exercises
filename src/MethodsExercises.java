public class MethodsExercises {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 2;
        System.out.println(addition(num1, num2));
        System.out.println(subtraction(num1, num2));
        System.out.println(multiplication(num1, num2));
        System.out.println(division(num1, num2));
        System.out.println(modulus(num1, num2));
    }
    public static int addition(int num1, int num2) {
        return num1 + num2;
    }
    public static int subtraction(int num1, int num2) {
        return num1 - num2;
    }
//    public static int multiplication(int num1, int num2) {
//        return num1 * num2;
//    }
    public static int division(int num1, int num2) {
        return num1 / num2;
    }
    public static int modulus(int num1, int num2) {
        return num1 % num2;
    }

    //Create your multiplication method without the * operator (Hint: a loop might be helpful).
    //Do the above with recursion.
    public static int multiplication(int num1, int num2) {
        int result = 0;
        for (int i = 0; i < num2; i++) {
            result += num1;
        }
        return result;
    }
//    Create your multiplication method without the * operator (Hint: a loop might be helpful).
//    Do the above with recursion.
    public static int multiplication2(int num1, int num2) {
        if (num1 == 0 || num2 == 0) {
            return 0;
        }
        return (num1 + multiplication2(num1, num2 - 1));
    }
}
