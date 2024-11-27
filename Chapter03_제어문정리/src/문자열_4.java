/*
 * 		문자열 분리 / 자르기 / 변경 / 찾기
 * 		=charAt(int index)
 * 		Hello Java
 * 		0123456789
 * 		charAt(6) 
 */
// 사용자의 문자열 입력값을 받아서 => a A가 몇개인지 확인
import java.util.Scanner;
// 사용자의 문자열 입력을 받아서 좌우 대칭 여부 확인
// ABBA
public class 문자열_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String data="Hello Java";
//		System.out.println("첫번째 문자:"+data.charAt(0));
//		
//		System.out.println("마지막 문자:"+data.charAt(data.length()-1));
		
//		Scanner scan=new Scanner(System.in);
//		System.out.println("문자열 입력:");
//		String data=scan.nextLine();
//		int count=0;
//		for(int i=0;i<data.length();i++) {
//			char ch=data.charAt(i);
//			System.out.println(ch);
//			if(ch=='a' || ch=='A')
//				count++;
//		}
//		// 지역변수 => {}변수 => {}이 종료하면 사라지는 변수
//		System.out.println("a나 A의 갯수:"+count);
		String data="";
		Scanner scan=new Scanner(System.in);
		while(true)
		{
			System.out.println("문자열 입력:");
			data=scan.nextLine();
			if(data.length()%2==0) {
				break;
			}
			else {
				System.out.println("문자 개수가 짝수여야 합니다");
			}
		}
		
		

		// ==> 짝수
		boolean bCheck=true;
		for(int i=0; i<data.length(); i++)
		{	
			
			if(i>=data.length()-1-i) {
				break;
			}
			if(data.charAt(i)!=data.charAt(data.length()-1-i)) {
				bCheck=false;
				break;
			}
		}
		
		System.out.println("============ 결과값 ==============");
		System.out.println(bCheck?"대칭입니다":"대칭이 아닙니다");
		
	}

}
