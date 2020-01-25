package model;
//dontpad.com/radio222/1
public class ItemProduto {
	
	private String descricao;
	private Integer quantidade;
	//Ter ...
	private Produto produto; 

	//(atributo) (chama classe)
	//ItemProduto visualiza Produto ...
	//hoje bidirecional
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	

}
