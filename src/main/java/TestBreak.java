/**
 * @author : chenliangzhou
 * create at:  2021/6/27  11:10 PM
 * @description: Java中的循环中断
 **/
public class TestBreak {
    public static void main(String[] args) {
        try {
            for (int i = 0; i < 10; i++) {
                if (i == 3) {
                    throw new Exception();
                }
                System.out.println(i);
            }
        } catch (Exception e) {
            //什么都不做，只是退出循环，替代break功能
        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("end");
    }
}
