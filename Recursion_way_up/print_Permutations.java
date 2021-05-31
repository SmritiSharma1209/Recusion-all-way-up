package Recursion_way_up;
import java.util.Scanner;

public class print_Permutations {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		String str=s.nextLine();
		printPermutations(str,"");
		
		

	}
public static void printPermutations(String ques, String asf) {
	
	if(ques.length()==0) {
		System.out.println(asf);
		return;
	}
	
	
	
	for(int i=0; i<ques.length();++i) {
		char ch=ques.charAt(i);
		
		String queslpart=ques.substring(0, i);
		String quesrpart=ques.substring(i+1);
		String roq=queslpart+quesrpart;
		
		printPermutations(roq, asf+ch);
	}
        
    }

}
