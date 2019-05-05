import java.util.*;
/**
 * @Author：zhaowang1
 * @Description: Date: Created in 15:31 2019/5/5
 */
public class TestMatrixInCircle {
    public ArrayList<Integer> printMatrix(int[][] matrix){
        ArrayList<Integer> list = new ArrayList<Integer>();
        int rows = matrix.length;
        int cols = matrix[0].length;
        int layers = (Math.min(rows,cols)-1)/2+1;
        if(matrix == null || rows == 0 || cols == 0) return null;
        for(int i = 0;i < layers; i++){
            for(int k = i; k < cols - i; k++) list.add(matrix[i][k]);
            for(int j = i+1; j < rows - i; j++) list.add(matrix[j][cols - i -1]);
            for(int m = cols - i -2; (m >= i)&&(rows - i -1 != i);m--) list.add(matrix[rows - i -1][m]);
            for(int n = rows - i -2;(n > i)&&(cols - i -1 != i);n--) list.add(matrix[n][i]);
        }
        return list;
    }
    public static void main(String[] args){
        TestMatrixInCircle test = new TestMatrixInCircle();
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(test.printMatrix(matrix));
    }
}
