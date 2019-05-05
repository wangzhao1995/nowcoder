/**
 * @Author：zhaowang1
 * @Description: Date: Created in 16:18 2019/5/5
 */
public class TestMatrixFindOne {
    //从左下角开始判断
    public Boolean findOne(int[][] matrix,int target){
        if(matrix == null) return false;
        int rows = matrix.length;
        int cols = 0;
        while(rows >= 0 && cols < matrix[0].length){
            if(matrix[rows-1][cols] > target) rows--;
            else if(matrix[rows-1][cols] < target) cols++;
            else return true;
        }
        return false;
    }
    public static void main(String[] args){
        TestMatrixFindOne test = new TestMatrixFindOne();
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        System.out.println(test.findOne(matrix,123));
    }
}
