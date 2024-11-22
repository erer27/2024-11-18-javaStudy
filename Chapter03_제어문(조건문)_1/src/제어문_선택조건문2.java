// 정수를 입력받아서 짝수/홀수
// random() => 1~100
// random() => 두개 발생(1~100)
// => 최대값 / 최소값을 출력하는 프로그램을 만든다
public class 제어문_선택조건문2 {
	public static void main(String[] args) {
		// 임의의 정수를 받는다
//		int num=(int)(Math.random()*100)+1;
		
//		if(num%2==0) // 짝수라면
//			System.out.println(num+"는(은) 짝수입니다!!");
//		else
//			System.out.println(num+"는(은) 홀수입니다!!");
		
		int num1=(int)(Math.random()*100)+1;
		int num2=(int)(Math.random()*100)+1;
		
		int min=0; int max=0;
		if(num1>num2) {
			max = num1;
			min = num2;
		}
		else {
			max = num2;
			min = num1;
			
		}
		
		System.out.println("최댓값: " + max + " 최솟값: " + min);
	}
}
