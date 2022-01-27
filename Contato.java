package br.com.novolar.cadastro.servlet;

public class Contato {
	private int intTel1;
	private int intTel2;
	private String strEmail;
	
	public Contato(int strTel1, int strTel2, String strEmail) {
		this.intTel1 = strTel1;
		this.intTel2 = strTel2;
		this.strEmail = strEmail;
		if(this.intTel1 == 0 || this.intTel2 == 0 || this.strEmail == null) {
			System.out.println("ERRO ! Faltam dados.");
			throw new NullPointerException("Faltam dados");
		}
	}
	
	
	public String dadosDeContato() {
		String dados = "\nTelefone 1: " + this.intTel1;
		dados += "\nTelefone 2: " + this.intTel2;
		dados += "\nEmail: " + this.strEmail;
		
		System.out.println(dados);
		return dados;
	}

	public int getStrTel1() {
		return intTel1;
	}

	public void setStrTel1(int strTel1) {
		this.intTel1 = strTel1;
	}

	public int getStrTel2() {
		return intTel2;
	}

	public void setStrTel2(int strTel2) {
		this.intTel2 = strTel2;
	}

	public String getStrEmail() {
		return strEmail;
	}

	public void setStrEmail(String strEmail) {
		this.strEmail = strEmail;
	}

}
