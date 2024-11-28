import java.util.Scanner;
public class 문자열_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		String str = scan.nextLine();
		String change = "";
		for(int i=0; i<str.length(); i++) {
			int c = str.charAt(i);
			if(c<97) {
				change +=(char)Character.toLowerCase(c);
			}else
			{
				change += (char)Character.toUpperCase(c);
			}
		}
		System.out.println(change);
		
//		for(int i=str.length()-1; i>=0; i--) {
//			System.out.print(str.charAt(i));
//		}
	}

}
