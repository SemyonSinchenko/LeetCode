package StringToInteger;

/*
Implement atoi which converts a string to an integer.

The function first discards as many whitespace characters as necessary until the first non-whitespace character is found.
Then, starting from this character, takes an optional initial plus or minus sign followed by as many numerical digits as
possible, and interprets them as a numerical value.

The string can contain additional characters after those that form the integral number, which are ignored and have no
effect on the behavior of this function.

If the first sequence of non-whitespace characters in str is not a valid integral number, or if no such sequence exists
because either str is empty or it contains only whitespace characters, no conversion is performed.

If no valid conversion could be performed, a zero value is returned.

Note:

Only the space character ' ' is considered as whitespace character.
Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range:
 [−231,  231 − 1]. If the numerical value is out of the range of representable values,
 INT_MAX (231 − 1) or INT_MIN (−231) is returned.
 */

class Solution {
    public int myAtoi(String str) {
        if(str == null) return 0;
        StringBuilder res = new StringBuilder();
        int numDigits = 0;
        int sign = 1;

        for(char c : str.toCharArray()) {
            if((c == ' ') && res.toString().equals("")) continue;
            else if(res.toString().equals("")) {
                if(Character.isDigit(c)) {
                    res.append(c);
                    numDigits++;
                } else if(c == '-') {
                    res.append(c);
                    sign = -1;
                } else if(c == '+') {
                    res.append(c);
                } else return 0;
            }
            else {
                if(Character.isDigit(c)) {
                    if(
                            (c == '0') && (numDigits == 1) && ((res.charAt(0) == '0')
                                    || (((res.charAt(0) == '+') || (res.charAt(0) == '-')) && (res.charAt(1) == '0'))
                            )
                    ) continue;
                    res.append(c);
                    numDigits++;
                }
                else {
                    if(numDigits == 0) return 0;
                    if(numDigits <= 10) {
                        try {
                            return Integer.parseInt(res.toString());
                        } catch (Exception e) {
                            return (sign > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE);
                        }
                    } else {
                        return (sign > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE);
                    }
                }
            }
        }

        if(numDigits == 0) return 0;
        if(numDigits <= 10) {
            try {
                return Integer.parseInt(res.toString());
            } catch (Exception e) {
                return (sign > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE);
            }
        } else {
            return (sign > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE);
        }
    }
}
