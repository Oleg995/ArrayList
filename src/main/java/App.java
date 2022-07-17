
import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{1, 2, 3}, {1, 2, 3}};
        System.out.println(Arrays.toString(flattenMatrix(arr)));
    }

    public static int[] flattenMatrix(int[][] counts) {
        var num = counts.length;
        var bum = counts[0].length;
        int[]numbers = new int[num * bum];
        var index = 0;
        if (counts.length == 0) {
            return  new int[0];
        }

        for (var i = 0; i < counts.length; i++) {
            for (var j = 0; j < counts[i].length; j++) {
                numbers[index] = counts[i][j];
                index++;
            }
        }
        return numbers;
    }
}