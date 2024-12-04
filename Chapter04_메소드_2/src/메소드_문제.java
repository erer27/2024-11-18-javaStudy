import java.util.Calendar;

public class 메소드_문제 {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_14번문제(123);
	}
	
	public static void _1번문제() {
		for(int i=1; i<=10; i++) {
			System.out.print(i + " ");
		}
	}
	
	public static int _2번문제() {
		int sum = 0;
		for(int i=1; i<=10; i++) {
			sum+=i;
		}
		return sum;
	}
	
	public static int _3번문제(int n) {
		int sum = 0;
		for(int i=1; i<=n; i++) {
			sum+=i;
		}
		return sum;
	}
	
	public static String _4번문제(int n1, int n2) {
		return n2==0?"0으로 나눌 수 없습니다":String.valueOf(n1/(float)n2);
	}
	
	
	public static String _5번문제(String str) {
		return str.toUpperCase();
	}
	
	
	public static boolean _6번문제(String str) {
		for(int i=0;i<str.length();i++) {
			if( str.charAt(i)!=str.charAt(str.length()-i-1) )
				return false;
		}
		return true;
	}
	
	
	public static void _7번문제(String str) {
		for(int i=str.length()-1;i>=0;i--) {
			System.out.print(str.charAt(i));
		}
	}
	
	public static char _8번문제(int score) {
		switch(score/10) {
		case 10: case 9:
			return 'A';
		case 8:
			return 'B';
		case 7:
			return 'C';
		case 6:
			return 'D';
		default:
			return 'F';
		}
	}
	
	
	public static boolean _9번문제(int year) {
		return (year%4==0 && year%100!=0) || (year%400==0);
	}
	
	public static void _10번문제(int n1,int n2) {
		System.out.println(n1>n2?n1:n2);
	}
	
	public static String _11번문제(int n1) {
		return n1%2==0?"짝수":"홀수";
	}
	
	public static String _12번문제(int n1) {
		return n1%3==0?"3의배수":"3의배수아님";
	}
	
	public static char _13번문제(int year,int month, int day) {
		Calendar cal = Calendar.getInstance();
		cal.set(year, month, day);
		System.out.println(cal.getTime());
		char[] c = {' ','일','월','화','수','목','금','토'};
		return c[cal.get(Calendar.DAY_OF_WEEK)];
	}
	
	public static void _14번문제(int n1) {
		String str = n1+"";
		for(int i=str.length()-1;i>=0;i--) {
			System.out.print(str.charAt(i)+" ");
		}
	}

}
