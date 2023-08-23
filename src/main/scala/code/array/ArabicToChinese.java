package code.array;

import java.util.HashMap;
import java.util.Map;

public class ArabicToChinese {
    static String[] ch_value = new String[]{"零","一","二","三","四","五","六","七","八","九"};

    private static void numToChinese(int value,StringBuilder res) {
        boolean hasQian = false;
        boolean hasBai = false;
        boolean hasShi = false;
        //2024
        while (value >0) {
            if (value / 1000 >0) {
                res.append(ch_value[value / 1000]).append("千");
                value %= 1000;
                hasQian = true;
            } else if (value /100 >0) {
                res.append(ch_value[value / 100]).append("百");
                hasBai = true;
                value %= 100;
            } else if (value /10 >0) {
                if (hasQian && !hasBai) {
                    res.append("零");
                }
                res.append(ch_value[value / 10]).append("十");
                hasShi = true;
                value %= 10;
            } else {
                if ((hasQian || hasBai) && !hasShi ) {
                    res.append("零");
                }
                res.append(ch_value[value]);
                break;
            }
        }
    }

    public static String arabicToChinese(long value) {

        if (value == 0) {
            return "零";
        }
        // 先用value模一万，如果等于0，说明value是万的倍数。
        // 如果不等于0,那么说明section部分为千位，百位，十位，或者各位的其中一种。
        StringBuilder res = new StringBuilder();
        //如果是
        boolean hasSection = false;
       while (value >0) {
           //220000230023
           if (value /100000000L >0) {
               int section = (int)(value / 100000000L);
               numToChinese(section,res);
               res.append("亿");
               value = value % 100000000L;
               hasSection = true;
           }else if (value /10000 >0) {
               numToChinese((int)(value / 10000),res);
               res.append("万");
               value = value % 10000;
               hasSection = true;
           } else {
               if (hasSection && value <1000) {
                   res.append("零");
               }
               numToChinese((int)value,res);
               break;
           }
       }
        return res.toString();
    }
    public static void main(String[] args){
        String res = arabicToChinese(12020241024L);

        System.out.println("12323240024L 转成中文等于： " + res);

    }
}
