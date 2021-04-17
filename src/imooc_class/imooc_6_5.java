package imooc_class;

public class imooc_6_5 {
    public static void main(String[] args) {
        String[] nums = { "1.01", "2.02", "3.03" };
        String[] strs = { "william", "nick", "Ryan" };
        // 第一種
//        for (int i = 0; i < hobbys.length; i++) {
//            System.out.println(hobbys[i]);
//        }

        // 第二種
        for(String num : nums ){
            System.out.println(num);

            System.out.print("---->");
            Double numData = Double.parseDouble(num); // "1.01", "2.02", "3.03"
//          浮點數 轉 整數 (包裝類型 轉 基本型)
//          方法一： 強型別
//              int ss = (int) numData; // 強制轉換
//          方法二： 手動轉換
//              int sss = new Double(numData).intValue(); // intValue() 功能是將 包裝類型 轉 基本類型
//          方法三： 
            int sss = numData.intValue();
            System.out.println(sss);
        }

        System.out.println("-----------");

        // 第三種
        for (String num : nums){
            Float sss = Float.parseFloat(num);
            int dd = sss.intValue();
//            int sss = Integer.parseInt(num);
            System.out.println(dd);
        }
    }
}
