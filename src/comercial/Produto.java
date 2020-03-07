package comercial;

import java.time.LocalDate;

public class Produto {
	
	private String nome;
	private String tipo;
	private String marca;
	private Double valor;
	private LocalDate validade;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public Double getValor() {
		return valor;
	}
	
	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	public LocalDate getValidade() {
		return validade;
	}
	
	public void setValidade(LocalDate validade) {
		this.validade = validade;
	}	
}
