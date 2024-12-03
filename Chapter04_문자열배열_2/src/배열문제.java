import java.util.Arrays;

public class 배열문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1번 문제
//		int[] score = {100,90,85};
//		
//		int sum=0;
//		for(int i=0;i<score.length;i++) {
//			System.out.printf("%d번 학생 : %d점\n", i,score[i]);
//			sum+=score[i];
//		}
//		System.out.println("\n총점:" + sum);
		
		//2번 문제
//		int[] scores= {50,45,35,12,70};
//		
//		int sum=0,max=scores[0],min=scores[0];
//		
//		int maxIndex=0,minIndex=0;
//		for(int i=0; i<scores.length; i++) {
//			System.out.printf("사원(%d) %d\n", i+1,scores[i]);
//			sum+=scores[i];
//			
//			if(max<scores[i])
//			{
//				maxIndex=i;
//				max = scores[i];
//			}
//			if(min>scores[i])
//			{
//				minIndex=i;
//				min = scores[i];
//			}
//			
//			
//		}
//		
//		System.out.printf("총점 %d, 평균 %.2f\n", sum, sum/(double)scores.length);
//		System.out.printf("실적이 제일 큰 사원:%d 실적:%d\n", maxIndex+1,max);
//		System.out.printf("실적이 제일 작은 사원:%d 실적:%d\n", minIndex+1,min);
		
		//3번 문제
//		int[] arr = new int[10];
//		
//		for(int i=0;i<arr.length;i++) {
//			arr[i]=i;
//		}
//		
//		System.out.println(Arrays.toString(arr));
		
		//5번 문제
//		int[] arr = new int[10];
//		
//		int evenTotal=0; int oddTotal=0;
//		for(int i=0;i<arr.length;i++) {
//			arr[i] = (int)(Math.random()*100)+1;
//			if(arr[i]%2==0) {
//				evenTotal+=arr[i];
//			}
//			else {
//				oddTotal+=arr[i];
//			}
//		}
//		
//		System.out.println(Arrays.toString(arr));
//		System.out.println(evenTotal + " " + oddTotal);
		
		
		//6번 문제
//		int[] cnt = new int[10];
//		for(int i=0;i<cnt.length;i++) {
//			int num = (int)(Math.random()*9);
//			System.out.print( num+" ");
//			cnt[num]++;
//		}
//		System.out.println();
//		for(int i=0; i<cnt.length;i++) {
//			System.out.printf("%d의 개수:%d\n",i,cnt[i]);
//		}
		
		
		
		
		//7번 문제
		char[] c = new char[5];
		for(int i=0; i<c.length;i++) {
			c[i] = (char)((Math.random()*26)+65);
		}
		
		for(int i=0; i<c.length; i++) {
			for(int j=0; j<c.length-1; j++) {
				if(c[j]<c[j+1]) {
					char temp = c[j];
					c[j] = c[j+1];
					c[j+1] = temp;
				}
			}
		}
		
		for(int i=c.length-1; i>=0 ;i--) {
			System.out.print(c[i] + " ");
		}
		System.out.println();
		for(char cc:c) {
			System.out.print(cc + " ");
		}
		
		
	}

}
