package sqlGen;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GeradorTest {

	@Test
	void colunasCodigoTipo() {
		Gerador g = new Gerador("Nome", "String", false, false);
		assertEquals("Nome String,", g.gerar());
	}
	
	@Test
	void colunasCodigoTipoNotnull() {
		Gerador g = new Gerador("Nome", "String", true, false);
		assertEquals("Nome String NOT NULL,", g.gerar());
	}
	
	@Test
	void colunasCodigoTipoAutoincrement() {
		Gerador g = new Gerador("Nome", "String", false, true);
		assertEquals("Nome String AUTO INCREMENT,", g.gerar());
	}
	
	@Test
	void colunasCodigoTipoNotnullAutoincrement() {
		Gerador g = new Gerador("Nome", "String", true, true);
		assertEquals("Nome String NOT NULL AUTO INCREMENT,", g.gerar());
	}

}
