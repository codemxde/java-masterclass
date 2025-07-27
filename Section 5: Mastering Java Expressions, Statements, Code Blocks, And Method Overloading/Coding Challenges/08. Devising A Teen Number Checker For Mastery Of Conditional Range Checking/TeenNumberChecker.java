public class TeenNumberChecker {
    // write code here
    public static boolean hasTeen(int A, int B, int C) {
        return isTeen(A) || isTeen(B) || isTeen(C);
    }

    public static boolean isTeen(int age) {
        return age >= 13 && age <= 19;
    }
}