package src.javacodes.math;

public class Fibonacci {
    public static int fib(int num) {
        int prev = 0, next = 1;
        while (num > 0) {
            next += prev;
            prev = next - prev;
            num--;
        }
        return prev;
    }

    public static void main(String[] args) {
        System.out.println(2);
    }
}