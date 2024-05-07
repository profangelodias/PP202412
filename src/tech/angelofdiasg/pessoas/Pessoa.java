package tech.angelofdiasg.pessoas;

import tech.angelofdiasg.composicoes.Endereco;
import tech.angelofdiasg.composicoes.Telefone;
import tech.angelofdiasg.estruturasdedados.*;
import tech.angelofdiasg.interfaces.Cadastramento;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Pessoa implements Cadastramento {
    private String nome;
    private LocalDate dataNascimento;
    private Endereco endereco;
    private ListaDeTelefonesNaoOrdenados telsContato;
    public Pessoa(){
        System.out.println("Criando uma pessoa" +
                " sem atributos!");
    }
    public Pessoa(String nome, LocalDate dataNascimento,
                  Endereco endereco, ListaDeTelefonesNaoOrdenados telsContato) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.telsContato = telsContato;
    }

    public int obterIdade(){
        int idade = 0;
        LocalDate dataAtual = LocalDate.now();
        Period periodo = Period.between(
                this.dataNascimento, dataAtual);
        idade = periodo.getYears();
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public ListaDeTelefonesNaoOrdenados getTelsContato() {
        return telsContato;
    }

    public void setTelsContato(ListaDeTelefonesNaoOrdenados telsContato) {
        this.telsContato = telsContato;
    }


    @Override
    public void cadastrar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome da pessoa:");
        this.nome = scanner.nextLine();

        System.out.println("Digite a data de nascimento (AAAA-MM-DD):");
        String dataNascimentoStr = scanner.nextLine();
        this.dataNascimento = LocalDate.parse(dataNascimentoStr);

        System.out.println("Digite o endereço:");
        System.out.println("Rua:");
        String rua = scanner.nextLine();
        System.out.println("Informe o número:");
        String numero = scanner.nextLine();
        System.out.println("Informe o CEP:");
        String cep = scanner.nextLine();
        System.out.println("Informe a cidade:");
        String cidade = scanner.nextLine();
        System.out.println("Informe o estado:");
        String estado = scanner.nextLine();
        System.out.println("Informe o país:");
        String pais = scanner.nextLine();
        this.endereco = new Endereco(rua,numero,cep,cidade,estado,pais);

        System.out.println("Digite os números de telefone separados por vírgula com o DDD separado por (-):");
        String telefonesStr = scanner.nextLine();
        String[] telefones = telefonesStr.split(",");
        this.telsContato = new ListaDeTelefonesNaoOrdenados();
        for (String telefone : telefones) {
            Telefone tel = new Telefone();
            tel.setNumTelefone(telefone.trim());
            this.telsContato.addTelefone(tel);
        }
        System.out.println("Pessoa cadastrada com sucesso.");
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", dataNascimento=" + dataNascimento +
                ", endereco=" + endereco +
                ", telsContato=" + telsContato +
                '}';
    }
}
