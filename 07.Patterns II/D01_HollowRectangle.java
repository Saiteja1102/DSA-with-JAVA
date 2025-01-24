// Hollow Rectangle Question

public class D01_HollowRectangle {
    public static void hollow_rectangle(int rows,int cols){
        // outer 
        for(int i = 1;i <= rows;i++){
            // inner
            for(int j = 1;j <= cols;j++){
                // cell - (i,j)
                if(i==1 || i==rows || j==1 || j==cols){
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
        hollow_rectangle(4, 5);
    }
}
