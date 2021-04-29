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

        double cccc = 1.1;
        String sss = Double.toString(cccc); // 強制轉 字串對象

        String aaaa = "888";
        int bbbb = Integer.valueOf(aaaa); // 強制轉 數字基本類型

        String str = "180.20";
        // 将 字符串 转换为 基本类型
        double fff = Double.parseDouble(str); // number 200.2 轉 基本
        Double ffff = Double.parseDouble(str); // object { 200.2 } 轉 對象

        System.out.println("str 转换为double型后与整数20的求和结果为： "+(fff + 20));
        System.out.println("str 转换为double型后与整数20的求和结果为： "+(ffff + 20));

    }
}
