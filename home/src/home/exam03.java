package home;

import java.util.Arrays;

public class exam03 {
	public static void main(String[] args) {
		String[] arr = {"010102-4", "991012-1", "960304-1", "881012-2", "040403-3"};

        int length = arr.length;
        System.out.println("# 변환 성공");
        for(int i = 0; i<arr.length; i++){
            String str = arr[i].substring(arr[i].length()-1, arr[i].length());
            StringBuilder sb = new StringBuilder(arr[i]);
            switch (str) {
                case "1": sb.replace(7, arr[i].length(), "2");
                    break;
                case "2": sb.replace(7, arr[i].length(), "1");
                    break;
                case "3": sb.replace(7, arr[i].length(), "4");
                    break;
                case "4": sb.replace(7, arr[i].length(), "3");
                    break;
                default : 
                	break;
            }
            System.out.println(arr[i] + " -> " + sb);
        }
	}
}
