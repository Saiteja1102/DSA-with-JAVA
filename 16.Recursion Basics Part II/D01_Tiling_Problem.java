public class D01_Tiling_Problem {
    public static int tilingProblem(int n){

        // base case
        if(n == 0 || n == 1){
            return 1;
        }
        // vertical choice
        int knm1 = tilingProblem(n-1);

        //horizontal choice
        int knm2 = tilingProblem(n-2);

        // Total ways
        int totalways = knm1 + knm2;
        return totalways;
    }

    public static int singlelinetiling(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        return singlelinetiling(n-1) + singlelinetiling(n-2);
    }
    public static void main(String[] args) {
        System.out.println(tilingProblem(4));
        System.out.println(singlelinetiling(4));
    }
}
