package Recursion_way_up;

import java.util.Scanner;

public class printEncoding {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		String str=s.nextLine();
		printEncoding(str,"");

	}
	
	public static void printEncoding(String str, String asf) {
		
		if(str.length()==0) {
			System.out.println(asf);
			return;
		}
		else if( str.length()==1) {
			char ch=str.charAt(0);
			if(ch=='0') {
				return;
			}else {
				int num= ch-48;             //ASCII OF 0 is 48
				char code=(char)('a'+ num -1); 
				System.out.println(asf+code);
			}
		}
		else {
			char ch=str.charAt(0);
			String roq=str.substring(1);
			if(ch=='0') {
				return;
			}else {
				int num= ch-48;             //ASCII OF 0 is 48
				char code=(char)('a'+ num -1); 
				printEncoding(roq,asf+code);
			}
			
			String ch12= str.substring(0, 2);
			String roq12= str.substring(2);
			int ch12v=Integer.parseInt(ch12);         //converted string to integer to find what value would it represent
			
			if(ch12v<=26) {
				char code= (char)('a'+ ch12v -1);
				printEncoding(roq12,asf+code);
			}
			
		}
		
		
		
		
		
	}
		
		
		

}
