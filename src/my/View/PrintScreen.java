package my.View;

/**
* Класс, реализующий взаимодействие с пользователем через терминал
*/

public class PrintScreen {
	
	/**
	* Метод для вывода вещественного числа на экран
	* @param result Вещественное число для вывода на экран
	*/
	
	public void print(float result) {

		System.out.println(
			String.format(
				"Результат расчета - %f",
				result
			)
		);
	
	}
	
}
