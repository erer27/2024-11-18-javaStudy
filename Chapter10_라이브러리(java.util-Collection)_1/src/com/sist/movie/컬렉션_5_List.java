package com.sist.movie;
import java.util.*;
public class 컬렉션_5_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		List<String> names=new ArrayList<String>();
//		
//		names=new LinkedList<String>();
//		
//		names=new Vector<String>();
		
		// 인터페이스 => MyBatis / JPA => 리턴형 => List
		// 데이터를 모아서 순차적으로 접근 => 크롤링
		List<String> list=new ArrayList<String>();
		list.add("Java");
		list.add("Oracle");
		list.add("HTML/CSS");
		list.add("JavaScript");
		list.add("JSP"); // Jquery / Ajax
		list.add("Spring"); // VueJS
		list.add("Python"); // Numpy / Pandas / MatplotLib
		list.add("ElasticSearch");
		list.add("AWS"); // Linux
		
		for(String subject:list)
		{
			System.out.println(subject);
		}
		
		System.out.println("===================");
		
		// 데이터를 모아서 순차적으로 출력
//		Iterator<String> iter=list.iterator(); "Set/Map
		ListIterator<String> iter=list.listIterator();
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
		while(iter.hasPrevious()) {
			
		}System.out.println(iter.previous());
		// next()로 종료가 되면 => 2번을 읽지 못한다
//		while(iter.hasNext())
//		{
//			System.out.println(iter.next());
//			// next() 데이터를 읽어 온다
//		}
		
		
	}

}
