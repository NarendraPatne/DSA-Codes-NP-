public class N {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == j) {
                    System.out.print("* ");
                    continue;
                } else if (j == 0 || j == n) {
                    System.out.print("* ");
                    continue;
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}