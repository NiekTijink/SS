package tot10;

public class MultiplesOf {
	int a;
	int b;
	int end;
	int sum;
	
	public MultiplesOf(int multiple1, int multiple2, int till) {
		a = multiple1;
		b = multiple2;
		end = till;
	}
	
	public int getSum() {
		for (int i = 0; i < end; i++) {
			if (i%a == 0 || i%b == 0) {
				sum += i;
			}
		}
		return sum;
	}
}
