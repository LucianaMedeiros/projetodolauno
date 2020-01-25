package model;


	public class Aluno {
	// classe é representação, dos dados,da lógica
	// (variaveis globais)dá acesso a classe toda
	// atributo
	// procedure e function x métodos(programas)
	// atributos(()%) são fechados),qualificador de acesso
	// pou modificador de acess
	// Modificador são 4
	// private(fechado,default,protected(pasta),public)

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
//herança(metodo igual ao da classe de cima).Estamos sobrescrevendo o metodo do usuario
//Sobrescrita só acontece em herança.
//Sobrescrita (prevalece o de baixo da herança)
//agora tenho mais acesso tecnica/polimorfismo

	@Override
	public String retornoAcesso() {
		setAcesso("total");
		return getAcesso();
	}

//calculo= logica
	public void gerarMedia() {
		this.media = (this.nota1 + this.nota2) / 2;
	}

//main+ctrl+espaço+enter
	public static void main(String[] args) {
		// Rodando pela herança
		Aluno a = new Aluno();
		a.setCodigo(10);
		a.setNome("soneca");
		a.setDisciplina("java");
		a.setNota1(5.);
		a.setNota2(6.);
		a.gerarMedia();
		// syso+ctrl+espaço+enter
		System.out.println(a.getNome() + "\n" + a.getDisciplina() + "\n" + a.getMedia());
		System.out.println("Acesso do Aluno: " + a.retornoAcesso());
		// Rodando pela SuperClasse
		System.out.println("SuperClasse");
		Usuario u = new Usuario();
		u.setNome("Luciana");
		u.setEmail("lu@gmail.com");
		System.out.println(u.getNome() + ",acesso:" + u.retornoAcesso());
		System.out.println("Sobrescreve...");
		// Superclasse SubClasse Sobrescrita
		// classe(superclasse)chama a SubClasse...
		
		Usuario x = new Aluno();
		x.setNome("luis");
		// o valor de baixo,do Aluno
		System.out.println(x.getNome() + ",acesso:" + x.retornoAcesso());
		
		Usuario a1 = new Usuario();// superclasse pode
		Aluno a2 = new Aluno();// pode heranca
		Usuario a3 = new Aluno();// subrescrita pode

		// Aluno a4 = new Usuario();//invençaõ (não pode)

	}

}