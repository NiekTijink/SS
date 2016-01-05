package tot10;

import java.io.*;
import java.util.Scanner;

public class LargestProduct {
	BufferedReader br;
	Scanner sc;
	public static final String PATH = "C:\\SS home\\Workspace Eclipse\\Euler\\bin\\tot10\\";
	
	public int getLargest(String filename) throws IOException {
		br = new BufferedReader(new FileReader(PATH + filename));
		sc = new Scanner(br.readLine());
		int largest = 0;
		int i = 0;
		int[] nr = new int[1000];
		while (sc.hasNextLine()) {
			while (sc.hasNext()) {
				System.out.println(sc.nextInt());
				//nr[i] = sc.next();
				i++;
			}
		}
		for (int j = 0; j < 988;j++) {
			int prod = 1;
			for (int k = j; k < j + 13; k++) {
				prod = prod * nr[k];
			}
			if (prod > largest) {
				largest = prod;
			}
		}
		return largest;
	}
}
