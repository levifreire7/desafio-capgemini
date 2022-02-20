package questao3.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import questao3.Anagramas;

public class AnagramasTest {

	@Test
	public void testGeraSubStrings() {

		List<String> subStrings;

		List<String> lista = new ArrayList<>(Arrays.asList("o", "v", "o", "ov", "ov"));

		subStrings = Anagramas.geraSubStrings("ovo");
		Assert.assertEquals(lista, subStrings);
		
		lista = new ArrayList<>(Arrays.asList("i", "f", "a", "i", "l", "u", "h", "k", "q", "q", "fi", "af", "ai", "il", "lu", "hu", "hk",
				"kq", "qq", "afi", "afi", "ail", "ilu", "hlu", "hku", "hkq", "kqq", "afii", "afil", "ailu", "hilu", "hklu", "hkqu", "hkqq",
				"afiil", "afilu", "ahilu", "hiklu", "hklqu", "hkqqu", "afiilu", "afhilu", "ahiklu", "hiklqu", "hklqqu", "afhiilu", "afhiklu",
				"ahiklqu", "hiklqqu", "afhiiklu", "afhiklqu", "ahiklqqu", "afhiiklqu", "afhiklqqu"));
		
		subStrings = Anagramas.geraSubStrings("ifailuhkqq");
		Assert.assertEquals(lista, subStrings);
	}

	@Test
	public void testVerificaQuantidadeAnagramas() {

		int quantidadeAnagramas;

		List<String> lista = new ArrayList<>(Arrays.asList("o", "v", "o", "ov", "ov"));

		quantidadeAnagramas = Anagramas.verificaQuantidadeAnagramas(lista);
		Assert.assertEquals(2, quantidadeAnagramas);
		
		lista = new ArrayList<>(Arrays.asList("i", "f", "a", "i", "l", "u", "h", "k", "q", "q", "fi", "af", "ai", "il", "lu", "hu", "hk",
				"kq", "qq", "afi", "afi", "ail", "ilu", "hlu", "hku", "hkq", "kqq", "afii", "afil", "ailu", "hilu", "hklu", "hkqu", "hkqq",
				"afiil", "afilu", "ahilu", "hiklu", "hklqu", "hkqqu", "afiilu", "afhilu", "ahiklu", "hiklqu", "hklqqu", "afhiilu", "afhiklu",
				"ahiklqu", "hiklqqu", "afhiiklu", "afhiklqu", "ahiklqqu", "afhiiklqu", "afhiklqqu"));
		
		quantidadeAnagramas = Anagramas.verificaQuantidadeAnagramas(lista);
		Assert.assertEquals(3, quantidadeAnagramas);

	}
}
