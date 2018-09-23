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
        
        onFormula(vars);
        
    }
   
    
    public static void onFormula(String[] variables){
        int[] formulas = {0, 0, 0};
        for (int i = 0; i < variables.length; i++) {
            
            if (variables[i].equals("v") || variables[i].equals("v0") || variables[i].equals("a") || variables[i].equals("t")) {
                formulas[0]++;
            }
            
            if (variables[i].equals("x") || variables[i].equals("x0") || variables[i].equals("v0") || variables[i].equals("t") || variables[i].equals("a")) {
                formulas[1]++;
            }
            
            if (variables[i].equals("v") || variables[i].equals("v0") || variables[i].equals("a") || variables[i].equals("x") || variables[i].equals("x0")) {
                formulas[2]++;
            }       
        }
        
        
        if (formulas[0] == 3) {
            System.out.println("v = v0 + at");
        }
        
        if (formulas[1] == 4) {
            System.out.println("x = x0 + v0t + 0.5at2");
        }
        
        if (formulas[0] == 4) {
            System.out.println("v2 = v02 + 2a(x - x0)");
        }
        
    }
    
}

 
