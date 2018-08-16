package br.com.db1;

import java.util.ArrayList;
import java.util.List;

public class ExercicioDeColecao {

	List<String> Cores = new ArrayList<String>();
	public ExercicioDeColecao(){
		Cores.add("Verde");
		Cores.add("Amarelo");
		Cores.add("Azul");
		Cores.add("Branco");
	}
	
	public void ExibirCores() {
		System.out.println(Cores);
			
	}
	
	public Integer QtdDeItens(){
		System.out.println(Cores.size());
		return Cores.size();
	
		
	}
	

	
}
