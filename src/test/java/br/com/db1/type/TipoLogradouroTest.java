package br.com.db1.type;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TipoLogradouroTest {

	@Test
	public void siglaLogradouroTest(){
		assertEquals("R:", TipoLogradouro.RUA.getsiglaLogradouro());
		assertEquals("Fz:", TipoLogradouro.FAZENDA.getsiglaLogradouro());
		assertEquals("Pc:", TipoLogradouro.PRACA.getsiglaLogradouro());
		assertEquals("Av:", TipoLogradouro.AVENIDA.getsiglaLogradouro());
	}
	
	@Test
	public void descricaoLogradouroTest(){
		assertEquals("Praça", TipoLogradouro.PRACA.getdescricaoLogradouro());
		assertEquals("Rua", TipoLogradouro.RUA.getdescricaoLogradouro());
		assertEquals("Fazenda", TipoLogradouro.FAZENDA.getdescricaoLogradouro());
		assertEquals("Avenida", TipoLogradouro.AVENIDA.getdescricaoLogradouro());
	}
	
}