package model;

public class Funcionario {
	//Casting=conversão
	private Integer id;
	private String nome;
	private String funcao;
	private Double salario;
	//objeto é tudo(nesse caso - - Funcionario)
	//[] vetor(quantidade determinada)
	private Object[] equipe= {};//quando coloco chaves eu já inicializei meu vetor
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getFuncao() {
		return funcao;
	}
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	public Object[] getEquipe() {
		return equipe;
	}
	//alterar=tiro colchetes e insiro varargs...
	public void setEquipe(Object... equipe) {
		this.equipe = equipe;
	}
	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		f1.setId(1);
		f1.setNome("lu");
		f1.setFuncao("professora");
		f1.setSalario(5000.);
		Funcionario f2= new Funcionario();
		f2.setId(2);
		f2.setNome("alexandre");
		f2.setFuncao("aspira");
		f2.setSalario(1000.);
		Funcionario f3= new Funcionario();
		f3.setId(3);
		f3.setNome("sala204");
		f3.setFuncao("professor");
		f3.setSalario(1000.);
		f3.setEquipe(f1,f2,f3);
		//imprime a equipe
		for(Object o:f3.getEquipe()) {
			System.out.println("Dados:"+
		((Funcionario)o).getNome()+","+
		((Funcionario)o).getFuncao()+","+
		((Funcionario)o).getEquipe()+","+
		((Funcionario)o).getSalario());
		}
	}
	

}
