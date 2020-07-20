package LamdasandStreams;

import java.util.*;
import java.util.stream.*;

public class Streams {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		ArrayList<String> listOfStrings = new ArrayList<>();
		for(int i=0;i<size;i++) 
			listOfStrings.add(sc.next());
		List<String> result = listOfStrings.stream().filter(str -> str.charAt(0)=='a' && str.length()==3).collect(Collectors.toList());
		System.out.println(result);
		sc.close();
	}

}