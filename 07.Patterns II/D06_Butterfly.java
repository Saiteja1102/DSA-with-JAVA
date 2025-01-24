public class D06_Butterfly {
    public static void butterfly(int n){
        // 1st Half
        for(int i =1;i<=n;i++){
            // star
            for(int j =1;j<=i;j++){
                System.out.print("* ");
            }

            // spaces
            for(int j =1;j<=(2*(n-i));j++){
                System.out.print("  ");
            }

            // stars
            for(int j =1;j <= i;j++){
                System.out.print("* ");
            }

            System.out.println();
        }


        // 2nd Half
        for(int i = n; i >= 1;i--){
            // star
            for(int j =1;j<=i;j++){
                System.out.print("* ");
            }

            // spaces
            for(int j =1;j<=(2*(n-i));j++){
                System.out.print("  ");
            }

            // stars
            for(int j =1;j <= i;j++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }
    public static void main(String[] args){
        butterfly(4);
    }
}
