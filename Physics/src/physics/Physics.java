package physics;
import java.util.*;

public class Physics {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Please enter the amount of variables you have:");
        
        int amount = scan.nextInt();
        
        String[] vars = new String[amount];
        
        System.out.println("Enter the variables below");
        
        for (int i=1; i <= amount; i++)
        {
            Scanner scann = new Scanner(System.in);
            
            System.out.print("Variable " + i + ":");
            
            String v = scann.nextLine();
            
            vars[i-1] = v;
        }
        
        for (int i = 0; i < vars.length; i++)
        {
            System.out.println(vars[i]);
        }
        
        
    }
    
}
