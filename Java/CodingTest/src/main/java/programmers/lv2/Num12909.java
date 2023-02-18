package programmers.lv2;

/**
 * <h1>올바른 괄호</h1>
 *
 * <h3>문제 설명</h3>
 * <p>
 * 괄호가 바르게 짝지어졌다는 것은 '(' 문자로 열렸으면 반드시 짝지어서 ')' 문자로 닫혀야 한다는 뜻입니다. 예를 들어
 * "()()" 또는 "(())()" 는 올바른 괄호입니다.
 * ")()(" 또는 "(()(" 는 올바르지 않은 괄호입니다.
 * '(' 또는 ')' 로만 이루어진 문자열 s가 주어졌을 때, 문자열 s가 올바른 괄호이면 true를 return 하고, 올바르지 않은 괄호이면 false를 return 하는 solution 함수를 완성해 주세요.
 * </p><br>
 *
 * <h3>제한사항</h3>
 * <p>
 * 문자열 s의 길이 : 100,000 이하의 자연수
 * 문자열 s는 '(' 또는 ')' 로만 이루어져 있습니다.
 * </p>
 */

public class Num12909 {

    boolean solution(String s) {

        int cnt = 0;

        // 문자열을 배열로 만들기
        char[] chars = s.toCharArray();
        for (char ch : chars) {

            // 문자열을 검사 "("일 경우, cnt += 1
            if (ch == '(') {
                cnt += 1;
            }

            // 문자열을 검사 ")"일 경우, cnt -= 1, cnt 가 -1이 되면 return false
            cnt -= 1;
            if (cnt < 0) {
                return false;
            }
        }
        // cnt가 0이면 return true, 아니면 return false

        return cnt > 0 ? true : false;
    }
}
