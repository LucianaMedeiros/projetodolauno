package model;


	public class Aluno {

	private Integer idAluno;
	private String nome;
	private String disciplina;
	private Double nota1;
	private Double nota2;
	private Double media;
	private String situacao;

	public void setNota1(Double nota1) {
		this.nota1 = nota1;
	}

	public Double getNota2() {
		return nota2;
	}
	//quantidade
	public void setNota2(Double nota2) {
		this.nota2 = nota2;
	}

	public Double getMedia() {
		return media;
	}

	public void setMedia(Double media) {
		this.media = media;
	}
	
	public Integer getIdAluno() {
		return idAluno;
	}

	public void setIdAluno(Integer idAluno) {
		this.idAluno = idAluno;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public Double getNota1() {
		return nota1;
	}

	public void gerarMedia() {
		this.media = (this.nota1 + this.nota2) / 2;
	}

	public static void main(String[] args) {
		Aluno a = new Aluno();
		a.setIdAluno(10);
		a.setNome("soneca");
		a.setDisciplina("java");
		a.setNota1(5.);
		a.setNota2(6.);
		a.gerarMedia();
		System.out.println(a.getNome() + "\n" + a.getDisciplina() + "\n" + a.getMedia());
		System.out.println("SuperClasse");
		Usuario u = new Usuario();
		u.setNome("Luciana");
		u.setEmail("lu@gmail.com");
		System.out.println(u.getNome() + ",acesso:" + u.retornoAcesso());
		System.out.println("Sobrescreve...");
		
		Aluno x = new Aluno();
		x.setNome("luis");
		
	}

}