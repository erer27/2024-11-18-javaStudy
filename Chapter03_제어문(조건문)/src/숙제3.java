import java.util.Scanner;

public class 숙제3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("달을입력하세요(1~12)>>");
		int a = scan.nextInt();
		if(a>=3&&a<=5)
			System.out.println("봄");
		if(a>=6&&a<=8)
			System.out.println("여름");
		if(a>=9&&a<=11)
			System.out.println("가을");
		if(a==12||a==1||a==2)
			System.out.println("겨울");
		if(a<1||a>12)
			System.out.println("잘못입력");
	}

}
