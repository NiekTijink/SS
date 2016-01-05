package tot10;

import java.io.IOException;

public class AMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Problem 1: MultiplesOf3And5 = " + new MultiplesOf(3,5,1000).getSum());
		System.out.println("Problem 2: EvenFibonacciSum = " + new FibonacciSum().getSumEvenFibonacci(4000000));
		System.out.println("Problem 3: LargestPrimeFactor = NOT SOLVED");
		System.out.println("Problem 4: LargestPalindrome = " + new LargestPalindrone().LargestPalindrome());
		//System.out.println("Problem 5: SmallesMultiple = " + new SmallestMultiple().getSmallestMultiple(20));
		System.out.println("Problem 6: SumSquareDifference = " + new SumSquareDiff().getSumSquare(100));
		System.out.println("Problem 7: NrPrime = " + new NrPrime().PrimeNr(10001));
		System.out.println("Problem 8: LargestProduct = " + new LargestProduct().getLargest("1000chars.txt"));

	}

}
