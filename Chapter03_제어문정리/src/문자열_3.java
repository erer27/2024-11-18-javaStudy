/*
 * 		문자열 정보
 * 		=> length() : 문자의 갯수
 * 		=> 비밀번호는 8자리 이상 ...
 */
import java.util.Scanner;
// 사용자가 입력한 문자의 갯수확인 => 공백포함
// " Hello Java "=> " admin" admin
public class 문자열_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("문자열 입력:");
		String str1=scan.next();//ENTER
		String str2=scan.next();
		String str3=scan.next();
		// next() => 공백/enter
		System.out.println("===== 결과값 =====");
		System.out.println("문자 갯수:"+str1.length());
		System.out.println("문자 갯수:"+str2.length());
		System.out.println("문자 갯수:"+str3.length());
	}

}
