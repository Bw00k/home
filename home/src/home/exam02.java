package home;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class exam02 {
	public static void main(String[] args) {
		System.out.println("�̸� �Է� >");
		Scanner in = new Scanner(System.in);
		String userId = in.nextLine();
		System.out.println("��й�ȣ �Է� >");	
		String userPw = in.nextLine();
		
		if(verifyPw(userId, userPw)) {
			System.out.println("��� : ��밡��");
		}else {
			System.out.println("��� : ��� �Ұ���");
		}
	}

	private static boolean verifyPw(String userId , String userPw) {
		String idPolicy = "((?=^[��-�R]*$).{3,})";
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
