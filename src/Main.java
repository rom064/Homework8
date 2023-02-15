
public class Main {
    public static void main(String[] args) {
        task1234();
    }

    public static void task1234() {
        System.out.println("Задача 1");
        int[] a = new int[3];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        System.out.println(a[0]);

        double[] d = {1.57, 7.654, 9.986};
        System.out.println(d[0]);
        int[] s = new int[5];
        s[0] = 3;
        s[1] = 4;
        s[2] = 7;
        s[3] = 9;
        s[4] = 11;
        System.out.println(s[4]);
        System.out.println(" ");
        System.out.println("Задача 2");
        System.out.print(a[0] + ", " + a[1] + ", " + a[2]);
        System.out.println();
        System.out.print(d[0] + ", " + d[1] + ", " + d[2]);
        System.out.println();
        System.out.println(" ");
        System.out.println("Задача 3");
        System.out.print(a[2] + ", " + a[1] + ", " + a[0]);
        System.out.println();
        System.out.print(d[2] + ", " + d[1] + ", " + d[0]);
        System.out.println();
        System.out.println(" ");
        System.out.println("Задача 4");
        for (int i = 0; i < a.length; i++) {
            if (i != a.length % 2) {
                System.out.println(a[i] + 1);
            }
        }
    }
}