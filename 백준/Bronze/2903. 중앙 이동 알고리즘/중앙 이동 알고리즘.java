import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int side = 1;
        for (int i = 0; i < n; i++) {
            side *= 2;
        }
        side += 1;

        System.out.println(side * side);

        sc.close();
    }
}
