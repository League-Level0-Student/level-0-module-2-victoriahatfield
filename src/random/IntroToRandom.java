//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package random;

import java.util.Random;

//1. Run the program.  What number appears in the console?
//   Run it again. Is the number the same?


public class IntroToRandom {
	public static void main(String[] args) {
		Random gen= new Random();
		//int r = gen.nextInt(101);
		int r = gen.nextInt(88- -222) -222;
		
		//2. Now make r random. 
		//   Create an object of the Random class
		//   Hint: new Random().nextInt()

		//3. Limit the random number between 0 and 100

		//4. Limit the random number between 25 and 75. Hint: (highest value - lowest value) + lowest value

		//5. Challenge: Limit the random number between -222 and 88


		
		System.out.println(r); 
	}
}