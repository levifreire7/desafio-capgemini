package questao2;

import java.util.Scanner;

/**
 * Classe respons�vel por solicitar uma senha e exibir a quantidade
 * m�nima de caracteres faltantes para uma senha ser considerada segura. 
 *
 * @author Levi Freire da Rocha
 */
public class SenhaSegura {

	/**
     * M�todo principal para a execu��o da aplica��o.
     * 
     * @param args Par�metros de entrada para a aplica��o.
     */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String senha = "";
		senha = sc.nextLine();
		
		int criteriosNaoAtendidos = 0;
		int numeroCaracteresFaltantes = 0;
		
		if(!VerificaCriterios.possuiDigitos(senha)) {
			criteriosNaoAtendidos++;
		}
		
		if(!VerificaCriterios.possuiLetrasMinusculas(senha)) {
			criteriosNaoAtendidos++;
		}
		
		if(!VerificaCriterios.possuiLetrasMaiusculas(senha)) {
			criteriosNaoAtendidos++;
		}
		
		if(!VerificaCriterios.possuiCaracteresEspeciais(senha)) {
			criteriosNaoAtendidos++;
		}
		
		if(!VerificaCriterios.possuiTamanhoMinimo(senha)) {
			numeroCaracteresFaltantes = VerificaCriterios.caracteresFaltantes(senha);
		}					
		
		if((numeroCaracteresFaltantes == 0) && (criteriosNaoAtendidos == 0)) {
			System.out.println(numeroCaracteresFaltantes);
		}else if(numeroCaracteresFaltantes <= criteriosNaoAtendidos){
			System.out.println(criteriosNaoAtendidos);
		}else if(numeroCaracteresFaltantes > criteriosNaoAtendidos) {
			System.out.println(numeroCaracteresFaltantes);
		}
		
		sc.close();
	}
}
