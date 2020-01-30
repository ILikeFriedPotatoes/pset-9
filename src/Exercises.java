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
		return false;	// default return value to ensure compilation
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
			a.add()
			a.set(i, values.get(i));
			a.set(a.size() - i, values.get(values.size() - i));
		}
		return a;
	}
	
	public int difference(ArrayList<Integer> numbers) {
		// write your code here
		
		return -1;		// default return value to ensure compilation
	}
	
	public double biggest(ArrayList<Double> numbers) {
		// write your code here
		
		return -1;		// default return value to ensure compilation
	}
	
	public ArrayList<String> middle(ArrayList<String> values) {
		// write your code here
		
		return null;	// default return value to ensure compilation
	}

	public boolean increasing(ArrayList<Integer> numbers) {
		// write your code here
		
		return false;	// default return value to ensure compilation
	}
	
	public boolean everywhere(ArrayList<Integer> numbers, int x) {
		// write your code here
		
		return false;	// default return value to ensure compilation
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
