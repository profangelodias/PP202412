package tech.angelofdiasg.contas;

public class ContaInvestimento extends Conta{
	double taxa;
	int prazo;
	
	boolean sacar(double valor) {
		if(this.saldo >= valor) {
			this.saldo = this.saldo - (valor * this.taxa);
			return true;
		} else {
			return false;
		}
	}
	
	boolean depositar(double valor) {
		if(valor >= 0) {
			this.saldo = this.saldo + (valor * this.taxa);
			return true;
		} else {
			return false;
		}
	}
	
	void aplicarRendimento(double taxa) {
		this.saldo = this.saldo + (1 * taxa);
	}

}
