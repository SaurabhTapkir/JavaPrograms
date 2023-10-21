
//Complete this factorial su 
import java.util.Scanner;

public class FactorialSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number:");
        int n = sc.nextInt();
        
        //int n=5;
        int sum = 0;
        int fact = 1;
        
            for (int i = 1; i <= n; i++)
             {
                fact =  fact * i;
                sum=sum+fact;
            }
        System.out.println(sum);
          
        }
         
    }


// Qfind find