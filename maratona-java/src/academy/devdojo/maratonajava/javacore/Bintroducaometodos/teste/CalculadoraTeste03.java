package academy.devdojo.maratonajava.javacore.Bintroducaometodos.teste;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTeste03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.divideDoisNumeros(23,0);
        System.out.println(result);

        double resul2 = calculadora.divideDoisNumeros02(5, 2);
        System.out.println(resul2);

        calculadora.imprimeDivisaoDeDoisNumeros(2,0);

    }
}
