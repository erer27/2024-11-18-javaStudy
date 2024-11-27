import java.util.Scanner;
public class while문제 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//1번 문제
//		System.out.print("정수 입력:");
//		int num = scan.nextInt();
//		
//		int i=1;
//		while(i<=9) {
//			System.out.printf("%d * %d = %d\n", num,i,num*i);
//			i++;
//		}
		
		
		//2번 문제
//		int i=1;
//		while(i<=100) {
//			if(i%8==0) {
//				System.out.print(i+" ");
//			}
//			i++;
//			
//		}
		
		//3번 문제
//		int i=1;
//		while(i<=100) {
//			if(i%4==0 || i%7==0) {
//				System.out.print(i+" ");
//			}
//			i++;
//			
//		}
		
		//4번 문제
//		int i=1;
//		while(i<=100) {
//			if(i%10==3||i%10==6||i%10==9) {
//				System.out.print(i+" ");
//			}
//			i++;
//			
//		}
		
		//5번 문제
//		String str = scan.next();
//		int i=0;
//		int cnt=0;
//		while(i<str.length()) {
//			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'
//					||str.charAt(i)=='o'||str.charAt(i)=='u') {
//				cnt++;
//			}
//			i++;
//		}
//		
//		System.out.println("모음 개수:" + cnt);
		
		
		//6번 문제
//		int num = scan.nextInt();
//		int i=1;
//		while(i<100) {
//			if(i%10 + (i-i%10)/10==num) {
//				System.out.print(i + " ");
//			}
//			i++;
//		}
		
		//7번 문제
//		int i=10;
//		while(i<=20) {
//			System.out.print(i+" ");
//			i++;
//		}
		
		
		//8번 문제
//		int i=20;
//		while(i>=10) {
//			System.out.print(i+" ");
//			i--;
//		}
		
		//9번 문제
//		int i=1;
//		int max = scan.nextInt();
//		while(i<=4) {
//			int num = scan.nextInt();
//			if(num>max) {
//				max = num;
//			}
//			i++;
//		}
//		
//		System.out.print("최댓값:"+max);
		
		//10번 문제
		int i=0;
		String max = scan.nextLine();
		int lengthSum = max.length();
		while(i<2) {
			String str = scan.nextLine();
			lengthSum+=str.length();
			if(str.length()>max.length()) {
				max = str;
			}
			i++;
		}
		System.out.println("길이합:"+lengthSum);
		System.out.println("가장 긴 문자열:"+max);
	}

}
