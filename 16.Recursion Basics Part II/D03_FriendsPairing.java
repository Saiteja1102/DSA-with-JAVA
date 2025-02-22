public class D03_FriendsPairing {
    public static int friendspair(int n){
        if(n == 1 || n == 2){
            return n;
        }
        //choice
        //single
        int fnm1 = friendspair(n-1);
        
        // pair
        int fnm2 = friendspair(n-2);
        int pairways = (n-1) * fnm2;

        int totalways = fnm1 + pairways;
        return totalways;
    }

    public static int singlelinepair(int n){
        if(n == 1||n == 2){
            return n;
        }
        return singlelinepair(n-1) + (n-1) * singlelinepair(n-2);
    }
    public static void main(String[] args) {
        System.out.println(friendspair(3));
        System.out.println(singlelinepair(3));
    }
}
