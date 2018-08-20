package br.com.db1;

import br.com.db1.type.TipoLogradouro;

public class ExemploEnum {

	public static void main(String[] args) {
		System.out.println(TipoLogradouro.RUA.getdescricaoLogradouro());
		System.out.println(TipoLogradouro.PRACA.getdescricaoLogradouro());
		System.out.println(TipoLogradouro.AVENIDA.getdescricaoLogradouro());
		System.out.println(TipoLogradouro.FAZENDA.getdescricaoLogradouro());
		System.out.println(TipoLogradouro.FAZENDA.getsiglaLogradouro());
	}

}
