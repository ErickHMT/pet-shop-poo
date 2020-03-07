package clinica;

import java.time.LocalDate;

import comercial.Animal;

public class Procedimento {

	private Animal animal;
	private String tipoProcedimento;
	private LocalDate dataEntrada;
	private LocalDate dataSaida;
	private Cliente cliente;

	public Animal getAnimal() {
		return animal;
	}
	public void setAnimal(Animal animal) {
		this.animal = animal;
	}
	public String getTipoProcedimento() {
		return tipoProcedimento;
	}
	public void setTipoProcedimento(String tipoProcedimento) {
		this.tipoProcedimento = tipoProcedimento;
	}
	public LocalDate getDataEntrada() {
		return dataEntrada;
	}
	public void setDataEntrada(LocalDate dataEntrada) {
		this.dataEntrada = dataEntrada;
	}
	public LocalDate getDataSaida() {
		return dataSaida;
	}
	public void setDataSaida(LocalDate dataSaida) {
		this.dataSaida = dataSaida;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
}
