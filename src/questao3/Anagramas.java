package questao3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Classe responsável por encontrar o número de pares de
 * de substrings que são anagramas, dada uma string qualquer.
 *
 * @author Levi Freire da Rocha
 */
public class Anagramas {

	/**
     * Método principal para a execução da aplicação.
     * 
     * @param args Parâmetros de entrada para a aplicação.
     */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		String palavra = sc.nextLine();
		
		List<String> subStrings = geraSubStrings(palavra);
		
		int quantidadeAnagramas = verificaQuantidadeAnagramas(subStrings);

		System.out.println(quantidadeAnagramas);
		
		sc.close();
	}

	/**
     * Gera uma lista de substrings dada uma string de entrada.
     * 
     * @param palavra String a ser dividida em substrings.
     * @return Lista de substrings.
     */
	public static List<String> geraSubStrings(String palavra) {
		
		List<String> subStrings = new ArrayList<>();

		for (int i = 1; i < palavra.length(); i++) {
			for (int j = 0; j < palavra.length(); j++) {
				if ((j + i) > palavra.length()) {
					break;
				}
				
				char[] a = palavra.substring(j, j + i).toCharArray();
				Arrays.sort(a);

				subStrings.add(String.valueOf(a));
			}
		}

		return subStrings;
	}

	/**
     * Verifica a quantidade de anagramas dada uma lista de substrings como entrada.
     * 
     * @param subStrings Lista de substrings.
     * @return Quantidade de anagramas.
     */
	public static int verificaQuantidadeAnagramas(List<String> subStrings) {
		int count = 0;

		for (int i = 0; i < subStrings.size(); i++) {
			for (int j = i + 1; j < subStrings.size(); j++) {
				if (subStrings.get(i).equals(subStrings.get(j))) {
					count++;
				}
			}
		}

		return count;
	}
}
