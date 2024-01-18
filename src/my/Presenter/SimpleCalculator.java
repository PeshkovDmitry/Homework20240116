package my.Presenter;

import my.View.PrintScreen;
import my.Model.Adder;
import my.Model.Divider;
import my.Model.Multiplier;
import my.Model.Subtractor;

/**
* Основной класс простого калькулятора
*/

public class SimpleCalculator {
	
	/**
	* Класс main - точка входа
	* @param args Аргументы командной строки
	*/
	
	public static void main(String[] args) {
		
		new PrintScreen().print(
			new Adder().add(2.0f,3.0f)
		);

		new PrintScreen().print(
			new Subtractor().sub(4.0f,3.0f)
		);		

		new PrintScreen().print(
			new Multiplier().mul(4.0f,3.0f)
		);	
		
		new PrintScreen().print(
			new Divider().div(4.0f,3.0f)
		);			
	
	}
	
}
