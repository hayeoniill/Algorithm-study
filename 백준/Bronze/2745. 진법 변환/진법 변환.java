import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      String n = sc.next();
      int b = sc.nextInt();

      int sum =0;

      for(int i=0;i<n.length();i++){
        char c = n.charAt(i);
        int value;
        if(c >= '0' && c <= '9')
          value = c -'0';
        else 
          value = c - 'A' + 10;

        sum = sum * b + value;
          
      }
      System.out.println(sum);

      sc.close();
    }
}
