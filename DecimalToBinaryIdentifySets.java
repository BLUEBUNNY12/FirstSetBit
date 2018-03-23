/*The purpose of this program is to identify the first set bit
 *For example: 4 converted to binary is 100. The first set bit from the right is 3.
 *The user is asked to put in a positive integer, which is then converted to binary,
 *and the user will see a number indicating the first set bit for the given integer.
 */

import java.util.Scanner;

public class DecimalToBinaryIdentifySets {
	public static void main(String[] args){	

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter a positive integer to convert to binary: ");
		int n = input.nextInt();

		decimalToBinary(n);
		firstRightmostSetBit(myArray);
	}

	static int[] myArray = new int[100];


	static void decimalToBinary(int n){
		int j=0;
		while(n>0){
			myArray[j] = n%2;
			j++;
			n=n/2;
		}	
	}

	static void firstRightmostSetBit(int[] myArray){
		for (int i=0; i<=myArray.length; i++){
			if(myArray[i] == 1){
				System.out.println(i+1);
				return;
			}
		}

	}

}

