package questao2.test;

import org.junit.Test;
import org.junit.Assert;

import questao2.VerificaCriterios;

public class VerificaCriteriosTest {

	@Test
	public void testCaracteresFaltantes() {

		int caracteresFaltantes;

		caracteresFaltantes = VerificaCriterios.caracteresFaltantes("");
		Assert.assertEquals(6, caracteresFaltantes);

		caracteresFaltantes = VerificaCriterios.caracteresFaltantes("abc");
		Assert.assertEquals(3, caracteresFaltantes);

		caracteresFaltantes = VerificaCriterios.caracteresFaltantes("abcdef");
		Assert.assertEquals(0, caracteresFaltantes);

		caracteresFaltantes = VerificaCriterios.caracteresFaltantes("abcdef123");
		Assert.assertEquals(0, caracteresFaltantes);
	}

	@Test
	public void testPossuiTamanhoMinimo() {

		boolean possuiTamanhoMinimo;

		possuiTamanhoMinimo = VerificaCriterios.possuiTamanhoMinimo(null);
		Assert.assertFalse(possuiTamanhoMinimo);

		possuiTamanhoMinimo = VerificaCriterios.possuiTamanhoMinimo("");
		Assert.assertFalse(possuiTamanhoMinimo);

		possuiTamanhoMinimo = VerificaCriterios.possuiTamanhoMinimo("abc");
		Assert.assertFalse(possuiTamanhoMinimo);

		possuiTamanhoMinimo = VerificaCriterios.possuiTamanhoMinimo("abc#1A");
		Assert.assertTrue(possuiTamanhoMinimo);

		possuiTamanhoMinimo = VerificaCriterios.possuiTamanhoMinimo("abc#1Ao4Haf");
		Assert.assertTrue(possuiTamanhoMinimo);
	}

	@Test
	public void testPossuiDigitos() {

		boolean possuiDigitos;

		possuiDigitos = VerificaCriterios.possuiDigitos(null);
		Assert.assertFalse(possuiDigitos);

		possuiDigitos = VerificaCriterios.possuiDigitos("abc");
		Assert.assertFalse(possuiDigitos);

		possuiDigitos = VerificaCriterios.possuiDigitos("abcABC");
		Assert.assertFalse(possuiDigitos);

		possuiDigitos = VerificaCriterios.possuiDigitos("abc1ABC");
		Assert.assertTrue(possuiDigitos);

		possuiDigitos = VerificaCriterios.possuiDigitos("123abc");
		Assert.assertTrue(possuiDigitos);

		possuiDigitos = VerificaCriterios.possuiDigitos("abcABC123%@");
		Assert.assertTrue(possuiDigitos);
	}

	@Test
	public void testPossuiLetrasMinusculas() {

		boolean possuiLetrasMinusculas;

		possuiLetrasMinusculas = VerificaCriterios.possuiLetrasMinusculas(null);
		Assert.assertFalse(possuiLetrasMinusculas);

		possuiLetrasMinusculas = VerificaCriterios.possuiLetrasMinusculas("ABC");
		Assert.assertFalse(possuiLetrasMinusculas);

		possuiLetrasMinusculas = VerificaCriterios.possuiLetrasMinusculas("abcABC");
		Assert.assertTrue(possuiLetrasMinusculas);

		possuiLetrasMinusculas = VerificaCriterios.possuiLetrasMinusculas("abc1ABC");
		Assert.assertTrue(possuiLetrasMinusculas);

		possuiLetrasMinusculas = VerificaCriterios.possuiLetrasMinusculas("123abc");
		Assert.assertTrue(possuiLetrasMinusculas);

		possuiLetrasMinusculas = VerificaCriterios.possuiLetrasMinusculas("abcABC123%@");
		Assert.assertTrue(possuiLetrasMinusculas);
	}

	@Test
	public void testPossuiLetrasMaiusculas() {

		boolean possuiLetrasMaiusculas;

		possuiLetrasMaiusculas = VerificaCriterios.possuiLetrasMaiusculas(null);
		Assert.assertFalse(possuiLetrasMaiusculas);

		possuiLetrasMaiusculas = VerificaCriterios.possuiLetrasMaiusculas("abc");
		Assert.assertFalse(possuiLetrasMaiusculas);

		possuiLetrasMaiusculas = VerificaCriterios.possuiLetrasMaiusculas("abcABC");
		Assert.assertTrue(possuiLetrasMaiusculas);

		possuiLetrasMaiusculas = VerificaCriterios.possuiLetrasMaiusculas("abc1ABC");
		Assert.assertTrue(possuiLetrasMaiusculas);

		possuiLetrasMaiusculas = VerificaCriterios.possuiLetrasMaiusculas("123abc");
		Assert.assertFalse(possuiLetrasMaiusculas);

		possuiLetrasMaiusculas = VerificaCriterios.possuiLetrasMaiusculas("abcABC123%@");
		Assert.assertTrue(possuiLetrasMaiusculas);
	}
	
	@Test
	public void testPossuiCaracteresEspeciais() {
		
		boolean possuiCaracteresEspeciais;
		
		possuiCaracteresEspeciais = VerificaCriterios.possuiCaracteresEspeciais(null);
		Assert.assertFalse(possuiCaracteresEspeciais);
		
		possuiCaracteresEspeciais = VerificaCriterios.possuiCaracteresEspeciais("abc");
		Assert.assertFalse(possuiCaracteresEspeciais);
		
		possuiCaracteresEspeciais = VerificaCriterios.possuiCaracteresEspeciais("ABC");
		Assert.assertFalse(possuiCaracteresEspeciais);
		
		possuiCaracteresEspeciais = VerificaCriterios.possuiCaracteresEspeciais("abc123");
		Assert.assertFalse(possuiCaracteresEspeciais);
		
		possuiCaracteresEspeciais = VerificaCriterios.possuiCaracteresEspeciais("ABCdef123");
		Assert.assertFalse(possuiCaracteresEspeciais);		
		
		possuiCaracteresEspeciais = VerificaCriterios.possuiCaracteresEspeciais("ABCdef!23");
		Assert.assertTrue(possuiCaracteresEspeciais);
		
		possuiCaracteresEspeciais = VerificaCriterios.possuiCaracteresEspeciais("@BCdef123");
		Assert.assertTrue(possuiCaracteresEspeciais);
		
		possuiCaracteresEspeciais = VerificaCriterios.possuiCaracteresEspeciais("ABCdef#123");
		Assert.assertTrue(possuiCaracteresEspeciais);
		
		possuiCaracteresEspeciais = VerificaCriterios.possuiCaracteresEspeciais("ABCdef$123");
		Assert.assertTrue(possuiCaracteresEspeciais);
		
		possuiCaracteresEspeciais = VerificaCriterios.possuiCaracteresEspeciais("ABCdef%123");
		Assert.assertTrue(possuiCaracteresEspeciais);
		
		possuiCaracteresEspeciais = VerificaCriterios.possuiCaracteresEspeciais("ABCdef^123");
		Assert.assertTrue(possuiCaracteresEspeciais);
		
		possuiCaracteresEspeciais = VerificaCriterios.possuiCaracteresEspeciais("ABCdef&123");
		Assert.assertTrue(possuiCaracteresEspeciais);
		
		possuiCaracteresEspeciais = VerificaCriterios.possuiCaracteresEspeciais("ABCdef*123");
		Assert.assertTrue(possuiCaracteresEspeciais);
		
		possuiCaracteresEspeciais = VerificaCriterios.possuiCaracteresEspeciais("(ABCdef*123");
		Assert.assertTrue(possuiCaracteresEspeciais);
		
		possuiCaracteresEspeciais = VerificaCriterios.possuiCaracteresEspeciais("ABCdef123)");
		Assert.assertTrue(possuiCaracteresEspeciais);
		
		possuiCaracteresEspeciais = VerificaCriterios.possuiCaracteresEspeciais("ABCdef-123");
		Assert.assertTrue(possuiCaracteresEspeciais);
		
		possuiCaracteresEspeciais = VerificaCriterios.possuiCaracteresEspeciais("ABCdef+123");
		Assert.assertTrue(possuiCaracteresEspeciais);
		
	}
}
