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
	
	//--------------------------------------------------------------------------------------
	
	private static ArrayList<Endereco> Lista2 = new ArrayList<Endereco>();
	
	public void adiciona2(Endereco e) {
		BancoProvisorio.Lista2.add(e);
	}
	
	public ArrayList<Endereco> getEndereco(){
		return BancoProvisorio.Lista2;
	}
	
	//--------------------------------------------------------------------------------------
	
	private static ArrayList<Contato> Lista3 = new ArrayList<Contato>();
	
	public void adiciona3(Contato c) {
		BancoProvisorio.Lista3.add(c);
	}
	
	public ArrayList<Contato> getContato(){
		return BancoProvisorio.Lista3;
	}
}
