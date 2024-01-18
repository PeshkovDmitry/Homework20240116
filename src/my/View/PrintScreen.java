package my.View;

/**
* Класс, реализующий взаимодействие с пользователем через терминал
* @param result Вещественное число для вывода на экран
*/

public class PrintScreen {
	
	/**
	* Метод для вывода вещественного числа на экран
	*/
	
	public void print(Float result) {

		System.out.println(
			String.format(
				"Результат расчета - %f",
				result
			)
		);
	
	}
	
}
