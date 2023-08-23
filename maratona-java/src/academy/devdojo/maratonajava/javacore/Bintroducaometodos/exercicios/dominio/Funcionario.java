package academy.devdojo.maratonajava.javacore.Bintroducaometodos.exercicios.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios;

    public void imprime(){
        System.out.println("---------");
        System.out.println(this.nome);
        System.out.println(this.idade);
        if (salarios != null) {
            for (double salario : salarios) {
                System.out.println(salario + " ");
            }
        }
        imprimeMediaSalarial();
    }

    public void imprimeMediaSalarial(){
        double media = 0;
        if (salarios != null) {
            for (double salario : salarios) {
                media += salario;
            }
            media /= salarios.length;
        }
        System.out.println("\nMedia salarial: " + media);
    }
}
