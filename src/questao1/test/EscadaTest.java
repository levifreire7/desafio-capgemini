package questao1.test;

import org.junit.Assert;
import org.junit.Test;

import questao1.Escada;

public class EscadaTest {
	
	@Test
	public void testCriaDegrau() {
		String degrau;
		
		degrau = Escada.criaDegrau(-1);
		Assert.assertEquals("", degrau);
		
		degrau = Escada.criaDegrau(0);
		Assert.assertEquals("", degrau);
		
		degrau = Escada.criaDegrau(1);
		Assert.assertEquals("*", degrau);
		
		degrau = Escada.criaDegrau(4);
		Assert.assertEquals("****", degrau);
		
		degrau = Escada.criaDegrau(10);
		Assert.assertEquals("**********", degrau);
	}
}
