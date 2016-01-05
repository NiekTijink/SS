package tot10;

public class SumSquareDiff {

	public int getSumSquare(int till) {
		int sum = 0;
		int sumsq = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
			sumsq += i*i;
		}
		return sum*sum - sumsq;
	}
}
