package financeiro;

import comercial.Produto;
import java.time.LocalDate;
import java.util.*;

public class Pedido {
	
	private List<Produto> produtos;
	private Integer quantidade;
	private Conta conta;
	private LocalDate dataPedido;
	private LocalDate dataChegada;

	public List<Produto> getProdutos() {
		return produtos;
	}
	
	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
	
	public Integer getQuantidade() {
		return quantidade;
	}
	
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	
	public LocalDate getDataPedido() {
		return dataPedido;
	}
	
	public void setDataPedido(LocalDate dataPedido) {
		this.dataPedido = dataPedido;
	}
	
	public LocalDate getDataChegada() {
		return dataChegada;
	}
	
	public void setDataChegada(LocalDate dataChegada) {
		this.dataChegada = dataChegada;
	}
	
	public Conta getConta() {
		return conta;
	}
	
	public void setConta(Conta conta) {
		this.conta = conta;
	}
}

