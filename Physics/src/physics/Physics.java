package physics;
import java.util.*;

public class Physics extends FormulaMethods {

    static String[] allVariables = {"v", "v0", "a", "t", "x", "x0", "F", "m", "mu", "N", "r", "tau", "theta", "p", "K",
            "U", "g", "h", "W", "deltar", "P", "deltat", "k", "T", "l", "f", "G", "m1", "m2"};
    
    static int[] formNum= new int[25]; 
    
    public static void main(String[] args) {
        
        int amount = getUserInput();
        
        while (amount == 0)
        {
            amount = getUserInput();
        }
            
        String[] vars = new String[amount];
        
        System.out.println("Enter the variables below");
        for (int i = 1; i <= amount; i++) {
            String v = getUserVariables(i);
            vars[i-1] = v;
        }
        onFormula(vars);
        
        int check = numCheck();
        
        while (check == 0 || check == -1)
        {
            if (check == 0)
            {
            System.out.println("Formula number not applicable");
            check = numCheck();
            }
            else
            {
                check = numCheck();
            }   
        }
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
            
            if (variables[i].equals("sumF") || variables[i].equals("m") || variables[i].equals("a"))
            {
                formulas[3]++;
            }
            
            if (variables[i].equals("F") || variables[i].equals("mu") || variables[i].equals("N"))
            {
                formulas[4]++;
            }
            
            if (variables[i].equals("a") || variables[i].equals("v") || variables[i].equals("r"))
            {
                formulas[5]++;
            }
            
            if (variables[i].equals("tau") || variables[i].equals("r") || variables[i].equals("F") || variables[i].equals("theta"))
            {
                formulas[6]++;
            }
            
            if (variables[i].equals("p") || variables[i].equals("m") || variables[i].equals("v"))
            {
                formulas[7]++;
            }
            
            if (variables[i].equals("J") || variables[i].equals("F") || variables[i].equals("deltat"))
            {
                formulas[8]++;
            }
            
            if (variables[i].equals("K") || variables[i].equals("m") || variables[i].equals("v"))
            {
                formulas[9]++;
            }
            
            if (variables[i].equals("deltaU") || variables[i].equals("m") || variables[i].equals("g") || variables[i].equals("h"))
            {
                formulas[10]++;
            }
            
            if (variables[i].equals("W") || variables[i].equals("F") || variables[i].equals("deltar") || variables[i].equals("theta"))
            {
                formulas[11]++;
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
        
        int i = 0;
        
        if (formulas[0] == 3) {
            System.out.println("[1] v = v\u2080 + at");
            formNum[i] = 1;
            i++;
        }
        
        if (formulas[1] == 4) {
            System.out.println("[2] x = x\u2080 + v\u2080t + 0.5at^2");
            formNum[i] = 2;
            i++;
        }
        
        if (formulas[2] == 4) {
            System.out.println("[3] v^2 = v\u2080^2 + 2a(x - x\u2080)");
            formNum[i] = 3;
            i++;
        }
        
        if (formulas[3] == 2) {
            System.out.println("[4] ΣF = ma");
            formNum[i] = 4;
            i++;
        }
        
        if (formulas[4] == 2) {
            System.out.println("[5] F <= µN");
            formNum[i] = 5;
            i++;
        }
        
        if (formulas[5] == 2) {
            System.out.println("[6] a = v^2/r");
            formNum[i] = 6;
            i++;
        }
        
        if (formulas[6] == 3) {
            System.out.println("[7] τ = rF sin(θ)");
            formNum[i] = 7;
            i++;
        }
        
        if (formulas[7] == 2) {
            System.out.println("[8] p = mv");
            formNum[i] = 8;
            i++;
        }
        
        if (formulas[8] == 2) {
            System.out.println("[9] J = FΔt");
            formNum[i] = 9;
            i++;
        }
        
        if (formulas[9] == 2) {
            System.out.println("[10] K = 1/2mv^2");
            formNum[i] = 10;
            i++;
        }
        
        if (formulas[10] == 3) {
            System.out.println("[11] ΔU = mgh");
            formNum[i] = 11;
            i++;
        }
        
        if (formulas[11] == 3) {
            System.out.println("[12] W = FΔr cos(θ)");
            formNum[i] = 12;
            i++;
        }
        
        if (formulas[12] == 2) {
            System.out.println("[13] P = W / Δt");
            formNum[i] = 13;
            i++;
        }
        
        if (formulas[13] == 3) {
            System.out.println("[14] P = Fvcosθ");
            formNum[i] = 14;
            i++;
        }
        
        if (formulas[14] == 2) {
            System.out.println("[15] F = -kx");
            formNum[i] = 15;
            i++;
        }
        
        if (formulas[15] == 2) {
            System.out.println("[16] U = 0.5kx^2");
            formNum[i] = 16;
            i++;
        }
        
        if (formulas[16] == 2) {
            System.out.println("[17] T = 2π * sqrt(m / k)");
            formNum[i] = 17;
            i++;
        }
        
        if (formulas[17] == 2) {
            System.out.println("[18] T = 2π * sqrt(l / g)");
            formNum[i] = 18;
            i++;
        }
        
        if (formulas[18] == 1) {
            System.out.println("[19] T = 1 / f");
            formNum[i] = 19;
            i++;
        }
        
        if (formulas[19] == 4) {
            System.out.println("[20] F = - (Gm1m2 / r\u2072)");
            formNum[i] = 20;
            i++;
        }
        
        if (formulas[20] == 4) {
            System.out.println("[21] U = - (Gm1m2 / r)");
            formNum[i] = 21;
            i++;
        }
        
        if (formulas[0] != 3 && formulas[1] != 4 && formulas[2] != 4 && formulas[3] != 2 && formulas[4] != 3
                && formulas[5] != 2 && formulas[6] != 3 && formulas[7] != 2 && formulas[8] != 2 && formulas[9] != 2 
                && formulas[10] != 3 && formulas[11] != 3 && formulas[12] != 2 && formulas[13] != 3 && formulas[14] != 2
                && formulas[15] != 2 && formulas[16] != 2 && formulas[17] != 2 && formulas[18] != 1 && formulas[19] != 4
                && formulas[20] != 4) {
            System.out.println("No solutions exist with the given variables");
        }
        
    }
    
    public static int getUserInput() {
        Scanner scan = new Scanner(System.in);
        int amount = 0;
        
        System.out.println("Please enter the amount of variables you have:");
            
        try
        {
            int test = scan.nextInt();
            amount = test;
        }
        catch (Exception InputMismatchException)
        {
            System.out.println("Please enter a positive integer.");
        }
        
        return amount;
        
    }
    
    public static String getUserVariables(int i) {
        Scanner scan = new Scanner(System.in);        
        System.out.print("Variable " + i + ":");
        String v = scan.nextLine();
        for (int j = 0; j < allVariables.length; j++) {
            if (v.equals(allVariables[j])) {
                System.out.println("MATCH");
                break;
            } else if (j == 29) {
                getUserVariables(i);
            }
        }
        return v;
    }
    
    public static int numCheck() {
        Scanner scan = new Scanner(System.in);
        int num = 0;
        System.out.println("Enter the formula number:");
        
        int x = 0;
        
        try
        {
            num = scan.nextInt();
        }
        catch (Exception InputMismatchException)
        {
            System.out.println("Please enter an integer 1-21.");
            return -1;
        }
        
        
        
        for (int i = 0; i < formNum.length; i++)
        {
            if (num == formNum[i])
            {
                //Call Method
                onCalculate(num);
                x++;
            }
            else
            {
                x = x + 0;
            }
            
        }
        
        return x;
    }
    
    public static void onCalculate (int i) {
        FormulaMethods hello = new FormulaMethods();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the values for the following variables. For the variable you are solving for, put an 'x'");
    switch (i) {
            case 1: {
                System.out.print("v: ");
                String a = scan.nextLine();
                System.out.print("v0: ");
                String b = scan.nextLine();
                System.out.print("a: ");
                String c = scan.nextLine();
                System.out.print("t: ");
                String d = scan.nextLine();
                while (hello.one(a, b, c, d) == Math.PI){
                    onCalculate(1);
                }
                System.out.println(hello.one(a, b, c, d));
                break;
            }
            case 2: {
                System.out.print("x: ");
                String a = scan.nextLine();
                System.out.print("x0: ");
                String b = scan.nextLine();
                System.out.print("v0: ");
                String c = scan.nextLine();
                System.out.print("a: ");
                String d = scan.nextLine();
                System.out.print("t: ");
                String e = scan.nextLine();
                while (hello.two(a, b, c, d, e) == Math.PI){
                    onCalculate(2);
                }
                System.out.println(hello.two(a, b, c, d, e));
                break;
            }
            case 3: {
                System.out.print("v: ");
                String a = scan.nextLine();
                System.out.print("v0: ");
                String b = scan.nextLine();
                System.out.print("a: ");
                String c = scan.nextLine();
                System.out.print("x: ");
                String d = scan.nextLine();
                System.out.print("x0: ");
                String e = scan.nextLine();
                while (hello.three(a, b, c, d, e) == Math.PI){
                    onCalculate(3);
                }
                System.out.println(hello.three(a, b, c, d, e));
                break;
            }
            case 4: {
                System.out.print("F: ");
                String a = scan.nextLine();
                System.out.print("m: ");
                String b = scan.nextLine();
                System.out.print("a: ");
                String c = scan.nextLine();
                while (hello.four(a, b, c) == Math.PI){
                    onCalculate(4);
                }
                System.out.println(hello.four(a, b, c));
                break;
            }
            case 5: {
                System.out.print("F: ");
                String a = scan.nextLine();
                System.out.print("μ: ");
                String b = scan.nextLine();
                System.out.print("N: ");
                String c = scan.nextLine();
                while (hello.five(a, b, c) == Math.PI){
                    onCalculate(5);
                }
                System.out.println(hello.five(a, b, c));
                break;
            }
            case 6: {
                System.out.print("a: ");
                String a = scan.nextLine();
                System.out.print("v: ");
                String b = scan.nextLine();
                System.out.print("r: ");
                String c = scan.nextLine();
                while (hello.six(a, b, c) == Math.PI){
                    onCalculate(6);
                }
                System.out.println(hello.six(a, b, c));
                break;
            }
            case 7: {
                System.out.print("τ: ");
                String a = scan.nextLine();
                System.out.print("r: ");
                String b = scan.nextLine();
                System.out.print("F: ");
                String c = scan.nextLine();
                System.out.print("θ: ");
                String d = scan.nextLine();
                while (hello.seven(a, b, c, d) == Math.PI){
                    onCalculate(7);
                }
                System.out.println(hello.seven(a, b, c, d));
                break;
            }
            case 8: {
                System.out.print("p: ");
                String a = scan.nextLine();
                System.out.print("m: ");
                String b = scan.nextLine();
                System.out.print("v: ");
                String c = scan.nextLine();
                while (hello.eight(a, b, c) == Math.PI){
                    onCalculate(8);
                }
                System.out.println(hello.eight(a, b, c));
                break;
            }
            case 9: {
                System.out.print("J: ");
                String a = scan.nextLine();
                System.out.print("F: ");
                String b = scan.nextLine();
                System.out.print("Δt: ");
                String c = scan.nextLine();
                while (hello.nine(a, b, c) == Math.PI){
                    onCalculate(9);
                }
                System.out.println(hello.nine(a, b, c));
                break;
            }
            case 10: {
                System.out.print("K: ");
                String a = scan.nextLine();
                System.out.print("m: ");
                String b = scan.nextLine();
                System.out.print("v: ");
                String c = scan.nextLine();
                while (hello.ten(a, b, c) == Math.PI){
                    onCalculate(10);
                }
                System.out.println(hello.ten(a, b, c));
                break;
            }
            case 11: {
                System.out.print("U: ");
                String a = scan.nextLine();
                System.out.print("m: ");
                String b = scan.nextLine();
                System.out.print("g: ");
                String c = scan.nextLine();
                System.out.print("h: ");
                String d = scan.nextLine();
                while (hello.eleven(a, b, c, d) == Math.PI){
                    onCalculate(11);
                }
                System.out.println(hello.eleven(a, b, c, d));
                break;
            }    
            case 12: {
                System.out.print("W: ");
                String a = scan.nextLine();
                System.out.print("F: ");
                String b = scan.nextLine();
                System.out.print("Δr: ");
                String c = scan.nextLine();
                System.out.print("θ: ");
                String d = scan.nextLine();
                while (hello.twelve(a, b, c, d) == Math.PI){
                    onCalculate(12);
                }
                System.out.println(hello.twelve(a, b, c, d));
                break;
            }    
            case 13: {
                System.out.print("P: ");
                String a = scan.nextLine();
                System.out.print("W: ");
                String b = scan.nextLine();
                System.out.print("Δt: ");
                String c = scan.nextLine();
                while (hello.thirteen(a, b, c) == Math.PI){
                    onCalculate(13);
                }
                System.out.print(hello.thirteen(a, b, c));
                break;
            }    
            case 14: {
                System.out.print("P: ");
                String a = scan.nextLine();
                System.out.print("F: ");
                String b = scan.nextLine();
                System.out.print("v: ");
                String c = scan.nextLine();
                System.out.print("θ: ");
                String d = scan.nextLine();
                while (hello.fourteen(a, b, c, d) == Math.PI){
                    onCalculate(14);
                }
                System.out.println(hello.fourteen(a, b, c, d));
                break;
            }    
            case 15: {
                System.out.print("F: ");
                String a = scan.nextLine();
                System.out.print("k: ");
                String b = scan.nextLine();
                System.out.print("x: ");
                String c = scan.nextLine();
                while (hello.fifteen(a, b, c) == Math.PI){
                    onCalculate(15);
                }
                System.out.println(hello.fifteen(a, b, c));
                break;
            }    
            case 16: {
                System.out.print("U: ");
                String a = scan.nextLine();
                System.out.print("k: ");
                String b = scan.nextLine();
                System.out.print("x: ");
                String c = scan.nextLine();
                while (hello.sixteen(a, b, c) == Math.PI){
                    onCalculate(16);
                }
                System.out.println(hello.sixteen(a, b, c));
                break;
            }    
            case 17: {
                System.out.print("T: ");
                String a = scan.nextLine();
                System.out.print("m: ");
                String b = scan.nextLine();
                System.out.print("k: ");
                String c = scan.nextLine();
                while (hello.seventeen(a, b, c) == Math.PI){
                    onCalculate(17);
                }
                System.out.println(hello.seventeen(a, b, c));
                break;
            }  
            case 18: {
                System.out.print("T: ");
                String a = scan.nextLine();
                System.out.print("l: ");
                String b = scan.nextLine();
                System.out.print("g: ");
                String c = scan.nextLine();
                while (hello.eighteen(a, b, c) == Math.PI){
                    onCalculate(18);
                }
                System.out.println(hello.eighteen(a, b, c));
                break;
            }  
            case 19: {
                System.out.print("T: ");
                String a = scan.nextLine();
                System.out.print("F: ");
                String b = scan.nextLine();
                while (hello.nineteen(a, b) == Math.PI){
                    onCalculate(19);
                }
                System.out.println(hello.nineteen(a, b));
                break;
            }  
            case 20: {
                System.out.print("F: ");
                String a = scan.nextLine();
                System.out.print("G: ");
                String b = scan.nextLine();
                System.out.print("m1: ");
                String c = scan.nextLine();
                System.out.print("m2: ");
                String d = scan.nextLine();
                System.out.print("r: ");
                String e = scan.nextLine();
                while (hello.twenty(a, b, c, d, e) == Math.PI){
                    onCalculate(20);
                }
                System.out.println(hello.twenty(a, b, c, d, e));
                break;
            }  
            case 21: {
                System.out.print("U: ");
                String a = scan.nextLine();
                System.out.print("G: ");
                String b = scan.nextLine();
                System.out.print("m1: ");
                String c = scan.nextLine();
                System.out.print("m2: ");
                String d = scan.nextLine();
                System.out.print("r: ");
                String e = scan.nextLine();
                while (hello.twentyOne(a, b, c, d, e) == Math.PI){
                    onCalculate(21);
                }
                System.out.println(hello.twentyOne(a, b, c, d, e));
                break;
            }  
        }
    }
    
}

 
