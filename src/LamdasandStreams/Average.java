package LamdasandStreams;

import java.util.*;
import java.util.function.Predicate;

public class Average{
	public static float average(ArrayList<Integer> l,Predicate<Integer> predicate) {
		int sum = 0;
		int len = l.size();
		for(Integer val : l)
		{
			if(predicate.test(val)) {
				sum += val;
			}
		}
		return (float)(sum/(len*1.0));
	}
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		ArrayList<Integer> listOfElements = new ArrayList<Integer>();
		for(int i=0;i<size;i++)
			listOfElements.add(sc.nextInt());
		float avg=average(listOfElements,(Integer val) -> val>=0);
		System.out.println(avg);
		sc.close();
	}
}