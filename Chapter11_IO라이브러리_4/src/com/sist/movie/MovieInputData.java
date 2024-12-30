package com.sist.movie;
import java.io.*;
import java.util.*;
// 데이터 크롤링
// 객체단위로 저장한 파일을 만든다
// ObjectOutputStream
public class MovieInputData {
	
	public static void main(String[] args) {
		ObjectOutputStream oos=null;
		try {
			List<Movie> list=new ArrayList<Movie>();
			FileReader fis=new FileReader("c:\\JavaDev\\movie.txt");
			/*
			 * 		FileInputStream => 1byte
			 * 		=> BufferedReader => 데이터를 전체를 메모리에 모아서
			 * 		=> InputStreamReader() => 한글깨짐방지	
			 * 		   ------------------- 1byte => 2byte
			 */
			int i=0;
			StringBuffer sb=new StringBuffer();
			while((i=fis.read())!=-1)
			{
				sb.append((char)i);
			}
			String data=sb.toString();
			String[] mdata=data.split("\n");
			for(String m:mdata)
			{
				String[] mm=m.split("\\|");
				Movie movie=new Movie();
				movie.setMno(Integer.parseInt(mm[0]));
				movie.setTitle(mm[1]);
				movie.setGenre(mm[2]);
				movie.setPoster(mm[3]);
				movie.setActor(mm[4]);
				movie.setRegdate(mm[5]);
				movie.setGrade(mm[6]);
				movie.setDirectory(mm[7]);
				list.add(movie);
			}
			
			// list를 저장
			FileOutputStream fos=new FileOutputStream("c:\\java_data\\movie_info.txt");
			// 파일이 없는 경우에는 자동으로 생성이 된다
			oos=new ObjectOutputStream(fos);
			oos.writeObject(list);
			System.out.println("영화 객체 단위 저장 완료!!");
		} catch (Exception ex) {
			// TODO: handle exception
			ex.printStackTrace();
		}finally
		{
			try
			{
				oos.close();
			}catch(Exception ex) {}
		}
	}
}
