/**
 * @author : chenliangzhou
 * create at:  2021/6/27  3:39 PM
 * @description: 数据类型转换测试
 **/
public class TestDataTypeConversion {
    public static void main(String[] args) {
        byte b = 121;
        test(b);        //转换优先级 byte short int
    }

//    public static void test(byte n) {
//        System.out.println("byte");
//    }

//    public static void test(short n) {
//        System.out.println("short");
//    }

    public static void test(int n) {
        System.out.println("int");
    }

    public static void test(char n) {
        System.out.println("char");
    }
}
