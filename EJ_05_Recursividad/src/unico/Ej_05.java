package unico;

public class Ej_05 {

	public static void main(String[] args) {
		/*Implementar un método recursivo que calcule el valor n de la serie de Fibonacci,  
		 donde n = (n-2) + (n-1), y lo devuelva. Los primeros valores de la serie son siempre: 0, 1.

		0, 1, 1, 2, 3, 5, 8, 13 , 21, 34 …
*/

		int n;
		n=Util.leerInt("Escribe un número");
		
	}
	public static int fibonacci(int n) {
		int res;
		if (n>2) {
			res = n;
		}else {
			res = fibonacci(n-1)+fibonacci(n-2);
		}
		return res;
	}
}
