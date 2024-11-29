import java.util.Arrays;
import java.util.Scanner;
public class 배열_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		//1번 문제
//		int[] arr = new int[5];
//		int[] rank = {1,1,1,1,1};
//		for(int i=0; i<arr.length;i++) {
//			int score = (int)(Math.random()*100)+1;
//			arr[i] = score;
//		}
//		
//		System.out.println(Arrays.toString(arr));
//		
//		for(int i=0; i<arr.length;i++) {
//			for(int j=0; j<arr.length;j++) {
//				if(arr[i]<arr[j]) {
//					rank[i]++;
//				}
//			}
//		}
//		
//		System.out.println(Arrays.toString(rank));
		
		//2번 문제
//		int[] arr=new int[10];
//		int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
//		for(int i=0; i<arr.length;i++) {
//			int num = (int)(Math.random()*100)+1;
//			arr[i] = num;
//		}
//		
//		for(int i=0;i< arr.length; i++) {
//			if(arr[i]>max) {
//				max = arr[i];
//			}
//			if(arr[i]<min) {
//				min = arr[i];
//			}
//		}
//		System.out.println(Arrays.toString(arr));
//		System.out.println(max + " " + min);
		
		//3번 문제
//		int[] arr = new int[10];
//		for(int i=0;i<100;i++) {
//			int num = (int)(Math.random()*10);
//			System.out.print(num + " ");
//			arr[num]++;
//		}
//		System.out.println();
//		System.out.println(Arrays.toString(arr));
		
		//4번 문제
//		int[] arr = new int[10];
//		for(int i=0;i<10;i++) {
//			arr[i] = (int)(Math.random()*100)+1;
//		}
//		
//		System.out.println(Arrays.toString(arr));
//		System.out.println(arr[1]);
		
		
		//5번 문제
//		int maxIndex = 0;
//		for(int i=0;i<arr.length;i++) {
//			if(arr[maxIndex]<arr[i]) {
//				maxIndex = i;
//			}
//		}
//		System.out.println(maxIndex);
		
		
		//6번 문제
//		int[] arr = new int[10];
//		int sum = 0;
//		for(int i=0;i<10;i++) {
//			arr[i] = (int)(Math.random()*100)+1;
//			sum+=arr[i];
//		}
//		float avg = sum/(float)10;
//		
//		System.out.println(Arrays.toString(arr));
//		System.out.println(sum + " " + avg);
		
		//7번 문제
//		int[] arr = new int[10];
//		for(int i=0;i<arr.length;i++) {
//			arr[i] = (int)(Math.random()*100)+1;
//		}
//		
//		for(int i=0;i<arr.length;i++) {
//			if(i==3) 
//				continue;
//			System.out.print(arr[i] + " ");
//
//		}
		
		//8번 문제
//		int[] arr = new int[5];
//		for(int i=0;i<arr.length;i++) {
//			arr[i] = (int)(Math.random()*100)+1;
//		}
//		
//		int num1=scan.nextInt(),num2 = scan.nextInt();
//		System.out.println(Arrays.toString(arr));
//		int temp = arr[num1];
//		arr[num1] = arr[num2];
//		arr[num2] = temp;
//		
//		System.out.println(Arrays.toString(arr));
		
		//9번 문제
//		char[] arr = new char[26];
//		int i=0;
//		for(char c='A';c<='Z';c++) {
//			arr[i]=c;
//			i++;
//		}
//		System.out.println(Arrays.toString(arr));
		
		//10번 문제
//		for(int j=arr.length-1;j>=0;j--) {
//			System.out.print(arr[j] + " ");
//		}
		
		//11번 문제
//		int[] arr = new int[10];
//		for(int i=0;i<arr.length;i++) {
//			arr[i] = (int)(Math.random()*100)+1;
//			if(arr[i]%3==0) {
//				System.out.print(arr[i] + " ");
//			}
//		}
//		System.out.println();
//		System.out.println(Arrays.toString(arr));
		
		//12번 문제
		int[] arr = new int[10];
		for(int i=0;i<arr.length;i++) {
			arr[i] = (int)(Math.random()*100)+1;
		}
		
		int evenMax=0, oddMax=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0 && arr[i]>evenMax) {
				evenMax = arr[i];
			}
			if(arr[i]%2==1 && arr[i]>oddMax) {
				oddMax = arr[i];
			}
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println(evenMax + " " + oddMax);
	}

}
