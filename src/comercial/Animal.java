package comercial;

import clinica.Cliente;
import clinica.Porte;

public class Animal {

	private Cliente dono;
	private String nome;
	private String raca;
	private Integer idade;
	private Double peso;
	private Porte porte;

	public Cliente getDono() {
		return dono;
	}
	public void setDono(Cliente dono) {
		this.dono = dono;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	public Double getPeso() {
		return peso;
	}
	public void setPeso(Double peso) {
		this.peso = peso;
	}
	public Porte getPorte() {
		return porte;
	}
	public void setPorte(Porte porte) {
		this.porte = porte;
	}
}
