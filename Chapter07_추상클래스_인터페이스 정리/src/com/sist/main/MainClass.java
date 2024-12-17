package com.sist.main;

import com.sist.inter.HelloImpl;
import com.sist.inter.Hello;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hello h=new HelloImpl();
		h.sayHello("홍길동");
	}

}
