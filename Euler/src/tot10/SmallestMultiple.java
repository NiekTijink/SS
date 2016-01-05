package tot10;

public class SmallestMultiple {

	public int getSmallestMultiple(int till) {
		boolean doorgaan = true;
		int i = 2520;
		while (doorgaan) {
			i++;
			boolean test = true;
			int j = 1;
			while (test && j <= 20) {
				if (i%j != 0) {
					test = false;
				} else {
					j++;
				}
			}
			if (test) {
				return i;
			} 
		}
		return 0;
	}
}
