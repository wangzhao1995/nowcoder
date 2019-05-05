/**
 * @Author：zhaowang1
 * @Description: Date: Created in 14:18 2019/5/5
 */
public class TestRectCover {
    public int Rect(int target){
        if(target <= 1) return 1;
        if(target * 2 == 2) return 1;
        if(target * 2 == 4) return 2;
        else return Rect(target-1) + Rect(target-2);
    }
    public static void main(String[] args){
        TestRectCover test = new TestRectCover();
        System.out.println(test.Rect(10));
    }
}
