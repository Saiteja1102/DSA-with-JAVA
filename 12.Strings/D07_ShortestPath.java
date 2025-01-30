// Shortest Path

public class D07_ShortestPath {
    public static void shortestpath(String path){
        int x = 0,y = 0;
        for(int i = 0;i<path.length();i++){
            // North
            if(path.charAt(i) == 'N'){
                y++;
            }
            // South
            else if(path.charAt(i) == 'S'){
                y--;
            }
            // West
            else if(path.charAt(i) == 'W'){
                x--;
            }
            else{
                x++;
            }
        }

        // Shortest distance
        Float shortestdis = (float)Math.sqrt(x*x + y*y);
        System.out.println("Shortest diatance = "+shortestdis);
    }
    public static void main(String[] args) {
        String path = "WNEENESENNN";
        shortestpath(path);
    }
}
