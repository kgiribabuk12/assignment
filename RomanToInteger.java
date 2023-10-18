import java.util.*;

public class RomanToInteger {
    public static int romanToInt(String roman) {
        Map<Character, Integer> romanNum = new HashMap<>();
        romanNum.put('I', 1);
        romanNum.put('V', 5);
        romanNum.put('X', 10);
        romanNum.put('L', 50);
        romanNum.put('C', 100);
        romanNum.put('D', 500);
        romanNum.put('M', 1000);

        int total = 0;
        int prevValue = 0;

        for (int i = roman.length() - 1; i >= 0; i--) {
            char numeral = roman.charAt(i);
            int value = romanNum.get(numeral);

            if (value < prevValue) {
                total -= value;
            } else {
                total += value;
            }

            prevValue = value;
        }

        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Roman numeral: ");
        String romanNumeral = sc.nextLine();
        sc.close();

        int result = romanToInt(romanNumeral);
        System.out.println("The integer value of " + romanNumeral + " is " + result);
    }
}
