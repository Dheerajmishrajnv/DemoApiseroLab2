package collections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionDemo {

	public static void main(String[] args) throws Exception {
		List<Integer> li = new ArrayList<Integer>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the no. of input");
		String a = br.readLine();
		int n = Integer.parseInt(a);
		for(int i=0; i<n;i++) {
			String x = br.readLine();
			int a1 = Integer.parseInt(x);
			li.add(a1); 
		}
		for(int a2:li) {
			System.out.println(a2);
		}
		System.out.println("Enter the input for set");
		Set<Integer> si = new HashSet<Integer>();
		String a1 = br.readLine();
		int n1 = Integer.parseInt(a1);
		for(int i=0; i<n1;i++) {
			String x = br.readLine();
			int a2 = Integer.parseInt(x);
			si.add(a2); 
		}
		for(int a2:si) {
			System.out.println(a2);
		}
		System.out.println("Enter the input for map");
		Map<Integer,String> mi = new HashMap<Integer,String>();
		String a2 = br.readLine();
		int n2 = Integer.parseInt(a1);
		for(int i=0; i<n2;i++) {
			String x = br.readLine();
			String y = br.readLine();
			int a3 = Integer.parseInt(x);
			mi.put(a3,y); 
		}
		for(int a3:si) {
			System.out.println(a2);
		}

	}

}
