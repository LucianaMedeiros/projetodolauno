package model;
//dontpad.com/radio222
public class Produto {
	
	//Classes Relacionadas
	private Integer id;
	private  String nome;
	private Double preco;
	//na principal sempre totall  na classe Mais importante 01
	//bi
	private ItemProduto itemProduto;
	
	//Total fica no 1(na principal)
	private Double total = 0.;
	
	//quando eu chamar de uma outra class
	//objeto.metodo
	public void gerarTotal() {
		this.total = this.getPreco()*itemProduto.getQuantidade();
	}
	
	
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
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	public Double getTotal() {
		return total;
	}
	public void setTotal(Double total) {
		this.total = total;
	}
	public ItemProduto getItemProduto() {
		return itemProduto;
	}
	public void setItemProduto(ItemProduto itemProduto) {
		this.itemProduto = itemProduto;
	}
	public static void main(String[] args) {
		Produto p = new Produto();
		p.setId(10);
		p.setNome("havaianas de pau");
		p.setPreco(80.);
		
		//formato1(Externo)
		ItemProduto item = new ItemProduto();
		item.setDescricao("Sandalias Nacional e Mundial");
		item.setQuantidade(5);
		//as Objetos estao relacionados...
		//soltos
		//ter Objeto.setOutroObjeto
		p.setItemProduto(item);//agora produto tem relação com Produto
		
		p.gerarTotal();
		System.out.println(p.getNome()+","+
		p.getTotal()+","+
		p.getItemProduto().getDescricao());
		//---------------
		//Solucao mais INtegra
		Produto p2 = new Produto();
		p2.setId(1);
		p2.setNome("xanxung");
		p2.setPreco(300.);
		//objeto foi alimentado internamente
		//p2
		p2.setItemProduto(new ItemProduto());
		//descrição,quantidade
		p2.getItemProduto().setDescricao("Celular Roubado");
		p2.getItemProduto().setQuantidade(3);
		p2.gerarTotal();
		
		System.out.println(p2.getNome()+","+
		p2.getItemProduto().getDescricao()+","+
				p2.getTotal());
	}

	
}
	