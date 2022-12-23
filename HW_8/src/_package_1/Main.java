package _package_1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Collection<Integer> indexArray = new ArrayList<Integer>();
		indexArray.add(0);
		indexArray.add(1);
		indexArray.add(2);
		indexArray.add(3);
		indexArray.add(4);
		
		List<String> nameList = new ArrayList<String>();
		nameList.add("Ms Junior");
		nameList.add("Ms Walter White");
		nameList.add("Ms Walter White Jr.");
		nameList.add("Jesse Pinkman");
		nameList.add("Jesse Pinkman");
		
		AuthorListParser alp = new AuthorListParser();
		
		AuthorList a = alp.parse("Hallo haloo und ein anderes hallo");
		System.out.println(a);
		
		
	}
}
