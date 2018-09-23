package physics;

public class FormulaMethods {
    
    public double one (String v, String v0, String a, String t)
    {
        try{
        if (v.equals("x"))
        {
            double b = Double.parseDouble(v0);
            double c = Double.parseDouble(a);
            double d = Double.parseDouble(t);
            double answer;            
            
            answer = b + (c*d);  
            
            return answer;
        }
        else if (v0.equals("x"))
        {
            double b = Double.parseDouble(v);
            double c = Double.parseDouble(a);
            double d = Double.parseDouble(t);
            double answer;
            
            answer = b - (c*d);
            
            return answer;
        }
        else if (a.equals("x"))
        {
            double b = Double.parseDouble(v);
            double c = Double.parseDouble(v0);
            double d = Double.parseDouble(t);
            double answer;
            
            answer = (b - c) / d;
            
            return answer;
        }
        else if (t.equals("x"))
        {
            double b = Double.parseDouble(v);
            double c = Double.parseDouble(v0);
            double d = Double.parseDouble(a);
            double answer;
            
            answer = (b - c) / d;
            
            return answer;
        }
        else
        {
            System.out.println("You must put x for one variable.");
            return Math.PI;
        }
        }
        catch (Exception NumberFormatException){
            System.out.println("You have either entered invalid values or more than 1 x. Please try again.");
            return Math.PI;
        }
    }
    
    public double two (String x, String x0, String v0, String t, String a)
    {
        try{
        if (x.equals("x"))
        {
            double b = Double.parseDouble(x0);
            double c = Double.parseDouble(v0);
            double d = Double.parseDouble(t);
            double e = Double.parseDouble(a);
            double answer;            
            
            answer = b + (c * d) + ((1/2) * e * (d * d));  
            
            return answer;
        }
        else if (x0.equals("x"))
        {
            double b = Double.parseDouble(x);
            double c = Double.parseDouble(v0);
            double d = Double.parseDouble(t);
            double e = Double.parseDouble(a);
            double answer;            
            
            answer = b - (c * d) - ((1/2) * e * (d * d));  
            
            return answer;
        }
        else if (v0.equals("x"))
        {
            double b = Double.parseDouble(x);
            double c = Double.parseDouble(x0);
            double d = Double.parseDouble(t);
            double e = Double.parseDouble(a);
            double answer;            
            
            answer = (b - c - ((1/2) * e * (d * d)))/d;  
            
            return answer;
        }
        else if (t.equals("x"))
        {
            double b = Double.parseDouble(x);
            double c = Double.parseDouble(x0);
            double d = Double.parseDouble(v0);
            double e = Double.parseDouble(a);
            double answer;            
            
            answer = ((d * -1) + Math.sqrt((d*d) + (2 * e * (b - c))))/e;  
            
            return answer;
        }
        else if (a.equals("x"))
        {
            double b = Double.parseDouble(x);
            double c = Double.parseDouble(x0);
            double d = Double.parseDouble(v0);
            double e = Double.parseDouble(t);
            double answer;            
            
            answer = (2 * (b - c - (d * e)))/(e * e);  
            
            return answer;
        }
        else
        {
            System.out.println("You must put x for one variable.");
            return Math.PI;
        }
        }
        catch (Exception NumberFormatException){
            System.out.println("You have either entered invalid values or more than 1 x. Please try again.");
            return Math.PI;
        }
    }
    
    public double three (String v, String v0, String a, String x, String x0)
    {
        try{
        if (v.equals("x"))
        {
            double b = Double.parseDouble(v0);
            double c = Double.parseDouble(a);
            double d = Double.parseDouble(x);
            double e = Double.parseDouble(x0);
            double answer;            
            
            answer = (b * b) + 2 * c *(d + e);  
            
            return answer;
        }
        else if (v0.equals("x"))
        {
            double b = Double.parseDouble(v);
            double c = Double.parseDouble(a);
            double d = Double.parseDouble(x);
            double e = Double.parseDouble(x0);
            double answer;            
            
            answer = Math.sqrt((b * b) - 2 * c * (d - e));  
            
            return answer;
        }
        else if (a.equals("x"))
        {
            double b = Double.parseDouble(v);
            double c = Double.parseDouble(v0);
            double d = Double.parseDouble(x);
            double e = Double.parseDouble(x0);
            double answer;            
            
            answer = ((b * b) - (c * c))/(2 * (d - e));  
            
            return answer;
        }
        else if (x.equals("x"))
        {
            double b = Double.parseDouble(v);
            double c = Double.parseDouble(v0);
            double d = Double.parseDouble(a);
            double e = Double.parseDouble(x0);
            double answer;            
            
            answer = (((b * b) - (c * c)) / 2 * d) + e;  
            
            return answer;
        }
        else if (x0.equals("x"))
        {
            double b = Double.parseDouble(v);
            double c = Double.parseDouble(v0);
            double d = Double.parseDouble(a);
            double e = Double.parseDouble(x);
            double answer;            
            
            answer = ((b * b) - (c * c)) / (2 * d);  
            
            return answer;
        }
        else
        {
            System.out.println("You must put x for one variable.");
            return Math.PI;
        }
        }
        catch (Exception NumberFormatException){
            System.out.println("You have either entered invalid values or more than 1 x. Please try again.");
            return Math.PI;
        }
    }
    
     public double four (String F, String m, String a)
    {
        try{
        if (F.equals("x"))
        {
            double b = Double.parseDouble(m);
            double c = Double.parseDouble(a);
            double answer;            
            
            answer = b * c;  
            
            return answer;
        }
        else if (m.equals("x"))
        {
            double b = Double.parseDouble(F);
            double c = Double.parseDouble(a);
            double answer;            
            
            answer = b / c;  
            
            return answer;
        }
        else if (a.equals("x"))
        {
            double b = Double.parseDouble(F);
            double c = Double.parseDouble(m);
            double answer;            
            
            answer = b / c;  
            
            return answer;
        }
        else
        {
            System.out.println("You must put x for one variable.");
            return Math.PI;
        }
        }
        catch (Exception NumberFormatException){
            System.out.println("You have either entered invalid values or more than 1 x. Please try again.");
            return Math.PI;
        }
    }
     
      public double five (String F, String mu, String N) 
    {
        try{
        if (F.equals("x"))
        {
            double b = Double.parseDouble(mu);
            double c = Double.parseDouble(N);
            double answer;            
            
            answer = b * c;  
            
            return answer;
        }
        else if (mu.equals("x"))
        {
            double b = Double.parseDouble(F);
            double c = Double.parseDouble(N);
            double answer;            
            
            answer = b / c;  
            
            return answer;
        }
        else if (N.equals("x"))
        {
            double b = Double.parseDouble(F);
            double c = Double.parseDouble(mu);
            double answer;            
            
            answer = b / c;  
            
            return answer;
        }
        else
        {
            System.out.println("You must put x for one variable.");
            return Math.PI;
        }
        }
        catch (Exception NumberFormatException){
            System.out.println("You have either entered invalid values or more than 1 x. Please try again.");
            return Math.PI;
        }
    } 
      
      public double six (String a, String v, String r)
    {
        try{
        if (a.equals("x"))
        {
            double b = Double.parseDouble(v);
            double c = Double.parseDouble(r);
            double answer;            
            
            answer = (b * b) / c;  
            
            return answer;
        }
        else if (v.equals("x"))
        {
            double b = Double.parseDouble(a);
            double c = Double.parseDouble(r);
            double answer;            
            
            answer = Math.sqrt(b * c);  
            
            return answer;
        }
        else if (r.equals("x"))
        {
            double b = Double.parseDouble(a);
            double c = Double.parseDouble(v);
            double answer;            
            
            answer = (c * c) / b;  
            
            return answer;
        }
        else
        {
            System.out.println("You must put x for one variable.");
            return Math.PI;
        }
        }
        catch (Exception NumberFormatException){
            System.out.println("You have either entered invalid values or more than 1 x. Please try again.");
            return Math.PI;
        }
    }
      
      public double seven (String tau, String r, String F, String theta)
    {
        try{
        if (tau.equals("x"))
        {
            double b = Double.parseDouble(r);
            double c = Double.parseDouble(F);
            double d = Double.parseDouble(theta);
            double answer;            
            
            answer = b * c * Math.sin(d);  
            
            return answer;
        }
        else if (r.equals("x"))
        {
            double b = Double.parseDouble(tau);
            double c = Double.parseDouble(F);
            double d = Double.parseDouble(theta);
            double answer;            
            
            answer = b / (c * Math.sin(d));  
            
            return answer;
        }
        else if (F.equals("x"))
        {
            double b = Double.parseDouble(tau);
            double c = Double.parseDouble(r);
            double d = Double.parseDouble(theta);
            double answer;            
            
            answer = b / (c * Math.sin(d));  
            
            return answer;
        }
        else if (theta.equals("x"))
        {
            double b = Double.parseDouble(tau);
            double c = Double.parseDouble(r);
            double d = Double.parseDouble(F);
            double answer;            
            
            answer = (1 / Math.sin(b / (c * d)));
            
            return answer;
        }
        else
        {
            System.out.println("You must put x for one variable.");
            return Math.PI;
        }
        }
        catch (Exception NumberFormatException){
            System.out.println("You have either entered invalid values or more than 1 x. Please try again.");
            return Math.PI;
        }
    }
      
      public double eight (String p, String m, String v)
    {
        try{
        if (p.equals("x"))
        {
            double b = Double.parseDouble(m);
            double c = Double.parseDouble(v);
            double answer;            
            
            answer = b * c;  
            
            return answer;
        }
        else if (m.equals("x"))
        {
            double b = Double.parseDouble(p);
            double c = Double.parseDouble(v);
            double answer;            
            
            answer = b / c;  
            
            return answer;
        }
        else if (v.equals("x"))
        {
            double b = Double.parseDouble(p);
            double c = Double.parseDouble(m);
            double answer;            
            
            answer = b / c; 
            
            return answer;
        }
        else
        {
            System.out.println("You must put x for one variable.");
            return Math.PI;
        }
        }
        catch (Exception NumberFormatException){
            System.out.println("You have either entered invalid values or more than 1 x. Please try again.");
            return Math.PI;
        }
    }
      
      public double nine (String J, String F, String deltat)
    {
        try{
        if (J.equals("x"))
        {
            double b = Double.parseDouble(F);
            double c = Double.parseDouble(deltat);
            double answer;            
            
            answer = b * c;  
            
            return answer;
        }
        else if (F.equals("x"))
        {
            double b = Double.parseDouble(J);
            double c = Double.parseDouble(deltat);
            double answer;            
            
            answer = b / c;  
            
            return answer;
        }
        else if (deltat.equals("x"))
        {
            double b = Double.parseDouble(J);
            double c = Double.parseDouble(F);
            double answer;            
            
            answer = b / c; 
            
            return answer;
        }
        else
        {
            System.out.println("You must put x for one variable.");
            return Math.PI;
        }
        }
        catch (Exception NumberFormatException){
            System.out.println("You have either entered invalid values or more than 1 x. Please try again.");
            return Math.PI;
        }
    }
      
      public double ten (String K, String m, String v)
    {
        try{
        if (K.equals("x"))
        {
            double b = Double.parseDouble(m);
            double c = Double.parseDouble(v);
            double answer;            
            
            answer = 0.5 * b * c * c;  
            
            return answer;
        }
        else if (m.equals("x"))
        {
            double b = Double.parseDouble(K);
            double c = Double.parseDouble(v);
            double answer;            
            
            answer = (2 * b) / (c * c);  
            
            return answer;
        }
        else if (v.equals("x"))
        {
            double b = Double.parseDouble(K);
            double c = Double.parseDouble(m);
            double answer;            
            
            answer = Math.sqrt((2 * b) / c); 
            
            return answer;
        }
        else
        {
            System.out.println("You must put x for one variable.");
            return Math.PI;
        }
        }
        catch (Exception NumberFormatException){
            System.out.println("You have either entered invalid values or more than 1 x. Please try again.");
            return Math.PI;
        }
    }
      
    public double eleven (String U, String m, String g, String h)
    {
        try{
        if (U.equals("x"))
        {
            double b = Double.parseDouble(m);
            double c = Double.parseDouble(g);
            double d = Double.parseDouble(h);
            double answer;            
            
            answer = b * c * d;  
            
            return answer;
        }
        else if (m.equals("x"))
        {
            double b = Double.parseDouble(U);
            double c = Double.parseDouble(g);
            double d = Double.parseDouble(h);
            double answer;            
            
            answer = b / (c * d);  
            
            return answer;
        }
        else if (g.equals("x"))
        {
            double b = Double.parseDouble(U);
            double c = Double.parseDouble(m);
            double d = Double.parseDouble(h);
            double answer;            
            
            answer = b / (c * d);  
            
            return answer;
        }
        else if (h.equals("x"))
        {
            double b = Double.parseDouble(U);
            double c = Double.parseDouble(m);
            double d = Double.parseDouble(g);
            double answer;            
            
            answer = b / (c * d);
            
            return answer;
        }
        else
        {
            System.out.println("You must put x for one variable.");
            return Math.PI;
        }
        }
        catch (Exception NumberFormatException){
            System.out.println("You have either entered invalid values or more than 1 x. Please try again.");
            return Math.PI;
        }
    }
      
    public double twelve (String W, String F, String deltar, String theta)
    {
        try{
        if (W.equals("x"))
        {
            double b = Double.parseDouble(F);
            double c = Double.parseDouble(deltar);
            double d = Double.parseDouble(theta);
            double answer;            
            
            answer = b * c * d;  
            
            return answer;
        }
        else if (F.equals("x"))
        {
            double b = Double.parseDouble(W);
            double c = Double.parseDouble(deltar);
            double d = Double.parseDouble(theta);
            double answer;            
            
            answer = b / (c * d);  
            
            return answer;
        }
        else if (deltar.equals("x"))
        {
            double b = Double.parseDouble(W);
            double c = Double.parseDouble(F);
            double d = Double.parseDouble(theta);
            double answer;            
            
            answer = b / (c * d);  
            
            return answer;
        }
        else if (theta.equals("x"))
        {
            double b = Double.parseDouble(W);
            double c = Double.parseDouble(F);
            double d = Double.parseDouble(deltar);
            double answer;            
            
            answer = (1 / Math.cos(b / (c * d)));
            
            return answer;
        }
        else
        {
            System.out.println("You must put x for one variable.");
            return Math.PI;
        }
        }
        catch (Exception NumberFormatException){
            System.out.println("You have either entered invalid values or more than 1 x. Please try again.");
            return Math.PI;
        }
    }
    
    public double thirteen (String P_avg, String W, String deltat)
    {
        try{
        if (P_avg.equals("x"))
        {
            double b = Double.parseDouble(W);
            double c = Double.parseDouble(deltat);
            double answer;            
            
            answer = b / c;  
            
            return answer;
        }
        else if (W.equals("x"))
        {
            double b = Double.parseDouble(P_avg);
            double c = Double.parseDouble(deltat);
            double answer;            
            
            answer = b * c;  
            
            return answer;
        }
        else if (deltat.equals("x"))
        {
            double b = Double.parseDouble(P_avg);
            double c = Double.parseDouble(W);
            double answer;            
            
            answer = c / b; 
            
            return answer;
        }
        else
        {
            System.out.println("You must put x for one variable.");
            return Math.PI;
        }
        }
        catch (Exception NumberFormatException){
            System.out.println("You have either entered invalid values or more than 1 x. Please try again.");
            return Math.PI;
        }
    }
    
    public double fourteen (String P, String F, String v, String theta)
    {
        try{
        if (P.equals("x"))
        {
            double b = Double.parseDouble(F);
            double c = Double.parseDouble(v);
            double d = Double.parseDouble(theta);
            double answer;            
            
            answer = b * c * Math.cos(d);  
            
            return answer;
        }
        else if (F.equals("x"))
        {
            double b = Double.parseDouble(P);
            double c = Double.parseDouble(v);
            double d = Double.parseDouble(theta);
            double answer;            
            
            answer = b / (c * Math.cos(d));  
            
            return answer;
        }
        else if (v.equals("x"))
        {
            double b = Double.parseDouble(P);
            double c = Double.parseDouble(F);
            double d = Double.parseDouble(theta);
            double answer;            
            
            answer = b / (c * Math.cos(d));  
            
            return answer;
        }
        else if (theta.equals("x"))
        {
            double b = Double.parseDouble(P);
            double c = Double.parseDouble(F);
            double d = Double.parseDouble(v);
            double answer;            
            
            answer = (1 / Math.cos(b / (c * d)));
            
            return answer;
        }
        else
        {
            System.out.println("You must put x for one variable.");
            return Math.PI;
        }
        }
        catch (Exception NumberFormatException){
            System.out.println("You have either entered invalid values or more than 1 x. Please try again.");
            return Math.PI;
        }
    }
      
    public double fifteen (String F, String k, String x)
    {
        try{
        if (F.equals("x"))
        {
            double b = Double.parseDouble(k);
            double c = Double.parseDouble(x);
            double answer;            
            
            answer = -b * c;  
            
            return answer;
        }
        else if (k.equals("x"))
        {
            double b = Double.parseDouble(F);
            double c = Double.parseDouble(x);
            double answer;            
            
            answer = -b / c;  
            
            return answer;
        }
        else if (x.equals("x"))
        {
            double b = Double.parseDouble(F);
            double c = Double.parseDouble(k);
            double answer;            
            
            answer = -c / b; 
            
            return answer;
        }
        else
        {
            System.out.println("You must put x for one variable.");
            return Math.PI;
        }
        }
        catch (Exception NumberFormatException){
            System.out.println("You have either entered invalid values or more than 1 x. Please try again.");
            return Math.PI;
        }
    }
    
    public double sixteen (String U, String k, String x)
    {
        try{
        if (U.equals("x"))
        {
            double b = Double.parseDouble(k);
            double c = Double.parseDouble(x);
            double answer;            
            
            answer = 0.5 * b * c * c;  
            
            return answer;
        }
        else if (k.equals("x"))
        {
            double b = Double.parseDouble(U);
            double c = Double.parseDouble(x);
            double answer;            
            
            answer = 2 * b / (c * c);  
            
            return answer;
        }
        else if (x.equals("x"))
        {
            double b = Double.parseDouble(U);
            double c = Double.parseDouble(k);
            double answer;            
            
            answer = Math.sqrt((2 * b) / c);  
            
            return answer;
        }
        else
        {
            System.out.println("You must put x for one variable.");
            return Math.PI;
        }
        }
        catch (Exception NumberFormatException){
            System.out.println("You have either entered invalid values or more than 1 x. Please try again.");
            return Math.PI;
        }
    }
    
    public double seventeen (String T, String m, String k)
    {
        try{
        if (T.equals("x"))
        {
            double b = Double.parseDouble(m);
            double c = Double.parseDouble(k);
            double answer;            
            
            answer = 2 * Math.PI * Math.sqrt(b / c);  
            
            return answer;
        }
        else if (m.equals("x"))
        {
            double b = Double.parseDouble(T);
            double c = Double.parseDouble(k);
            double answer;            
            
            answer = (b / (2 * Math.PI)) * (b / (2 * Math.PI)) * c;  
            
            return answer;
        }
        else if (k.equals("x"))
        {
            double b = Double.parseDouble(T);
            double c = Double.parseDouble(m);
            double answer;            
            
            answer = 1 / ((b / (2 * Math.PI)) * (b / (2 * Math.PI)) / c);  
            
            return answer;
        }
        else
        {
            System.out.println("You must put x for one variable.");
            return Math.PI;
        }
        }
        catch (Exception NumberFormatException){
            System.out.println("You have either entered invalid values or more than 1 x. Please try again.");
            return Math.PI;
        }
    }
    
    public double eighteen (String T, String l, String g)
    {
        try{
        if (T.equals("x"))
        {
            double b = Double.parseDouble(l);
            double c = Double.parseDouble(g);
            double answer;            
            
            answer = 2 * Math.PI * Math.sqrt(b / c);  
            
            return answer;
        }
        else if (l.equals("x"))
        {
            double b = Double.parseDouble(T);
            double c = Double.parseDouble(g);
            double answer;            
            
            answer = (b / (2 * Math.PI)) * (b / (2 * Math.PI)) * c;  
            
            return answer;
        }
        else if (g.equals("x"))
        {
            double b = Double.parseDouble(T);
            double c = Double.parseDouble(l);
            double answer;            
            
            answer = 1 / ((b / (2 * Math.PI)) * (b / (2 * Math.PI)) / c);  
            
            return answer;
        }
        else
        {
            System.out.println("You must put x for one variable.");
            return Math.PI;
        }
        }
        catch (Exception NumberFormatException){
            System.out.println("You have either entered invalid values or more than 1 x. Please try again.");
            return Math.PI;
        }
    }
    
    public double nineteen (String T, String f)
    {
        try{
        if (T.equals("x"))
        {
            double b = Double.parseDouble(f);
            double answer;            
            
            answer = 1 / b;  
            
            return answer;
        }
        else if (f.equals("x"))
        {
            double b = Double.parseDouble(T);
            double answer;            
            
            answer = 1 / b;  
            
            return answer;
        }
        else
        {
            System.out.println("You must put x for one variable.");
            return Math.PI;
        }
        }
        catch (Exception NumberFormatException){
            System.out.println("You have either entered invalid values or more than 1 x. Please try again.");
            return Math.PI;
        }
    }
    
    public double twenty (String F, String G, String m1, String m2, String r)
    {
        try{
        if (F.equals("x"))
        {
            double b = Double.parseDouble(G);
            double c = Double.parseDouble(m1);
            double d = Double.parseDouble(m2);
            double e = Double.parseDouble(r);
            double answer;            
            
            answer = - ((b * c * d) / (e * e));  
            
            return answer;
        }
        else if (G.equals("x"))
        {
            double b = Double.parseDouble(F);
            double c = Double.parseDouble(m1);
            double d = Double.parseDouble(m2);
            double e = Double.parseDouble(r);
            double answer;            
            
            answer = - (b * (e * e)) / (c * d);  
            
            return answer;
        }
        else if (m1.equals("x"))
        {
            double b = Double.parseDouble(F);
            double c = Double.parseDouble(G);
            double d = Double.parseDouble(m2);
            double e = Double.parseDouble(r);
            double answer;            
            
            answer = - (b * (e * e)) / (c * d);  
            
            return answer;
        }
        else if (m2.equals("x"))
        {
            double b = Double.parseDouble(F);
            double c = Double.parseDouble(G);
            double d = Double.parseDouble(m1);
            double e = Double.parseDouble(r);
            double answer;            
            
            answer = - (b * (e * e)) / (c * d);  
            
            return answer;
        }
        else if (r.equals("x"))
        {
            double b = Double.parseDouble(F);
            double c = Double.parseDouble(G);
            double d = Double.parseDouble(m1);
            double e = Double.parseDouble(m2);
            double answer;            
            
            answer = Math.sqrt((-c * d * e) / b);  
            
            return answer;
        }
        else
        {
            System.out.println("You must put x for one variable.");
            return Math.PI;
        }
        }
        catch (Exception NumberFormatException){
            System.out.println("You have either entered invalid values or more than 1 x. Please try again.");
            return Math.PI;
        }
    }
    
    public double twentyOne (String U, String G, String m1, String m2, String r)
    {
        try{
        if (U.equals("x"))
        {
            double b = Double.parseDouble(G);
            double c = Double.parseDouble(m1);
            double d = Double.parseDouble(m2);
            double e = Double.parseDouble(r);
            double answer;            
            
            answer = - ((b * c * d) / e);  
            
            return answer;
        }
        else if (G.equals("x"))
        {
            double b = Double.parseDouble(U);
            double c = Double.parseDouble(m1);
            double d = Double.parseDouble(m2);
            double e = Double.parseDouble(r);
            double answer;            
            
            answer = - (b * (e)) / (c * d);  
            
            return answer;
        }
        else if (m1.equals("x"))
        {
            double b = Double.parseDouble(U);
            double c = Double.parseDouble(G);
            double d = Double.parseDouble(m2);
            double e = Double.parseDouble(r);
            double answer;            
            
            answer = - (b * (e)) / (c * d);  
            
            return answer;
        }
        else if (m2.equals("x"))
        {
            double b = Double.parseDouble(U);
            double c = Double.parseDouble(G);
            double d = Double.parseDouble(m1);
            double e = Double.parseDouble(r);
            double answer;            
            
            answer = - (b * (e)) / (c * d);  
            
            return answer;
        }
        else if (r.equals("x"))
        {
            double b = Double.parseDouble(U);
            double c = Double.parseDouble(G);
            double d = Double.parseDouble(m1);
            double e = Double.parseDouble(m2);
            double answer;            
            
            answer = (-c * d * e) / b;  
            
            return answer;
        }
        else
        {
            System.out.println("You must put x for one variable.");
            return Math.PI;
        }
        }
        catch (Exception NumberFormatException){
            System.out.println("You have either entered invalid values or more than 1 x. Please try again.");
            return Math.PI;
        }
    }
}