public class Atividade2 {
    public static void main(String[] args) {
        int intMax1 = intMax(1, 2, 3);
        int intMax2 = intMax(1, 3, 2);
        int intMax3 = intMax(3, 2, 1);

        System.out.println(intMax1);
        System.out.println(intMax2);
        System.out.println(intMax3);
    }

    public static int intMax(int a, int b, int c) {
        if (a <= b && a <= c) {
            if (b <= c) {
                return c;
            } else {
                return b;
            }
        } else if (b <= a && b <= c) {
            if (a <= c) {
                return c;
            } else {
                return a;
            }
        } else {
            if (a <= b) {
                return b;
            } else {
                return a;
            }
        }

    }
}
