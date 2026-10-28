public class t38 {
    public static void main(String[] args) {
        int[][] maze = {
            {1, 0, 0, 0},
            {1, 1, 0, 1},
            {0, 1, 0, 0},
            {1, 1, 1, 1}
        };
        int[][] solution = new int[4][4];
        if (solveMaze(maze, 0, 0, solution)) {
            System.out.println("Путь найден:");
            for (int[] row : solution) {
                for (int val : row) System.out.print(val + " ");
                System.out.println();
            }
        } else {
            System.out.println("Путь не найден");
        }
    }
    public static boolean solveMaze(int[][] maze, int x, int y, int[][] sol) {
        if (x == maze.length - 1 && y == maze[0].length - 1 && maze[x][y] == 1) {
            sol[x][y] = 1;
            return true;
        }
        if (x >= 0 && y >= 0 && x < maze.length && y < maze[0].length && maze[x][y] == 1) {
            if (sol[x][y] == 1) return false;
            sol[x][y] = 1;
            if (solveMaze(maze, x + 1, y, sol)) return true;
            if (solveMaze(maze, x, y + 1, sol)) return true;
            sol[x][y] = 0;
            return false;
        }
        return false;
    }
}