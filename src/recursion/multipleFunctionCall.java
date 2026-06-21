package recursion;
public class multipleFunctionCall {

    static int func(int n) {
        if (n <= 1)
            return n;

        return func(n - 1) + func(n - 2);
    }

    public static void main(String[] args) {

        int n = 10;

        for (int i = 0; i <= n; i++) {
            System.out.print(func(i) + " ");
        }
    }
}