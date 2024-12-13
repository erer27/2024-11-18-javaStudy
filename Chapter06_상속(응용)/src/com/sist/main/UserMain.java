package com.sist.main;
import java.util.*;
import com.sist.seoul.*;
import com.sist.vo.*;
public class UserMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Seoul seoul=null;
		Scanner scan=new Scanner(System.in);
		System.out.println("명소(1),자연(2):");
		int type=scan.nextInt();
		if(type==1) {
			seoul=new SeoulLocation();
		}
		else
		{
			seoul=new SeoulNature();
		}
		
		while(true)
		{
			System.out.println("===========Menu=============");
			System.out.println("1. 전체 목록");
			System.out.println("2. 상세 보기");
			System.out.println("3. 검색(명칭,주소)");
			System.out.println("4. 종료");
			System.out.println("====================");
			System.out.print("메뉴 선택:");
			int menu=scan.nextInt();
			if(menu==4) {
				System.out.println("프로그램 종료");
				break;
			}
			else if(menu==1) {
				SeoulVO[] datas=seoul.seoulAllData(type);
				for(SeoulVO vo:datas) {
					System.out.println(vo.getNo()+"."+vo.getName());
				}
			}
		}
	}

}
