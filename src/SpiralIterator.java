import java.util.Iterator;

public class SpiralIterator<E> implements Iterator<E>{

    private E[][] matrix;
    private int row, col;
    private int rows, cols;
    private int direction;

    // Directions: right, down, left, up
    private final int[] dRow = {0, 1, 0, -1};
    private final int[] dCol = {1, 0, -1, 0};

    public SpiralIterator(E[][] matrix) {
        this.matrix = matrix;
        this.rows = matrix.length;
        this.cols = matrix[0].length;
        this.row = 0;
        this.col = 0;
        this.direction = 0; // Start by moving right
    }

    @Override
    public boolean hasNext() {
        // Check if the current position is within bounds and the value is not visited (not -1)
        return row >= 0 && row < rows && col >= 0 && col < cols && matrix[row][col] != null;
    }

    @Override
    public E next() {
        // Store the current value
        E value = matrix[row][col];

        // Mark the current position as visited
        matrix[row][col] = null;

        // Calculate the next position
        int nextRow = row + dRow[direction];
        int nextCol = col + dCol[direction];

        // Check if the next position is out of bounds or already visited
        if (nextRow < 0 || nextRow >= rows || nextCol < 0 || nextCol >= cols || matrix[nextRow][nextCol] == null) {
            // Change direction clockwise
            direction = (direction + 1) % 4;
            nextRow = row + dRow[direction];
            nextCol = col + dCol[direction];
        }

        row = nextRow;
        col = nextCol;

        return value;
    }
    
}
