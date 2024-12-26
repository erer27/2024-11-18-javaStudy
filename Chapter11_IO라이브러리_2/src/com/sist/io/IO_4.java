package com.sist.io;
import java.util.*;
import java.io.*;
public class IO_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		final int EOF=-1;
		// 한글로 된 파일 제어 => 2byte => Reader / Writer
		try
		{
			
			
			// ObjectInputStream / ObjectOutputStream
			// => List가 통째로 저장이 가능
			while(true)
			{
				
				System.out.println("====== Menu =======");
				System.out.println("1. 사원 목록");
				System.out.println("2. 사원 등록");
				System.out.println("3. 종료");
				System.out.println("===================");
				System.out.print("메뉴 선택:");
				int menu=scan.nextInt();
				if(menu==3)
				{
					System.out.println("프로그램 종료!!");
					break;
				}
				else if(menu==1)
				{
					
					
					FileReader fr=new FileReader("c:\\java_data\\sawon2.txt");
					int i=0;
					String data="";
					while((i=fr.read())!=EOF)
					{
						data+=(char)i;
					}
					String[] sawons=data.split("\n");
					
					for(String sa:sawons)
					{
						if(sawons==null || sa.equals(""))
						{
							System.out.println("등록된 사원이 없습니다");
							break;
						}
						String[] sawon=sa.split("\\|");
						System.out.println("사번:"+sawon[0]);
						System.out.println("이름:"+sawon[1]);
						System.out.println("부서:"+sawon[2]);
						System.out.println("직위:"+sawon[3]);
						System.out.println("근무지:"+sawon[4]);
						System.out.println("연봉:"+sawon[5]);
						System.out.println("=============");
					}
					fr.close();
				}
				else if(menu==2)
				{
					FileWriter fw=new FileWriter("c:\\java_data\\sawon2.txt");
					Sawon sa=new Sawon();
					System.out.println("이름 입력:");
					sa.setName(scan.next());
					

					System.out.println("부서 입력:");
					sa.setDept(scan.next());
					

					System.out.println("직위 입력:");
					sa.setJob(scan.next());
					

					System.out.println("근무지 입력:");
					sa.setLoc(scan.next());

					System.out.println("연봉 입력:");
					sa.setPay(scan.nextInt());
					
					String msg=maxSabun()+"|"
							+sa.getName()+"|"
							+sa.getJob()+"|"
							+sa.getDept()+"|"
							+sa.getLoc()+"|"
							+sa.getPay()+"\r\n";
					
					fw.write(msg);
					fw.close();
				}
				
				
			}
		}catch(Exception ex)
		{
			ex.printStackTrace();// 오류 확인
		}
		finally
		{
			try
			{
				
			}catch(Exception ex) {}
		}
	}
	public static int maxSabun()
	{
		int max=0;
		FileReader fr=null;
		try
		{
			fr=new FileReader("c:\\java_data\\sawon2.txt");
			int i=0;
			String data="";
			while((i=fr.read())!=-1)
			{
				data+=(char)i;
			}
			String[] datas=data.split("\n");
			for(String sa:datas)
			{
				if(sa==null || sa.equals(""))
				{
					break;
				}
				String[] sawon=sa.split("\\|");
				if(max<Integer.parseInt(sawon[0]))
				{
					max=Integer.parseInt(sawon[0]);
				}
			}
		}catch(Exception ex)
		{
			
		}
		finally
		{
			try
			{
				fr.close();
			}catch(Exception ex) {}
		}
		return max+1;
	}

}
