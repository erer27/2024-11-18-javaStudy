package com.sist.exam;
import java.util.*;
import java.net.*;
public class Server implements Runnable {
	private Vector<Client> waitVc=new Vector<Client>();
	// => 예전 프로그램 => 유지보수 (Vector)
	private ServerSocket ss;
	public Server()
	{
		try
		{
			ss=new ServerSocket(3355);
			System.out.println("Server Start");
			// bind (ip,port) => listen() => 대기
		}catch (Exception ex) {}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Server s = new Server();
		try {
			s.run();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true)
		{
			try
			{
				Socket s=ss.accept();//접속시
				Client client=new Client(s);
				waitVc.add(client);
			}catch(Exception ex) {}
		}
	}
	//내부 클래스
	class Client extends Thread
	{
		private Socket s;
		public Client(Socket s)
		{
			this.s=s;
			System.out.println(s.getInetAddress());
			System.out.println(s.getPort());
		}
	}


}
