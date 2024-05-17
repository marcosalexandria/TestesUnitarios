package br.ce.wcaquino.servicos;

import org.junit.Assert;
import org.junit.Test;

import br.ce.wcaquino.entidades.Usuario;

public class AssertTest {
	
	@Test
	public void test() {
		
		Assert.assertTrue(true);	//se for false o teste quebra
		Assert.assertTrue(!false);
		
		Assert.assertFalse(false);	//se for true o teste quebra
		Assert.assertFalse(!true);
		
		// valor esperado, valor atual
		
		Assert.assertEquals(1, 1);	//verifica que os doi valores passados são iguais
		
		Assert.assertEquals("Erro de comparação", "bola", "bola");	//pode colocar ums string antes da comparação, se der erro ela é exibida como msg
		Assert.assertNotEquals("bola", "casa");
		
		Usuario u1 = new Usuario("Usuario 1");
		Usuario u2 = new Usuario("Usuario 1");
		Assert.assertEquals(u1, u2);	//a classe tem que ter o hascode e equals para esse teste, se não, irá olhar a referencia do objeto na memoria
		
		Usuario u3 = null;
		Assert.assertTrue(u3 == null);
		
		Assert.assertNull(u3);
		Assert.assertNotNull(u2);
		
		
	}
}
