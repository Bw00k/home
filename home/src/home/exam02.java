package home;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class exam02 {
	public static void main(String[] args) {
		System.out.println("이름 입력 >");
		Scanner in = new Scanner(System.in);
		String userId = in.nextLine();
		System.out.println("비밀번호 입력 >");	
		String userPw = in.nextLine();
		
		if(verifyPw(userId, userPw)) {
			System.out.println("결과 : 사용가능");
		}else {
			System.out.println("결과 : 사용 불가능");
		}
	}

	private static boolean verifyPw(String userId , String userPw) {
		String idPolicy = "((?=^[가-힣]*$).{3,})";
		String pwPolicy =  "((?=.*[0-9]).{8,})";
		Pattern idPattern = Pattern.compile(idPolicy);
		Matcher idMatcher = idPattern.matcher(userId);
		Pattern pwPattern = Pattern.compile(pwPolicy);
		Matcher pwMatcher = pwPattern.matcher(userPw);

		if(idMatcher.matches() && pwMatcher.matches()) {
            return true;
        }else {
            return false;


		
	}
	}
}
