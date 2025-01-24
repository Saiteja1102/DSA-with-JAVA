// Hollow Rhombus

public class D08_Hollow_Rhombus {
    public static void hollow_rhombus(int n){
        // outer
        for(int i =1;i<=n;i++){
            //inner
            //spaces
            for(int j = 1;j<=n-i;j++){
                System.out.print("  ");
            }
            //stars
            for(int j =1;j<=n;j++){
                if(i==1 || j==1 || i==n || j==n){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        hollow_rhombus(5);
    }
}
