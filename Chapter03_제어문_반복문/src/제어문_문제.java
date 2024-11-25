import java.util.Scanner;
public class 제어문_문제 {

	public static void main(String[] args) {
		
		//1번 문제
//		Scanner scan = new Scanner(System.in);
//		System.out.println("정수 입력:");
//		int score = scan.nextInt();
//		int a = score/10;
//		switch(a) {
//			case 10: case 9:
//				System.out.println("A학점입니다");
//				break;
//			case 8:
//				System.out.println("B학점입니다");
//				break;
//			case 7:
//				System.out.println("C학점입니다");	
//				break;
//			case 6:
//				System.out.println("D학점입니다");
//				break;
//			default:
//				System.out.println("F학점입니다");
//		}
		
		
		//2번 문제
//		Scanner scan = new Scanner(System.in);
//		System.out.println("정수 입력:");
//		int num1 = scan.nextInt();
//		
//		System.out.println("+,-,*,/ 입력:");
//		char op = scan.next().charAt(0);
//		
//		System.out.println("정수 입력:");
//		int num2 = scan.nextInt();
//		
//		switch(op) {
//			case '+':
//				System.out.println(num1 + " " + op + " " + num2 + " = " +( num1 + num2));
//				break;
//			case '-':
//				System.out.println(num1 + " " + op + " " + num2 + " = " +( num1 - num2));
//				break;
//			case '*':
//				System.out.println(num1 + " " + op + " " + num2 + " = " + num1 * num2);
//				break;
//			case '/':
//				if(num2==0) {
//					System.out.println("0으로 나눌 수 없습니다");
//					break;
//				}
//				System.out.println(num1 + " " + op + " " + num2 + " = " + num1 / num2);
//				break;
//			default:
//				System.out.println("잘못된 연산자입니다");
//		}
		
		
		//3번 문제
//		System.out.print("2+4+...100의 합:");
//		int sum=0;
//		for(int i=2;i<=100; i+=2) {
//			sum+=i;
//		}
//		System.out.println(sum);
		
		
		//4번 문제
//		for(int i=5; i<=50; i+=5) {
//			System.out.print(i + "\t");
//		}
		
		//5번 문제
//		for(char c='B'; c<='N'; c+=2)
//			System.out.print(c+"\t");
		
		//6번 문제
//		Scanner scan = new Scanner(System.in);
//		System.out.print("정수 입력:");
//		int num = scan.nextInt();
//		int sum = 0;
//		for(int i=1; i<=num; i++) {
//			sum+=i;
//		}
//		System.out.println("1~" + num + "까지의 합:" + sum);
		
		//7번 문제
//		int j=0;
//		for(int i=2;i<=30; i+=2) {
//			j++;
//			System.out.print(i+" ");
//			if(j==3) {
//				System.out.println();
//				j=0;
//			}
//		}
		
		//8번 문제
//		int sum=0;
//		boolean op = true;
//		for(int i=1; i<=10; i++) {
//			if(op) {
//				sum+=i;
//			    op = !op;
//			}else {
//				sum-=i;
//				op = !op;
//			}
//		}
//		System.out.println("1-2+3..-10까지의 합:" + sum);
		
		//9번 문제
		for(int i=1; i<=10; i++) {
			if(i%3==0) continue;
			System.out.print(i+" ");
		}
		

	}

}
