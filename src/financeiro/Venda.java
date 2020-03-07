package financeiro;

import java.util.List;
import comercial.Produto;

public class Venda {

	private List<Produto> produtos;
	private Conta conta;

	public List<Produto> getProdutos() {
		return produtos;
	}
	
	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
	
	public Conta getConta() {
		return conta;
	}
	
	public void setConta(Conta conta) {
		this.conta = conta;
	}	
}
