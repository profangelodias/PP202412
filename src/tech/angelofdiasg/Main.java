package tech.angelofdiasg;

import tech.angelofdiasg.composicoes.Endereco;
import tech.angelofdiasg.composicoes.Telefone;
import tech.angelofdiasg.estruturasdedados.ListaDeTelefonesNaoOrdenados;
import tech.angelofdiasg.pessoas.*;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Cliente cli1 = new Cliente();
//        Endereco end1 = new Endereco();
        Dependente dep1 = new Dependente();
        dep1.setClienteParente(cli1);
//        cli1.setEndereco(end1);
        Scanner input = new Scanner(System.in);


    }
}
