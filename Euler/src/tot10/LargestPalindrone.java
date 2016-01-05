package tot10;
public class LargestPalindrone {
	
	public LargestPalindrone() {
		
	}
	
	public boolean isPalinDrone(int nr) {
		String s = nr + "";
		for (int i = 0; i < s.length()/2; i++) {
			if (s.charAt(i) != s.charAt(s.length()- i - 1)) {
				return false;
			}
		}
		return true;
	}
	
	public int LargestPalindrome() {
		int largest = 0;
		for (int i = 999; i > 0; i--) {
			for (int j = 999; j > 0; j--) {
				int sum = i * j;
				if (isPalinDrone(sum) && sum > largest) {
					largest = sum;
				}
			}
		} //Math.pow(10,3)-1
		return largest;
	}
}
