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
	}

	@Test
	public void testVerificaQuantidadeAnagramas() {

		int quantidadeAnagramas;

		List<String> lista = new ArrayList<>(Arrays.asList("o", "v", "o", "ov", "ov"));

		quantidadeAnagramas = Anagramas.verificaQuantidadeAnagramas(lista);
		Assert.assertEquals(2, quantidadeAnagramas);

	}
}
