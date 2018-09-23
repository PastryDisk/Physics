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
        
        onFormula(vars);
        
    }
   
    
    public static void onFormula(String[] variables){
        int[] formulas = new int[21];
        
        for (int i = 0; i < formulas.length; i++) {
            formulas[i] = 0;
        }
        
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
            
            if (variables[i].equals("P_avg") || variables[i].equals("W") || variables[i].equals("deltat")) {
                formulas[12]++;
            }
            
            if (variables[i].equals("P") || variables[i].equals("F") || variables[i].equals("v") || variables[i].equals("theta")) {
                formulas[13]++;
            }
            
            if (variables[i].equals("F") || variables[i].equals("k") || variables[i].equals("x")) {
                formulas[14]++;
            }
            
            if (variables[i].equals("U") || variables[i].equals("k") || variables[i].equals("x")) {
                formulas[15]++;
            }
            
            if (variables[i].equals("T") || variables[i].equals("m") || variables[i].equals("k")) {
                formulas[16]++;
            }
            
            if (variables[i].equals("T") || variables[i].equals("l") || variables[i].equals("g")) {
                formulas[17]++;
            }
            
            if (variables[i].equals("T") || variables[i].equals("f")) {
                formulas[18]++;
            }
            
            if (variables[i].equals("F") || variables[i].equals("G") || variables[i].equals("m1") || variables[i].equals("m2") || variables[i].equals("r")) {
                formulas[19]++;
            }
            
            if (variables[i].equals("U") || variables[i].equals("G") || variables[i].equals("m1") || variables[i].equals("m2") || variables[i].equals("r")) {
                formulas[20]++;
            }
            
        }
        
        
        if (formulas[0] == 3) {
            System.out.println("v = v0 + at");
        }
        
        if (formulas[1] == 4) {
            System.out.println("x = x0 + v0t + 0.5at^2");
        }
        
        if (formulas[2] == 4) {
            System.out.println("v^2 = v0^2 + 2a(x - x0)");
        }
        
        if (formulas[12] == 2) {
            System.out.println("P_avg = W / Δt");
        }
        
        if (formulas[13] == 3) {
            System.out.println("P = Fvcosθ");
        }
        
        if (formulas[14] == 2) {
            System.out.println("F = -kx");
        }
        
        if (formulas[15] == 2) {
            System.out.println("U = 0.5kx^2");
        }
        
        if (formulas[16] == 2) {
            System.out.println("T = 2π * sqrt(m / k)");
        }
        
        if (formulas[17] == 2) {
            System.out.println("T = 2π * sqrt(l / g)");
        }
        
        if (formulas[18] == 1) {
            System.out.println("T = 1 / f");
        }
        
        if (formulas[19] == 4) {
            System.out.println("F = - (Gm1m2 / r^2)");
        }
        
        if (formulas[20] == 4) {
            System.out.println("U = - (Gm1m2 / r)");
        }
        
        if (formulas[0] != 3 && formulas[1] != 4 && formulas[2] != 4 && formulas[3] != 2 && formulas[4] != 3
                && formulas[5] != 2 && formulas[6] != 3 && formulas[7] != 2 && formulas[8] != 2 && formulas[9] != 2 
                && formulas[10] != 3 && formulas[11] != 3 && formulas[12] != 2 && formulas[13] != 3 && formulas[14] != 2
                && formulas[15] != 2 && formulas[16] != 2 && formulas[17] != 2 && formulas[18] != 1 && formulas[19] != 4
                && formulas[20] != 4) {
            System.out.println("No formulas exist with the given variables");
        }
        
    }
    
}

 
