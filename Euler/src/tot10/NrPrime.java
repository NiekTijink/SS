package tot10;

public class NrPrime {

	public boolean isPrime(int nr) {
		for (int i = 2; i <= Math.sqrt(nr); i++) {
			if (nr%i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public int PrimeNr(int nr) {
		int i = 1;
		int count = 2;
		while (i<nr) {
			count++;
			if (isPrime(count)) {
				i++;
			}
		}
		if (isPrime(count)) {
			System.out.println("Ok");
		}
		return count;
	}
}
