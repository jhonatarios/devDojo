package academy.devdojo.maratonajava.javacore.Bintroducaometodos.teste;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Pessoa;

public class PesoaTeste01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Sasuke");
        pessoa.setIdade(20);

//        System.out.println(pessoa.getNome());
//        System.out.println(pessoa.getIdade());

        pessoa.imprime();
    }
}
