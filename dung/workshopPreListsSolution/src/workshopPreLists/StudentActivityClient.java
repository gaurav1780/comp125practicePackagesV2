package workshopPreLists;

import java.util.ArrayList;

public class StudentActivityClient {

	public static void main(String[] args) {
		//student activity 1
		ArrayList<Integer> outcomes = new ArrayList<Integer>();
		
		//student activity 2
		System.out.println("list after instantiation: "+outcomes);
		
		//student activity 3	
		outcomes.add(5);
		outcomes.add(6);
		outcomes.add(2);
		System.out.println("after initial population: "+outcomes);
		
		//student activity 4
		int nRolls = outcomes.size();
		System.out.println("number of items: "+nRolls);
		
		//student activity 5	
		int first = outcomes.get(0);
		System.out.println("first item: "+first);
		int last = outcomes.get(outcomes.size()-1);
		System.out.println("last item: "+last);

		
		//student activity 6	
		outcomes.add(1, 4);
		System.out.println("after adding 4 at index 1: "+outcomes);
		
		//student activity 7
		outcomes.remove(0);
		System.out.println("after removing first item: "+outcomes);
		outcomes.remove(outcomes.size()-1);
		System.out.println("after removing last item: "+outcomes);
		
		//student activity 8	
		outcomes.remove((Integer)4);
		System.out.println("after removing first occurrence of item with value 4: "+outcomes);
		outcomes.add(3);
		outcomes.add(5);
		outcomes.add(2);
		System.out.println("after adding items 3, 5 and 2: "+outcomes);
		
		//student activity 9	
		int moreThanTwo = 0;
		for(int i=0; i < outcomes.size(); i++) {
			if(outcomes.get(i) > 2) {
				moreThanTwo++;
			}
		}
		System.out.println("number of items more than two: "+moreThanTwo);
		
		//student activity 10
		outcomes.add(6);
		System.out.println("first index at which item 6 found: "+outcomes.indexOf(6));
		System.out.println("last index at which item 6 found: "+outcomes.lastIndexOf(6));
		System.out.println("first index at which item 1 found: "+outcomes.indexOf(1));
	}

}
