import java.util.Scanner;

public class Main {
  
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
          int n = sc.nextInt();
          
          if(n == -1)
            break;
          else {
            
          int[] nums = new int[n];

          int key =0;
          int sum =0;
         
          
            for(int i=1;i<n;i++){
              if(n%i == 0){
                nums[key++]=i;    
                sum+=i;
              }
            }
            if(sum == n){
              System.out.print(n + " = ");
              for(int i=0;i<key;i++){
                if(i!=key-1){
                  System.out.print(nums[i] + " + ");
                }
                else{
                  System.out.println(nums[i]);
                }
              }
            }
            else if(sum != n){
              System.out.println(n + " is NOT perfect.");
            }
          }
      }
      sc.close();
      }
      
}
