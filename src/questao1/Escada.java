package questao1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Classe responsável por mostrar na tela uma escada
 * de altura e base n utilizando espaços e o caractere *
 *
 * @author Levi Freire da Rocha
 */
public class Escada {

	/**
     * Método principal para a execução da aplicação.
     * 
     * @param args Parâmetros de entrada para a aplicação.
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
			System.out.println("Entrada inválida! Digite um número inteiro");
		}

	}

	/**
     * Método que retorna um degrau (String) composto por uma sequência de *.
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
