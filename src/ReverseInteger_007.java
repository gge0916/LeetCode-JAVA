/**
 * https://leetcode.com/problems/reverse-integer/description/
 * Given a 32-bit signed integer, reverse digits of an integer.
 * e.g. 123 -> 321, -123 -> -321
 */
public class ReverseInteger_007 {
    // unsigned int max: 2^32 - 1
    // signed int max: 2^31 - 1
    // 2,147,483,647 -> 746,387,741,2 overflow
    public int reverse(int x) {
        int result = 0;
        while (x != 0) {
            int tail = x % 10;
            int newResult = result * 10 + tail;
            if ((newResult - tail) / 10 != result) {
                return 0;
            }
            result = newResult;
            x /= 10;
        }
        return result;
    }
}
