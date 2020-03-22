import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String args[]){
        char[][] grid = new char[][]{{'1','1','1'},{'0','1','0'},{'1','1','1'}};

        boolean [][] visitedGrid = new boolean[grid.length][grid[0].length];
        List<int[]> queue = new ArrayList<>();
        int cnt = 0;

        for(int i =0;i<grid.length;i++){
            for(int j =0;j<grid[i].length;j++){
                if(grid[i][j] == '1' && visitedGrid[i][j] == false){
                    cnt++;
                    int[] xy = new int[]{i,j};
                    visitedGrid[i][j] = true;
                    queue.add(xy);
                    while(!queue.isEmpty()){
                        int x = queue.get(0)[0] + 1;
                        int y = queue.get(0)[1] + 1;
                        queue.remove(0);
                        if( y < grid[0].length && grid[x - 1][y] == '1' && visitedGrid[x - 1][y] == false){
                            int[] newY = new int[] {x-1,y};
                            visitedGrid[x - 1][y] = true;
                            queue.add(newY);
                        }
                        if( x < grid.length && grid[x][y - 1] == '1' && visitedGrid[x][y - 1] == false){
                            int[] newX = new int[] {x,y-1};
                            visitedGrid[x][y - 1] = true;
                            queue.add(newX);
                        }

                        x -= 2;
                        y -= 2;

                        if( y > -1 && grid[x + 1][y] == '1' && visitedGrid[x + 1][y] == false){
                            int[] newY2 = new int[] {x + 1,y};
                            visitedGrid[x + 1][y] = true;
                            queue.add(newY2);
                        }
                        if( x > -1 && grid[x][y + 1] == '1' && visitedGrid[x][y + 1] == false){
                            int[] newX2 = new int[] {x,y + 1};
                            visitedGrid[x][y + 1] = true;
                            queue.add(newX2);
                        }

                    }
                }
            }
        }
        System.out.println(cnt);
    }
}
