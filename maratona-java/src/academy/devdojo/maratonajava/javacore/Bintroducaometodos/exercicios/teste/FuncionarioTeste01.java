package academy.devdojo.maratonajava.javacore.Bintroducaometodos.exercicios.teste;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.exercicios.dominio.Funcionario;

public class FuncionarioTeste01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.setNome("Sukuna");
        funcionario.setIdade(89);
        funcionario.setSalarios(new double[]{1200, 843.33, 2028});

        funcionario.imprime();

    }
}
