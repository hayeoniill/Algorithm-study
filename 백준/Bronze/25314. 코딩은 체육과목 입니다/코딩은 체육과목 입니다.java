import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int number = sc.nextInt();
        for(int i = number/4; i>0; i--){
            System.out.print("long ");
        }
        System.out.println("int");
    }
    
}
