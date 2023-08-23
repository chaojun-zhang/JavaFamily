package code.array;
import java.util.HashMap;
import java.util.Map;

public class ChineseToArabic {
    private static final Map<Character, Integer> numberMap = new HashMap<>();

    static {
        numberMap.put('零', 0);
        numberMap.put('一', 1);
        numberMap.put('二', 2);
        numberMap.put('三', 3);
        numberMap.put('四', 4);
        numberMap.put('五', 5);
        numberMap.put('六', 6);
        numberMap.put('七', 7);
        numberMap.put('八', 8);
        numberMap.put('九', 9);
    }

    public static int convertChineseNumberToArabic(String chineseNumber) {
        int result = 0;
        int section = 0;
        int number = 0;

        for (int i = 0; i < chineseNumber.length(); i++) {
            char c = chineseNumber.charAt(i);

            if (numberMap.containsKey(c)) {
                number = numberMap.get(c);
            } else {
                switch (c) {
                    case '亿':
                        section = (section + number) * 100000000;
                        result += section;
                        section = 0;
                        break;
                    case '万':
                        section = (section + number) * 10000;
                        result += section;
                        section = 0;
                        break;
                    case '千':
                        section += number * 1000;
                        break;
                    case '百':
                        section += number * 100;
                        break;
                    case '十':
                        section += number * 10;
                        break;
                    default:
                        break;
                }
                number = 0;
            }
        }

        result += section + number;

        return result;
    }

    public static void main(String[] args) {
        String chineseNumber = "二亿三千五百三十六万零六千三百八十六";
        int arabicNumber = convertChineseNumberToArabic(chineseNumber);
        System.out.println(chineseNumber + " 转换为阿拉伯数字为：" + arabicNumber);
    }
}