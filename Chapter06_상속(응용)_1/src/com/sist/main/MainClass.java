package com.sist.main;
class Super
{
	//변수 오버라이딩
	int a=10;
	int b=20;
	public Super()
	{
		System.out.println("Super() Call...");
	}
}
class Sub extends Super
{
	public Sub()
	{
		System.out.println("Sub() Call");
	}
	public void display()
	{
		super.a=100;
		super.b=200;
		this.a=1000;
		this.b=2000;
		System.out.println("Super:a="+super.a);
		System.out.println("Super:b="+super.b);
		System.out.println("Sub:a="+this.a);
		System.out.println("Sub:a="+this.a);
	}
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sub s = new Sub();
		s.display();
	}

}
