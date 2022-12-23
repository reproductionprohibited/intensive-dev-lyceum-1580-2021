import java.text.ParseException;
import java.util.HashMap;

public class Roman {
    private static Object roman(String s) {
        try {
            int sInt = Integer.parseInt(s);
            return roman(sInt);
        }
        catch (Exception e) {
            HashMap<Character, Integer> roman = new HashMap<>() {{
                put('I', 1);
                put('V', 5);
                put('X', 10);
                put('L', 50);
                put('C', 100);
                put('D', 500);
                put('M', 1000);
            }};
            Integer decAnswer = 0;
            for (int i = 0; i < s.length(); ++i) {
                if ((i + 1 < s.length()) && (roman.get(s.charAt(i)) < roman.get(s.charAt(i + 1)))) {
                    decAnswer -= roman.get(s.charAt(i));
                } else {
                    decAnswer += roman.get(s.charAt(i));
                }
            }
            return decAnswer;
        }
    }

    private static String roman(Integer s) {
        int[] intValues = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romanValues = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuilder resultRoman = new StringBuilder();
        for(int i = 0; i < intValues.length; ++i) {
            while (s >= intValues[i]) {
                s -= intValues[i];
                resultRoman.append(romanValues[i]);
            }
        }
        return resultRoman.toString();
    }

    public static void main(String[] args) {
        System.out.println(roman(1));
        System.out.println(roman(5));
        System.out.println(roman(983));
        System.out.println("=-=-=-=-=-=-=-=-=");
        System.out.println(roman("I"));
        System.out.println(roman("V"));
        System.out.println(roman("D"));
        System.out.println("=-=-=-=-=-=-=-=-=");
        System.out.println(roman("1904"));
        System.out.println(roman("1990"));
        System.out.println(roman("2017"));
    }
}
