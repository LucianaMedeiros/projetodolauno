package model;

public class Usuario {
	//Aluno é um Usuario.Se o verbo bate, então pode(Aluno pode ser usuario? Se sim= Aluno Andestain)
	//codigo(inteiro),nome(string),email(string),password(string)
	//modificador de acesso, tipo e nome
	private Integer codigo;
	private String nome;
	private String email;
	private String senha;
	private String acesso;
	//get(=tipo . saida da alimentacao) e o set(=Void .entrada da alimentação)
	//sempre sera gerado o dobro(se temos 5 usuarios sera gerado 10)
	
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getAcesso() {
		return acesso;
	}
	public void setAcesso(String acesso) {
		this.acesso = acesso;
	}
// este string retornoAcesso representa minha logica ou acao da classe
	
	public String retornoAcesso() {
		this.acesso="";
		return this.acesso="";
		}
	//retorna este dado para alguem
	public void gerarContagem() {
		
		
	}
}
