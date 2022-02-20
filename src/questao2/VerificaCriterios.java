/**
 * questao2 Pacote da resolu��o da quest�o 2.
 */
package questao2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Classe respons�vel por verificar os crit�rios para uma senha segura.
 *
 * @author Levi Freire da Rocha
 */
public class VerificaCriterios {
		
	/**
	* Verifica a quantidade de caracteres faltantes para o tamanho m�nimo de 6.
	*
	* @param senha Senha digitada pelo usu�rio
	* @return N�mero de caracteres faltantes para 6.
	*/
	public static int caracteresFaltantes(String senha) {
		int caracteresFaltantes = 6 - senha.length();

		return caracteresFaltantes >= 0 ? caracteresFaltantes : 0;
	}

	/**
	* Verifica se a senha possui a quantidade m�nima de 6 caracteres.
	*
	* @param senha Senha digitada pelo usu�rio
	* @return true se a senha possui no m�nimo 6 caracteres, false caso contr�rio.
	*/
	public static boolean possuiTamanhoMinimo(String senha) {
		if (senha == null)
			return false;

		return senha.length() >= 6;
	}

	/**
	* Verifica se a senha possui no m�nimo 1 d�gito.
	*
	* @param senha Senha digitada pelo usu�rio
	* @return true se a senha possui no m�nimo 1 d�gito, false caso contr�rio.
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
	* Verifica se a senha possui no m�nimo 1 letra min�scula.
	*
	* @param senha Senha digitada pelo usu�rio
	* @return true se a senha possui no m�nimo 1 letra min�scula, false caso contr�rio.
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
	* Verifica se a senha possui no m�nimo 1 letra mai�scula.
	*
	* @param senha Senha digitada pelo usu�rio
	* @return true se a senha possui no m�nimo 1 letra mai�scula, false caso contr�rio.
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
	* Verifica se a senha possui no m�nimo 1 caracter especial.
	*
	* @param senha Senha digitada pelo usu�rio
	* @return true se a senha possui no m�nimo 1 caractere especial, false caso contr�rio.
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
