package com.sist.music;

import java.util.Scanner;

public class MusicUserMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MusicSystem ms=new MusicSystem();
		/*
		 	Top50
	  		가요
	  		POP
	  		OST
	  		트롯
	  		JAZZ
	  		CLASSIC
		 */
		Scanner scan=new Scanner(System.in);
		while(true)
		{
			System.out.println("===========장르별 메뉴==========");
			System.out.println("1. Top 50");
			System.out.println("2. 가요");
			System.out.println("3. POP");
			System.out.println("4. OST");
			System.out.println("5. 트롯");
			System.out.println("6. JAZZ");
			System.out.println("7. CLASSIC");
			System.out.println("8. 종료");
			System.out.println("==============================");
			System.out.println("메뉴 선택>>");
			int menu=scan.nextInt();
			MusicVO[] music=ms.musicData(menu);
			
			if(menu==8) {
				break;
			}
			
			// 화면 출력
			int i=1;
			for(MusicVO vo:music) {
				System.out.println(i+"."+vo.getTitle());
				i++;
			}
			
		}
	}

}
