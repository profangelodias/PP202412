package tech.angelofdiasg.apps;

import tech.angelofdiasg.contas.*;

public class Main {

	public static void main(String[] args) {
//		Conta conta1 = new Conta(1, 1);
		ContaEspecial contaesp1 = new ContaEspecial(02, 02, 02);
		ContaInvestimento contaInv1 = new ContaInvestimento(03, 03, 03, 03);
		
//		conta1.numero = 1;
//		conta1.saldo = 10000;
//		conta1.depositar(10000);
//		conta2.numero = 2;
//		conta2.saldo = 20000;
//		
//		contaesp1.numero = 01;
//		contaesp1.saldo = 12000;
//		contaInv1.numero = 02;
//		contaInv1.saldo = 13000;
		
		System.out.println("Número da conta 1: " + conta1.getNumero());
		System.out.println("Número da saldo 1: " + conta1.getSaldo());
		

	}

}
