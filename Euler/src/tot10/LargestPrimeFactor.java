package tot10;
import java.math.BigInteger;

public class LargestPrimeFactor {

	public LargestPrimeFactor() {
	}
	
	public boolean isPrime(int nr) {
		for (long i = 0; i < Math.sqrt(nr); i++) {
			if (nr%i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public BigInteger getLargestPrime(BigInteger nr) {
		for (long i = nr; i > 0; i--) {
			if (isPrime(nr)) {
				return nr;
			}
		}
		return null;
	}
	
	public long getLargestPrime(long nr) {
		for (long i = (nr / 2) + 1; i > 0; i--) {
			if (isPrime(nr)) {
				return nr;
			}
		}
		return 0;
	}
}
