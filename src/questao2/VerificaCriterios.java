/**
 * questao2 Pacote da resolução da questão 2.
 */
package questao2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Classe responsável por verificar os critérios para uma senha segura.
 *
 * @author Levi Freire da Rocha
 */
public class VerificaCriterios {
		
	/**
	* Verifica a quantidade de caracteres faltantes para o tamanho mínimo de 6.
	*
	* @param senha Senha digitada pelo usuário
	* @return Número de caracteres faltantes para 6.
	*/
	public static int caracteresFaltantes(String senha) {
		int caracteresFaltantes = 6 - senha.length();

		return caracteresFaltantes >= 0 ? caracteresFaltantes : 0;
	}

	/**
	* Verifica se a senha possui a quantidade mínima de 6 caracteres.
	*
	* @param senha Senha digitada pelo usuário
	* @return true se a senha possui no mínimo 6 caracteres, false caso contrário.
	*/
	public static boolean possuiTamanhoMinimo(String senha) {
		if (senha == null)
			return false;

		return senha.length() >= 6;
	}

	/**
	* Verifica se a senha possui no mínimo 1 dígito.
	*
	* @param senha Senha digitada pelo usuário
	* @return true se a senha possui no mínimo 1 dígito, false caso contrário.
	*/
	public static boolean possuiDigitos(String senha) {
		if (senha == null)
			return false;

		for (int i = 0; i < senha.length(); i++) {
			if (!Character.isAlphabetic((senha.charAt(i)))) {
				return true;
			}
		}
		return false;
	}

	/**
	* Verifica se a senha possui no mínimo 1 letra minúscula.
	*
	* @param senha Senha digitada pelo usuário
	* @return true se a senha possui no mínimo 1 letra minúscula, false caso contrário.
	*/
	public static boolean possuiLetrasMinusculas(String senha) {
		if (senha == null)
			return false;

		for (int i = 0; i < senha.length(); i++) {
			if (Character.isLowerCase(senha.charAt(i))) {
				return true;
			}
		}
		return false;
	}

	/**
	* Verifica se a senha possui no mínimo 1 letra maiúscula.
	*
	* @param senha Senha digitada pelo usuário
	* @return true se a senha possui no mínimo 1 letra maiúscula, false caso contrário.
	*/
	public static boolean possuiLetrasMaiusculas(String senha) {
		if (senha == null)
			return false;

		for (int i = 0; i < senha.length(); i++) {
			if (Character.isUpperCase(senha.charAt(i))) {
				return true;
			}
		}
		return false;
	}

	/**
	* Verifica se a senha possui no mínimo 1 caracter especial.
	*
	* @param senha Senha digitada pelo usuário
	* @return true se a senha possui no mínimo 1 caractere especial, false caso contrário.
	*/
	public static boolean possuiCaracteresEspeciais(String senha) {
		if (senha == null)
			return false;

		Pattern pattern = Pattern.compile("[\\!\\@\\#\\$\\%\\^\\&\\*\\(\\)\\-\\+]");
		Matcher matcher = pattern.matcher(senha);
		boolean matchFound = matcher.find();

		if (matchFound) {
			return true;
		}
		return false;
	}
}
