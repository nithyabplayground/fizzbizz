package com.example;

/**
 * Class to test fizzbuzz functionality
 */
public class Solution {


	/**
	 * Performs the required operation
	 * @param inputRange Represents the ending number in the range. For example, If the range is 1-20, then inputRange will be 20
	 * @return the formatted string
	 */
	public String perform(final int inputRange){

		StringBuilder output = new StringBuilder();
		int fizzCount = 0;
		int buzzCount = 0;
		int fizzbuzzCount = 0;
		int luckyCount = 0;
		int integer = 0;
		if(inputRange <= 0){
			return Strings.EMPTY;
		}

		for (int i = 1; i <= inputRange; i++) {

			//if the number contains 3
			if(String.valueOf(i).contains("3")){
				output.append("lucky").append(" ");
				luckyCount++;
			}
			//if the number is a multiple of 15
			else if(i % 15 == 0){
				output.append("fizzbuzz").append(" ");
				fizzbuzzCount++;
			}
			//if the number is a multiple of 5
			else if(i % 5 == 0){
				output.append("buzz").append(" ");
				buzzCount++;
			}
			//if the number is a multiple of 3
			else if(i != 3 && i % 3 == 0){
				output.append("fizz").append(" ");
				fizzCount++;
			}
			else{
				output.append(i).append(" ");
				integer++;
			}
		}

		System.out.println("fizz: " + fizzCount);
		System.out.println("buzz: " + buzzCount);
		System.out.println("fizzbuzz: " + fizzbuzzCount);
		System.out.println("lucky: " + luckyCount);
		System.out.println("integer: " + integer);
		return output.toString();
	}

	public static void main(String[] args) {

		Solution solution = new Solution();
		assert !Strings.isNullOrEmpty(args[0]);

		try {
			solution.perform(Integer.parseInt(args[0]));
		}catch (NumberFormatException nfe){
			System.out.println(args[0] + " Is not a number");
		}
	}

}
