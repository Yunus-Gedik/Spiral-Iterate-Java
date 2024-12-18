import java.util.Iterator;

public class App {
    public static void main(String[] args) throws Exception {
        SpiralArray s = new SpiralArray();
        System.out.println(
            s.spiralOrder(new int[][] {
                {1,2},
                {4,3}
            })
        );
        System.out.println(
            s.spiralOrder(new int[][] {
                {1,2,3},
                {8,9,4},
                {7,6,5},
            })
        );
        System.out.println(
            s.spiralOrder(new int[][] {
                {1,  2, 3,4},
                {12,13,14,5},
                {11,16,15,6},
                {10, 9, 8,7},
            })
        );
        System.out.println(
            s.spiralOrder(new int[][] {
                {1 ,  2,  3,  4, 5},
                {16, 17, 18, 19, 6},
                {15, 24, 25, 20, 7},
                {14, 23, 22, 21, 8},
                {13, 12, 11, 10, 9},
            })
        );
        System.out.println(
            s.spiralOrder(new int[][] {
                {1 ,  2, 3},
                {12, 13, 4},
                {11, 14, 5},
                {10, 15, 6},
                {9 , 8 , 7},
            })
        );
        System.out.println(
            s.spiralOrder(new int[][] {
                {0,   1,  2, 3},
                {13, 14, 15, 4},
                {12, 19, 16, 5},
                {11, 18, 17, 6},
                {10,  9,  8, 7},
            })
        );
        System.out.println(
            s.spiralOrder(new int[][] {
                {1 ,  2,  3,  4,  5, 6},
                {14, 15, 16, 17, 18, 7},
                {13, 12, 11, 10,  9, 8}
            })
        );
        System.out.println(
            s.spiralOrder(new int[][] {
                {1,   2,  3, 4},
                {16, 17, 18, 5},
                {15, 24, 19, 6},
                {14, 23, 20, 7},
                {13, 22, 21, 8},
                {12, 11, 10, 9},
            })
        );

        Integer[][] m = new Integer[][] {
            {1,   2,  3, 4},
            {16, 17, 18, 5},
            {15, 24, 19, 6},
            {14, 23, 20, 7},
            {13, 22, 21, 8},
            {12, 11, 10, 9},
        };

        Iterator<Integer> it = new SpiralIterator<>(m);

        while(it.hasNext()){
            System.out.printf("%d ", it.next());
        }
    }
}
