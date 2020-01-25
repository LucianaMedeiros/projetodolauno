package model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//validacao
public class Pessoa {
	private String nome;
	private Integer idade;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
		
	}
	//validarNome
	//metodo de validacao Booleano
	//padrao OO Booleano is
	//letras e espaço em branco
	//ctrl+shift+o
	public Boolean isName() {
		//o que aceita(Expressao regular)
		Pattern regra = Pattern.compile("[A-Z a-z]{2,50}");
		Matcher m = regra.matcher(this.nome);
		return m.matches();//true ou false
	}
	public Boolean isIdade() {
		if(this.idade < 0||this.idade > 100) {
			return false;
		}
		return true;
	}
	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		p.setNome("a");
		p.setIdade(1);
		
		System.out.println("idade valida:"+p.isIdade());
		System.out.println("nome valido:"+p.isName());
		
		Character c =Character.valueOf('9');
		System.out.println(c.isAlphabetic(c));
	}

	}
	

