package br.com.db1;

import java.util.ArrayList;
import java.util.List;

public enum EstadosDoBrasil {
	PR("Paraná"), SC("Santa Catarina"), RS("Rio Grande do Sul"), SP("São Paulo"), AM("Amazonas"), RR("Roraima"),
	AP("Amapá"), PA("Pará"),	TO,	RO,	AC,	MA, PI,	CE,	RN,	PE,	AL,	BA,	MT,	MS,	GO, RJ, ES, MG, PB, SE;
	
	private String nomeDoEstado;
	public String getNomeDoEstado(){
		return nomeDoEstado;
	}
	private EstadosDoBrasil (String nome){
		this.nomeDoEstado = nome;
	}
	List<EstadosDoBrasil> estados = new ArrayList<EstadosDoBrasil>();
	
	public List<EstadosDoBrasil> retornaEstadosDoSul(){
		estados.add(PR);
		estados.add(SC);
		estados.add(RS);
		return estados;
	}
	
	public List<EstadosDoBrasil> retornaEstadosDoNorte(){
		estados.add(AM);
		estados.add(RR);
		estados.add(AP);
		estados.add(PA);
		estados.add(TO);
		estados.add(RO);
		estados.add(AC);
		return estados;
	}
	
	public List<EstadosDoBrasil> retornaEstadosDoNordeste(){
		estados.add(MA);
		estados.add(PI);
		estados.add(CE);
		estados.add(RN);
		estados.add(PE);
		estados.add(PB);
		estados.add(SE);
		estados.add(AL);
		estados.add(BA);
		return estados;
	}
	
	public List<EstadosDoBrasil> retornaEstadosDoCentroOeste(){
		estados.add(MT);
		estados.add(MS);
		estados.add(GO);
		return estados;
	}
	
	public List<EstadosDoBrasil> retornaEstadosDoSudeste(){
		estados.add(SP);
		estados.add(RJ);
		estados.add(ES);
		estados.add(MG);
		return estados;
	}
}
