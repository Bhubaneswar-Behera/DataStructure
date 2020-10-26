package com.utils.strings;


/**
 * Implement atoi which converts a string to an integer.
 * The function first discards as many whitespace characters as necessary until the
 * first non-whitespace character is found. Then, starting from this character takes an optional
 * initial plus or minus sign followed by as many numerical digits as possible,
 * and interprets them as a numerical value.
 * The string can contain additional characters after those that form the integral number,
 * which are ignored and have no effect on the behavior of this function.
 * If the first sequence of non-whitespace characters in str is not a valid integral number,
 * or if no such sequence exists because either str is empty or it contains only whitespace characters,
 * no conversion is performed.
 * If no valid conversion could be performed, a zero value is returned.
 *
 *
 * Example 1:
 * Input: str = "42"
 * Output: 42
 *
 * Example 2:
 * Input: str = "   -42"
 * Output: -42
 * Explanation: The first non-whitespace character is '-', which is the minus sign.
 * Then take as many numerical digits as possible, which gets 42.
 *
 * Example 3:
 * Input: str = "4193 with words"
 * Output: 4193
 * Explanation: Conversion stops at digit '3' as the next character is not a numerical digit.
 *
 * Example 4:
 * Input: str = "words and 987"
 * Output: 0
 * Explanation: The first non-whitespace character is 'w', which is not a numerical digit or a +/- sign.
 * Therefore no valid conversion could be performed.
 *
 * Example 5:
 * Input: str = "-91283472332"
 * Output: -2147483648
 * Explanation: The number "-91283472332" is out of the range of a 32-bit signed integer.
 * Therefore INT_MIN (−231) is returned.
 */
public class StringToIntegerConverter {

    public static void main(String[] args) {
        String inputString = "    -42";
        System.out.println(valueOf(inputString));

    }

    private static int valueOf(String inputString) {
        int result  = 0;
        int sign  = 1;
        int i = 0; // for iterating the input string
        if(inputString == null || inputString.length() == 0){
          return 0;
        }
        //If its negative number then making it negative
        if(inputString.startsWith("-")){
            sign = -1;
            i++;
        }

        //For white space checking
        while (i < inputString.length() && inputString.charAt(i) == ' ')
            i++;

        while(i < inputString.length()){
            //Checking if its a number ot not and returning -1 if its not number
            if(! (inputString.charAt(i) - '0' >=0 && inputString.charAt(i) - '0' <= 9)){
                return -1;
            }
            //Else update the result
            result = result * 10 + inputString.charAt(i) - '0';
            i++;
        }
        return result * sign;

    }
}
