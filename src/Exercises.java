import java.util.ArrayList;

public class Exercises {

	public boolean commonEnd(ArrayList<Integer> a, ArrayList<Integer> b) {
		if (a == null || a.isEmpty() || b == null || b.isEmpty()) {
			return false;
		}
		
		// write your code here
		if(b.size() < 0) {
			return false;
		}
		if(a.get(0) == b.get(0)) {
			return true;
		} else if(a.get(a.size() - 1) == b.get(b.size() - 1)) {
			return true;
		}
		return false;
	}
	
	public ArrayList<String> endsMeet(ArrayList<String> values, int n) {
		// write your code here
		ArrayList<String> empty = new ArrayList<String>();
		if(values == null) {
			return empty;
		} else if(values.size() < n) {
			return empty;
		} else if(n < 0) {
			return empty;
		}
		ArrayList<String> a = new ArrayList<String>();
		for(int i = 0; i < n; i ++) {
			a.add(values.get(i));
		}
		for(int i = 0; i < n; i ++) {
			//a.add("2");
			a.add(values.get(values.size() - n + i));	
		}
		return a;
	}
	
	public int difference(ArrayList<Integer> numbers) {
		// write your code here
		if(numbers == null) {
			return -1;
		} else if(numbers.size() < 1) {
			return -1;
		}
		int maximum = numbers.get(0);
		int mininum = numbers.get(0);
		for(int i = 0; i < numbers.size(); i++) {
			maximum = (numbers.get(i) > maximum) ? numbers.get(i) : maximum;
			mininum = (numbers.get(i) < mininum) ? numbers.get(i) : mininum;
		}
		return maximum - mininum;		// default return value to ensure compilation
	}
	
	public double biggest(ArrayList<Double> numbers) {
		// write your code here
		if(numbers == null) {
			return -1;
		} else if (numbers.size() < 3 || numbers.size() % 2 == 0) {
			return -1;
		}
		double first = numbers.get(0);
		double middle = numbers.get((int) Math.floor(numbers.size() / 2));
		double last = numbers.get(numbers.size() -1);
		double maximum = (first > middle && first > last) ? first :
		(middle > last) ? middle :
		last;
		return maximum;		// default return value to ensure compilation
	}
	
	public ArrayList<String> middle(ArrayList<String> values) {
		// write your code here
		ArrayList<String> empty = new ArrayList<String>();
		if(values == null) {
			return empty;
		} else if (values.size() < 3 || values.size() % 2 == 0) {
			return empty;
		}
		String first = values.get((int) Math.floor(values.size() / 2) - 1);
		String middle = values.get((int) Math.floor(values.size() / 2));
		String last = values.get((int) Math.floor(values.size() / 2) + 1);
		ArrayList<String> returnArrayList = new ArrayList<String>();
		returnArrayList.add(first);
		returnArrayList.add(middle);
		returnArrayList.add(last);
		return returnArrayList;	// default return value to ensure compilation
	}

	public boolean increasing(ArrayList<Integer> numbers) {
		// write your code here
		if(numbers == null) {
			return false;
		} else if (numbers.size() < 1) {
			return false;
		}
		for(int i = 0; i < numbers.size() - 2; i++) {
			double first = numbers.get(i);
			double middle = numbers.get(i + 1);
			double last = numbers.get(i + 2);
			if(first > middle || middle > last) {
				return false;
			}
		}
		return true;
	}
	
	public boolean everywhere(ArrayList<Integer> values, int x) {
		// write your code here
		if(values == null) {
			return false;
		} else if (values.size() < 1) {
			return false;
		}
		for(int i = 1; i < values.size() - 1; i ++) {
			if(values.get(i) != x) {
				if((values.get(i - 1) != x) || (values.get(i + 1) != x)) {
					return false;
				}
			}
		}
		return true;
	}
	
	public boolean consecutive(ArrayList<Integer> numbers) {
		// write your code here
		
		return false;	// default return value to ensure compilation
	}
	
	public boolean balance(ArrayList<Integer> numbers) {
		// write your code here
		
		return false;	// default return value to ensure compilation
	}
	
	public int clumps(ArrayList<String> values) {
		// write your code here
		
		return -1;		// default return value to ensure compilation
	}
}
