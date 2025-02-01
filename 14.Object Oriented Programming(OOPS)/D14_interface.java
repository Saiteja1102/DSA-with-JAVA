public class D14_interface {
    public static void main(String[] args) {
        Queen q1 = new Queen();
        q1.moves();
    }
}

interface chessPlayer{
    void moves();
}

class Queen implements chessPlayer{
    public void moves(){
        System.out.println("up, down, left, right, diagonal (in all 4 directions)");
    }
}

class King implements chessPlayer{
    public void moves(){
        System.out.println("up, down, left, right, diagonal (by only 1 step)");
    }
}