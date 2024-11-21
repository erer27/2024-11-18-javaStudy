import java.util.Scanner;

public class 숙제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 입력:");
		int a = scan.nextInt();
		
//		System.out.println(a<0?a+"는(은) 음수입니다":a+"는(은) 양수입니다");
		System.out.println(a%3==0?a+"는(은) 3의 배수입니다":a+"는(은) 3의 배수가 아닙니다");
		

	}

}
