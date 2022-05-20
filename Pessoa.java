package br.com.novolar.cadastro.servlet;

public class Pessoa {
	private Integer idCliente;
	private String strnome;
	private String strsobrenome;
	private String strcpf;

	public Pessoa() {
	}

	public Pessoa(String strnome, String strsobrenome, String strcpf) {
		this.strnome = strnome;
		this.strsobrenome = strsobrenome;
		this.strcpf = strcpf;
		if (this.strnome == null || this.strsobrenome == null || this.strcpf == null) {
			System.out.println("ERRO ! Faltam dados.");
			throw new NullPointerException("Faltam dados");
		}
	}

	public String dadosDePessoa() {
		String dados = "\nNome " + this.strnome;
		dados += "\nSobrenome " + this.strsobrenome;
		dados += "\nCPF " + this.strcpf;

		System.out.println(dados);
		return dados;
	}

	public String getStrnome() {
		return strnome;
	}

	public void setStrnome(String strnome) {
		this.strnome = strnome;
	}

	public String getStrsobrenome() {
		return strsobrenome;
	}

	public void setStrsobrenome(String strsobrenome) {
		this.strsobrenome = strsobrenome;
	}

	public String getStrcpf() {
		return strcpf;
	}

	public void setStrcpf(String strcpf) {
		this.strcpf = strcpf;
	}
	
	public String valida(Object ref) {
		Pessoa p = (Pessoa) ref;
		if (this.strcpf == p.strcpf) {
			throw new IllegalArgumentException("ERRO ! CPF REPETIDO");
		}
		System.out.println("CPF: " + p.strcpf + ", Aceito !");
		return strcpf;
	}

	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

}
