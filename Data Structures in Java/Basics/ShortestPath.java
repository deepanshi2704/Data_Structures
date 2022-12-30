public class ShortestPath {
    public static float getShortestPath(String path) {

        int x = 0;

        int y = 0;
        int n = path.length();

        for (int i = 0; i < n; i++) {

            char dir = path.charAt(i);

            // SOUTH
            if (dir == 'S') {
                y--;
            }

            // NORTH
            else if (dir == 'N') {
                y++;
            }

            // WEST
            else if (dir == 'W') {
                x--;
            }

            // EAST
            else {
                x++;
            }

        }

        int X2 = x * x;
        int Y2 = y * y;
        float result = (float) Math.sqrt(X2 + Y2);
        return result;
    }

    public static void main(String args[]) {
        String path = "WNEENESENNN";
        System.out.println(getShortestPath(path));
    }
}
