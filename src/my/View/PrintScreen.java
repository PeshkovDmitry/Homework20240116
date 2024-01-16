package my.View;

/**
* The presenter class of simple calculator.
* It prints a result.
* @param result Result to print
*/

public class PrintScreen {
	
	/**
	* Static class main - entry point
	*/
	
	public void print(Float result) {

		System.out.println(
			String.format(
				"The result is %f",
				result
			)
		);
	
	}
	
}
