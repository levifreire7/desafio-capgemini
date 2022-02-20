package questao1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Classe respons�vel por mostrar na tela uma escada
 * de altura e base n utilizando espa�os e o caractere *
 *
 * @author Levi Freire da Rocha
 */
public class Escada {

	/**
     * M�todo principal para a execu��o da aplica��o.
     * 
     * @param args Par�metros de entrada para a aplica��o.
     */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {
			int n = sc.nextInt();

			for (int i = 1; i <= n; i++) {
				for (int j = n - i; j > 0; j--) {
					System.out.print(" ");
				}
				System.out.println(criaDegrau(i));
			}
			sc.close();
		} catch (InputMismatchException e) {
			System.out.println("Entrada inv�lida! Digite um n�mero inteiro");
		}

	}

	/**
     * M�todo que retorna um degrau (String) composto por uma sequ�ncia de *.
     * @param tamanhoDegrau Tamanho do degrau a ser exibido.
     * @return Degrau (String) de tamanho n.
     */
	public static String criaDegrau(int tamanhoDegrau) {
		String degrau = "";

		if (tamanhoDegrau < 0) {
			return "";
		}

		for (int i = 0; i < tamanhoDegrau; i++) {
			degrau += "*";
		}

		return degrau;
	}
}
