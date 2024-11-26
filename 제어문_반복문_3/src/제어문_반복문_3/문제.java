package 제어문_반복문_3;

/*
 * 	★☆☆☆★
 *  ☆★☆★☆
 *  ☆☆★☆☆
 *  ☆★☆★☆
 *  ★☆☆☆★
 *  
 *  ★☆☆☆★
 *  ☆☆☆☆☆
 *  ☆☆☆☆☆
 *  ☆☆☆☆☆
 *  ★☆☆☆★
 *  
 */

import java.util.Scanner;
public class 문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		for(int i=1;i<=5;i++) {
//			for(int j=1;j<=5;j++) {
//				if(j==i) {
//					System.out.print("★");
//				}
//				else if(j==6-i) {
//					System.out.print("★");
//				}
//				else
//				{
//					System.out.print("☆");
//				}
//			}
//			System.out.println();
//		}
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(i==1 || i==5) {
					if(j==i || j==6-i) {
						System.out.print("★");
					}
					else
					{
						System.out.print("☆");
					}
				}
				else
				{
					System.out.print("☆");
				}
			}
			System.out.println();
		}
		
		
		

	}

}
