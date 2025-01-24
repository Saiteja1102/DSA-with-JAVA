// Diamond Pattern

public class D09_Diamond {
    public static void diamond(int n){
        //1st Half
        // outer
        for(int i =1;i<=n;i++){
            //inner
            // space
            for(int j =1;j<=n-i;j++){
                System.out.print("  ");
            }
            // star
            for(int j =1;j<=(2*i-1);j++){
                System.out.print("* ");
            }

            System.out.println();
        }

        // 2nd half
        for(int i = n;i>=1;i--){
            //inner
            // space
            for(int j =1;j<=n-i;j++){
                System.out.print("  ");
            }
            // star
            for(int j =1;j<=(2*i-1);j++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }
    public static void main(String[] args){
        diamond(4);
    }
}
