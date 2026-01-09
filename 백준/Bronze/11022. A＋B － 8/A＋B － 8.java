import java.util.Scanner;

  public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] aArray = new int[n];
        int[] bArray = new int[n];
        int[] sumArray = new int[n];
        
       for(int i=0;i<n;i++){
        int a = sc.nextInt();
        int b = sc.nextInt();
        aArray[i] = a;
        bArray[i] = b;
        sumArray[i] = a+b;
       }

       for(int i=0;i<n;i++){
        System.out.println("Case #" + (i+1) + ": " + aArray[i] + " + " + bArray[i] + " = " + sumArray[i]);
       }
        sc.close();
    }
}
