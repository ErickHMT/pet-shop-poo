package financeiro;

import java.time.LocalDateTime;

public class Conta {

	private String valor;
	private LocalDateTime data;

	public String getValor() {
		return valor;
	}
	
	public void setValor(String valor) {
		this.valor = valor;
	}
	
	public LocalDateTime getData() {
		return data;
	}
	
	public void setData(LocalDateTime data) {
		this.data = data;
	}	
}
