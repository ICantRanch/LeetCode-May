package LeetCode.May;

import java.util.ArrayList;
import java.util.List;

public class SuggestedProducts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	

	public List<List<String>> suggestedProducts(String[] products, String searchWord) {

		List<List<String>> suggests = new ArrayList<>();
		
		String temp = searchWord.charAt(0) + "";
		
		suggests.add(new ArrayList<String>());
		for (String product : products) {
			if(product.contains(temp)) {
				suggests.get(0).add(product);
			}
		}
		
		
		for (int i = 1; i < searchWord.length()-1; i++) {
			
			suggests.add(new ArrayList<String>());
			
			temp = searchWord.substring(0, i+1);
			for (String product : suggests.get(i-1)) {
				if(product.contains(temp)) {
					suggests.get(i).add(product);
				}
			}
			if(suggests.get(i).size() == 0) {return suggests;}
		}
		
		
		
		
		return suggests;
		
		
	}

}
