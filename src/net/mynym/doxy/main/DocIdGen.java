package net.mynym.doxy.main;

import java.util.Random;

/* Drawn from KeyGen in Dev2014\workspace\g
 * 
 * Generates 2- to 9-character strings consisting of characters randomly selected
 * from charSet. Dashes and lower case letters are used for ease of reading and copying.
 * '1' and 'l' are omitted to reduce the likelihood of confusion. The full character set
 * has 34 members. The total size of the 8-character space is 34^8=1.79 x 10e12 or 1.8
 * trillion. The 9-character space is approximately 60 trillion. Assuming that 100,000
 * numbers are in use at any time, the probability of guessing an 8-character one is
 * is 1 in 18 million. The probability of guessing a 9-character one is 1 in 607 million.
 * 
 * Given that this generator is fully random, there is no way to guarantee that a number
 * will not be repeated, although the chance of generating duplicates is low and able to be
 * calculated. To guarantee non-repetition, therefore, this generator must be
 * used in conjunction with a database or register that is unquely indexed.
 * 
 */

public class DocIdGen {
	private static final char[] charSet = { '0', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f',
			'g', 'h', 'i', 'j', 'k', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };

	private static final char[] generated = new char[9];
	private static final Random r = new Random();

	public static String getKey3() {
		for (int i = 0; i < 3; i++) {
			generated[i] = charSet[r.nextInt(charSet.length)];
		}
		String result = new String(generated);
		return result.substring(0, 3);
		
	}
	
	public static String getKey9() {
		for (int i = 0; i < 9; i++) {
			generated[i] = charSet[r.nextInt(charSet.length)];
		}
		String result = new String(generated);
		return result.substring(0, 3) + '-' + result.substring(3, 6) + '-' + result.substring(6, 9);
	}

	public String getKey8() {
		for (int i = 0; i < 8; i++) {
			generated[i] = charSet[r.nextInt(charSet.length)];
		}
		String result = new String(generated);
		return result.substring(0, 4) + '-' + result.substring(4, 8);
	}

	public String getKey7() {
		for (int i = 0; i < 7; i++) {
			generated[i] = charSet[r.nextInt(charSet.length)];
		}
		String result = new String(generated);
		return result.substring(0, 3) + '-' + result.substring(3, 7);
	}

	public String getKey6() {
		for (int i = 0; i < 6; i++) {
			generated[i] = charSet[r.nextInt(charSet.length)];
		}
		String result = new String(generated);
		return result.substring(0, 3) + '-' + result.substring(3, 6);
	}

}
