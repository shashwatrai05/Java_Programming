public class RecursionCounter {
    static int M, N;
    static int c = 0;

    public static void main(String[] args) {
        M = 17;
        N = 17;
        func(0, 0);
        System.out.println(c);
    }

    public static void func(int i, int j) {
        
        c++; 
        
        if (i == M - 1 && j == N - 1) return;
        if (i >= M || j >= N) return;

        func(i, j + 1); // Move right
        func(i + 1, j); // Move down
    }
}
