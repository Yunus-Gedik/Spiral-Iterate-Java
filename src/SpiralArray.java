import java.util.ArrayList;
import java.util.List;

class SpiralArray{

    SpiralArray(){}

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<Integer>();

        for (int i = 0; result.size() != matrix.length * matrix[0].length; ++i) {
            spiral(i, matrix, result);
        }

        return result;
    }

    private void spiral(int layer, int[][] list, List<Integer> result) {
        int xmin = layer, xmax = list.length - 1 - layer;
        int ymin = layer, ymax = list[0].length - 1 - layer;

        for(int x = xmin, y = ymin; y <= ymax; ++y){
            result.add(list[x][y]);
        }
        if(xmin == xmax){
            return;
        }
        for(int x = xmin + 1, y = ymax; x <= xmax; ++x){
            result.add(list[x][y]);
        }
        if(ymin == ymax){
            return;
        }
        for(int x = xmax, y = ymax - 1; y >= ymin; --y){
            result.add(list[x][y]);
        }
        for(int x = xmax - 1, y = ymin; x >= xmin + 1; --x){
            result.add(list[x][y]);
        }
    }
}