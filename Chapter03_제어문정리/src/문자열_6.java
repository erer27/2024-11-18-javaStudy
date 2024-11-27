/*
 * 		문자 자르기
 * 		***** X 10000000
 * 	
 * 		substring : 문자열을 자르기
 * 		| 지정된 위치부터 마지막까지 자르기
 * 		  Hello Java
 * 		  0123456789
 * 		  substring(6) Java
 * 		| 중간에서 자르기
 * 		  substring(1,4) ==> ell
 * 					  -- endIndex-1
 * 		  공백 제거 : trim
 * 		------------------------------ JavaScript 동일
 * 		
 */
public class 문자열_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String data="Hello.Hello.java";
//					 
//		System.out.println(data.substring(data.lastIndexOf(".")+1));
//		//String data="ID:admin,PWD:1234";
//		String id=data.substring(data.indexOf(":")+1,data.indexOf(","));//,는 제외
//		System.out.println(id);
//		System.out.println(id);
//		String pwd=data.substring(data.lastIndexOf(":")+1);
//		//원본은 그대로 유지
//		System.out.println(pwd);
//		System.out.println(data);
		
		String address="서울 구로구 구로동 1124-1 3층[새주소]        서울 구로구 디지털로32길 97-39 3층";
		String ad1 = address.substring(0,address.indexOf("[새주소]"));
		String ad2 = address.substring(address.indexOf("]")+1);
		System.out.println(ad1);
		System.out.println(ad2.trim());
		
		String s="Hello Java";
		String ss = s.substring(s.indexOf(" "));
		System.out.println(ss);
		// trim() => 좌우의 공백을 제거
		
	}

}
