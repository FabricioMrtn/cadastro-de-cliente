package br.com.novolar.cadastro.servlet;

public class Contato {
	private String strTel1;
	private String strTel2;
	private String strEmail;
	
	public Contato() {};
	
	public Contato(String strTel1, String strTel2, String strEmail) {
		this.strTel1 = strTel1;
		this.strTel2 = strTel2;
		this.strEmail = strEmail;
		if(this.strTel1 == null || this.strTel2 == null || this.strEmail == null) {
			System.out.println("ERRO ! Faltam dados.");
			throw new NullPointerException("Faltam dados");
		}
	}
	
	
	public String dadosDeContato() {
		String dados = "\nTelefone 1: " + this.strTel1;
		dados += "\nTelefone 2: " + this.strTel2;
		dados += "\nEmail: " + this.strEmail;
		
		System.out.println(dados);
		return dados;
	}

	public String getStrTel1() {
		return strTel1;
	}

	public void setStrTel1(String strTel1) {
		this.strTel1 = strTel1;
	}

	public String getStrTel2() {
		return strTel2;
	}

	public void setStrTel2(String strTel2) {
		this.strTel2 = strTel2;
	}

	public String getStrEmail() {
		return strEmail;
	}

	public void setStrEmail(String strEmail) {
		this.strEmail = strEmail;
	}
}
