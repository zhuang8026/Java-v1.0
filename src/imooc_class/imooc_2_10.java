package imooc_class;

public class imooc_2_10 {
    public static void main(String[] args) {
        int a = 1;
        double b = a; // 基本類型 之間 自動轉換
        System.out.println(b);
        /* -------------------- */
//        double aa = 1.1;
//        int bb = aa; // error  double > int
        /* -------------------- */
//        double aaa = 1.1;
//        char bbb = aaa; // error char != double

        /* -------- 2-10 ------- */
        double cc = 1.1;
        int ss = (int) cc; // ok  強制轉換
        System.out.println(ss);
    }
}
