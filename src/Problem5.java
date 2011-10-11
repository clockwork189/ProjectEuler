/* 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */
public class Problem5 {

	public static void main( String[]args ) { 
		int range = 20;
		System.out.println( SmallestDivisible( range ) );
	}
	
	public static long SmallestDivisible( int range ) {
		int original_range = range;
		int i = 1;
		while( range != 0 ) {
			int result = i%range;
			if( result == 0 ) {
				range--;
			} else if( result != 0 ) {
				range = original_range;
				i++;
			}
		}
		return i;
	}
}
