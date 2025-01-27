// Spiral Matrix
/*
Steps:
    1. Intialize startrow,startcol,endrow,endcolumn
    2. Run loop till startrow<=endrow and startcol <= endcol
    3. Top Border
        for(from j = startcol to endcol){
            matrix[startrow][j]
        }
    4. Right Border
        for(from i = startrow + 1 to endcol){
            matrix[i][endcol]
        }
    5. Bottom Border
        for(from j = endcol-1 to startcol){
            matrix[endrow][j]
        }
    6. Left Border
        for(from i = endrow-1 to startrow+1){
            matrix[i][startcol]
        }
    7. Update:
        startrow++
        startcol++
        endrow--
        endcol--
    8. One case for odd rows or colums:
        it can print multiple times the same cell so, for that purpose break the line if startrow and endrow are equal
        simillary, for the column as well
 */

public class D04_SpiralMatrix {
    public static void spiralmatrixprint(int matrix[][]){
        int n = matrix.length;
        int m = matrix[0].length;

        // 1. Intialize startrow,startcol,endrow,endcolumn
        int startrow = 0;
        int endrow = n-1;
        int startcol = 0;
        int endcol = m-1;

        // 2. Run loop till startrow<=endrow and startcol <= endcol
        while(startrow <= endrow && startcol <= endcol){
    
            // 3.Top Border
            for(int j = startcol;j<=endcol;j++){
                System.out.print(matrix[startrow][j]+" ");
            }

            // 4. Right Border
            for(int i = startrow+1;i<=endrow;i++){
                // Special Case
                if(startrow == endrow){
                    break;
                }
                System.out.print(matrix[i][endcol]+" ");
            }

            // 5. Bottom Border
            for(int j = endcol-1;j>=startcol;j--){
                // Special Case
                if(startcol == endcol){
                    break;
                }
                System.out.print(matrix[endcol][j]+" ");
            }

            // 6. Left Border
            for(int i = endrow-1;i>=startrow+1;i--){
                // Special Case
                if(startrow == endrow){
                    break;
                }
                System.out.print(matrix[i][startcol]+" ");
            }

            // 7. Update
            startrow++;
            startcol++;
            endrow--;
            endcol--;
        }

        System.out.println();
    }
    public static void main(String[] args){
        int matrix[][] = {{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
        
        spiralmatrixprint(matrix);
    }
}
