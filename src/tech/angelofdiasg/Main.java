package tech.angelofdiasg;

import tech.angelofdiasg.composicoes.Endereco;
import tech.angelofdiasg.composicoes.Telefone;
import tech.angelofdiasg.estruturasdedados.ListaDeTelefonesNaoOrdenados;
import tech.angelofdiasg.pessoas.*;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Pessoa pes1 = new Pessoa();
        pes1.cadastrar();
        System.out.println(pes1);
    }
}
