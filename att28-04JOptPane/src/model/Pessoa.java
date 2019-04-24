package model;

public class Pessoa {
	private String nome;
	private String end;
	private String bairro;
	private String cep;
	private String cid;
	private String est;
	
	//nome
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	//endereço
	public void setEnd(String end) {
		this.end = end;
	}
	
	public String getEnd() {
		return end;
	}
	
	//bairro
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	public String getBairro() {
		return bairro;
	}
	
	//cep
	public void setCep(String cep) {
		this.cep = cep;
	}
	
	public String getCep() {
		return cep;
	}
	
	//cidade
	public void setCid(String cid) {
		this.cid = cid;
	}
	
	public String getCid() {
		return cid;
	}
	
	//estado
	public void setEst(String est) {
		this.est = est;
	}
			
	public String getEst() {
		return est;
	}
		
}

