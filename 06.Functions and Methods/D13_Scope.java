/*
        Scope

    1. Method Scope -> we can use only after decleration
                    -> only used in that method
    
    2. Block Scope -> We can use in that specific block 
    {
        Block of code
    }
    
    3. Class Scope -> access Modifiers -> Private, Public, Protected
 */

public class D13_Scope {
    public static void scope(){ 
        // int s = 45; // Method scope
    }
    public static void main(String[] args){
       // System.out.println(s); // here we get error -> s can't be resolved to variable

       {
            // int p = 45; // Block Scope
       }
       //System.out.println(p); // here we get error -> p can't be resolved to variable

    }
}
