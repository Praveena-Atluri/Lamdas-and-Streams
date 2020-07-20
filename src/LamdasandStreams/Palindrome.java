package LamdasandStreams;

import java.util.*;
import java.util.function.Function;

public class Palindrome {

	public static ArrayList<String> palindromeCheck(ArrayList<String> l){
        ArrayList<String> palindrome=new ArrayList<>();
        for(String str:l){
            int start = 0,end = str.length()-1;
            boolean flag = true;
            while(start < end){
                if(str.charAt(start) != str.charAt(end)){
                    flag = false;
                    break;
                }
                start++;
                end--;
            }
            if(flag == true) 
            	palindrome.add(str);
        }
        return palindrome;
    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		ArrayList<String> listOfStrings = new ArrayList<>();
		for(int i=0;i<size;i++) 
			listOfStrings.add(sc.next());
		Function<ArrayList<String> , ArrayList<String>> palindromes = Palindrome::palindromeCheck;
		ArrayList<String> listOfPalindromeStrings=palindromes.apply(listOfStrings);
		System.out.println(listOfPalindromeStrings);
		sc.close();
	}
	
}