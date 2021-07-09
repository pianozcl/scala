import java.util.ArrayList;

/**
 * @author : chenliangzhou
 * create at:  2021/6/30  11:35 AM
 * @description: 测试引用
 **/
public class TestRef {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();


        ArrayList list1 = list;
        ArrayList list2 = list;

        System.out.println(list.hashCode());
        System.out.println(list1.hashCode());
        System.out.println(list2.hashCode());
    }
}
