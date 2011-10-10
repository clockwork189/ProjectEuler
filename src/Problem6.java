/*The sum of the squares of the first ten natural numbers is,
 * 12 + 22 + ... + 102 = 385
 * The square of the sum of the first ten natural numbers is,
 * (1 + 2 + ... + 10)2 = 552 = 3025
 * Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025  385 = 2640.
 * Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
*/

public class Problem6 {
	public static void main( String[]args ) { 
		int range = 100;
		long result1 = sumSquares( range , 0);   //9223372036854775807
		long result2 = (long) Math.pow( sumSquared( range , 0), 2 );   //25502500
		long difference = result1 - result2;     //9223372036829273307
		System.out.println(result1 + " - " + result2);
		System.out.println( difference );
	}
	
	public static long sumSquares( int range, long sum ) {
		if( range == 0 ) {
			return sum;
		} else {
			sum = (long) (sum + Math.pow( range, 2 ));
			range--;
			return sumSquares( range, sum );
		}
	}
	
	public static long sumSquared( int range, long sum ) {
		if( range == 0 ) {
			return sum;
		} else {
			sum = sum + range;
			range--;
			return sumSquared( range, sum );
		}
	}
}
