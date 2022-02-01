package br.com.novolar.cadastro.servlet;

public class Endereco {
	private String strrua;
	private String strnumeroCasa;
	private String strbairro;
	private String strcidade;
	private String strestado;
	private String strCep;
	
	public Endereco() {}
	
	public Endereco(String strrua, String strnumeroCasa, String strbairro, String strcidade, String strestado, String strCep) {
		this.strrua = strrua;
		this.strnumeroCasa = strnumeroCasa;
		this.strbairro = strbairro;
		this.strcidade = strcidade;
		this.strestado = strestado;
		this.strCep = strCep;
		
		if(this.strrua == null || this.strnumeroCasa == null || this.strbairro == null || 
				this.strcidade == null || this.strestado == null || this.strCep == null) {
			System.out.println("ERRO ! Faltam dados.");
			throw new NullPointerException("Faltam dados");
		}
	}
	
	public String getStrCep() {
		return strCep;
	}

	public void setStrCep(String strCep) {
		this.strCep = strCep;
	}

	public String dadosDeEndereco() {
		String dados = "\nRua: " + this.strrua;
		dados += "\nNumero Residencia: " + this.strnumeroCasa;
		dados += "\nBairro: " + this.strbairro;
		dados += "\nCidade: " + this.strcidade;
		dados += "\nEstado: " + this.strestado;
		
		System.out.println(dados);
		return dados;
	}

	public String getStrrua() {
		return strrua;
	}

	public void setStrrua(String strrua) {
		this.strrua = strrua;
	}

	public String getStrnumeroCasa() {
		return strnumeroCasa;
	}

	public void setStrnumeroCasa(String strnumeroCasa) {
		this.strnumeroCasa = strnumeroCasa;
	}

	public String getStrbairro() {
		return strbairro;
	}

	public void setStrbairro(String strbairro) {
		this.strbairro = strbairro;
	}

	public String getStrcidade() {
		return strcidade;
	}

	public void setStrcidade(String strcidade) {
		this.strcidade = strcidade;
	}

	public String getStrestado() {
		return strestado;
	}

	public void setStrestado(String strestado) {
		this.strestado = strestado;
		
	}
}
