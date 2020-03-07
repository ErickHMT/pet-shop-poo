package clinica;

import financeiro.Conta;

public class Cliente extends Pessoa {
	
	private Conta conta;

	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}
}
