package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.teste;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.nome = "Honda Civic";
        carro.modelo = "LXL";
        carro.ano = 2017;

        Carro carro02 = new Carro();
        carro02.nome = "GM Opala";
        carro02.modelo = "Comodoro";
        carro02.ano = 1980;

//        carro = carro02;

        System.out.println(carro.nome + " " + carro.modelo + " " + carro.ano);
        System.out.println(carro02.nome + " " + carro02.modelo + " " + carro02.ano);
    }
}
