package tech.angelofdiasg;

import tech.angelofdiasg.composicoes.Endereco;
import tech.angelofdiasg.composicoes.Telefone;
import tech.angelofdiasg.estruturasdedados.ListaDeTelefonesNaoOrdenados;
import tech.angelofdiasg.pessoas.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Cliente c1 = new Cliente();
        Cliente c2 = new Cliente();
        Telefone tel1 = new Telefone();
        tel1.setDdd("081");
        tel1.setNumTelefone("988081008");
        Telefone tel2 = new Telefone();
        tel2.setDdd("083");
        tel2.setNumTelefone("88081008");
        ListaDeTelefonesNaoOrdenados listaTel1 = new ListaDeTelefonesNaoOrdenados();
        listaTel1.addTelefone(tel1);
        listaTel1.addTelefone(tel2);

        Endereco end1 = new Endereco("Rua end1",
                "Num end1","Cep end1",
                "Cid end1","estado end1",
                "pais end1");
        c1.setCodigo("1");
        c1.setNome("Meu nome");
        c1.setDataNascimento(LocalDate.of(1990,1,2));
        c1.setEndereco(end1);

        c1.setTelsContato(listaTel1);
        c1.getTelsContato().exibirTelefones();

        c1.getTelsContato().removerTelefone(tel1);
        System.out.println("Após remover o 1o ");
        c1.getTelsContato().exibirTelefones();
        c1.getTelsContato().addTelefone(tel1);
        c1.getTelsContato().addTelefone(tel1);
        c1.getTelsContato().addTelefone(tel1);
        c1.getTelsContato().addTelefone(tel1);
        c1.getTelsContato().addTelefone(tel1);
        c1.getTelsContato().addTelefone(tel1);
        System.out.println("Após adicionar vários ");
        c1.getTelsContato().exibirTelefones();
        c1.getTelsContato().addTelefone(tel1);
        System.out.println("Após adicionar mais que o possível: ");
        c1.getTelsContato().exibirTelefones();
//        System.out.println("Nome do cliente: " + c1.getNome());
//        System.out.println("Rua do cliente: " + c1.getEndereco().getRua());
//        c1.getEndereco().setRua("O cara mudou de rua.");
//        System.out.println("Rua do cliente: " + c1.getEndereco().getRua());


//        c1.getEndereco();

//            c1.getEndereco().

    }
}
