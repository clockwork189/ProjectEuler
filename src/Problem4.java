
public class Problem4 {

	public static void main( String[] args ) { 
		System.out.println( LargestPalindrome() );
	}
	
	public static long LargestPalindrome() { 
		long max_palindrome = 0;
		for( long i = 999; i >= 100; i-- ) {
			for( long j = 999; j >= 100; j-- ) {
				if( IsPalindrome( j * i ) ) {
					max_palindrome = Math.max( max_palindrome, i * j );
				}
			}
		}
		return max_palindrome;
		}
	
	public static boolean IsPalindrome( long number ) {
		String testNumber = String.valueOf(number);
		int length = testNumber.length();
		for( int i = 0; i < length; i++ ) {
			if( testNumber.charAt(i) != testNumber.charAt(length-1-i) ) {
				return false;
			} 
		}
		return true;
	}
}
