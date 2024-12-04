// 사칙연산자 ==> 4개의 메소드
// 회원가입 - 회원탈퇴
import java.util.Scanner;
public class 메소드_2 {
	// 1) 리턴형 / 매개변수 => o
	// +
	static int plus(int a, int b) {
		int c=a+b;
		return c;
	}
	// -
	static int minus(int a, int b) {
		int c=a-b;
		return c;
	}
	static int gop(int a, int b) {
		int c=a*b;
		return c;
	}
	static String div(int a, int b) {
		String result="";
		if(b==0) {
			result="0으로 나눌 수 없습니다";
		}
		else
			result=String.valueOf(a/(double)b);
					// String으로 변환
		return result; // 리턴형에 선언된 데이터형과 일치
	}
	//조립 => 다른 클래스에서 사용이 가능
	static void process() {
		// main
		Scanner scan=new Scanner(System.in);
		System.out.println("첫 번째 정수 입력:");
		int num1=scan.nextInt();
		
		System.out.println("두 번째 정수 입력:");
		int num2=scan.nextInt();
		
		System.out.println("연산자 입력(+,-,*,/):");
		String op=scan.next();
		
		// switch, 다중조건문 
		if(op.equals("+")) {
			System.out.println(num1+"+"+num2+"="+plus(num1,num2));
		}
		else if(op.equals("-")) {
			System.out.println(num1+"-"+num2+"="+minus(num1,num2));
		}
		else if(op.equals("*")) {
			System.out.println(num1+"*"+num2+"="+gop(num1,num2));
		}
		else if(op.equals("/")) {
			System.out.println(num1+"/"+num2+"="+div(num1,num2));
		}
	}
	public static void main(String[] args) {
		process();
	}
}
