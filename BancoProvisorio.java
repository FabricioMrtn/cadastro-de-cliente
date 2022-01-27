package br.com.novolar.cadastro.servlet;

import java.util.ArrayList;

public class BancoProvisorio {
	private static ArrayList<Pessoa> Lista = new ArrayList<Pessoa>();
	
	public void adiciona(Pessoa p) {
		BancoProvisorio.Lista.add(p);
	}
	
	public ArrayList<Pessoa> getPessoas(){
		return BancoProvisorio.Lista;
	}
	//Aparentemente esta funcionando, mesmo divergindo do original.
}
