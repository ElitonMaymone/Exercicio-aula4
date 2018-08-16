package br.com.db1;

import static org.junit.Assert.*;

import org.junit.Test;

public class ExercicioDeColecaoTest {
	
	ExercicioDeColecao Colecao = new ExercicioDeColecao();
	
	@Test
	public void CoresTest(){
		assertFalse(Colecao.Cores.isEmpty());
		assertEquals(Colecao.Cores.get(0), "Verde");
		Colecao.ExibirCores();
				
	}
	
	@Test
	public void QtdDeItens(){
		assertTrue(Colecao.QtdDeItens() == 4); 
		
		
	}
	
	@Test
	public void Parentes(){
		
	}
	
	@Test
	public void Cidades(){
		
	}

	@Test
	public void CoresOrdenadas(){
		
	}
	
	@Test
	public void EliminaCor(){
		
	}
	
	@Test
	public void ParentesOrdenados(){
		
	}
	
	@Test
	public void ParesImpares(){
		
	}

	@Test
	public void NomesOrdenados(){
		
	}
}
