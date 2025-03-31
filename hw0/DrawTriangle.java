public class DrawTriangle {
    public static void drawTriangle(int n) {
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < i + 1; ++j) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        drawTriangle(2);
        drawTriangle(7);
    }
}
