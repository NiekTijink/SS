package tot10;

public class FibonacciSum {
	
	public FibonacciSum() {
	}
	
	
	public long getSumEvenFibonacci(int end) {
		int a = 1;
		int b = 2;
		int c = 0;
		long sum = 2;
		while (a + b <= end) {
			c = a + b;
			if (c%2 == 0) {
				sum += c;
			}
			a = b;
			b = c;
		}
		return sum;
	}
}
