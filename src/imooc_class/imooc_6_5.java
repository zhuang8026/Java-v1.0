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
            double numData = Double.parseDouble(num); // "1.01", "2.02", "3.03"
//            int ss = (int) numData; // 強制轉換
            int sss = new Double(numData).intValue(); // intValue() 功能是將 包裝類型 轉 基本類型
            System.out.println(sss);
        }

        System.out.println("-----------");

        for (String num : nums){
            Float sss = Float.parseFloat(num);
            int dd = sss.intValue();
//            int sss = Integer.parseInt(num);
            System.out.println(dd);
        }
    }
}
