package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean
        int idade = (int) 2300000000L;
        long numeroGrande = 100000;
        double salarioDouble = 2000.0;
        float salarioFloat = 2500;
        byte idadeByte = 23;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = '\u0041';
        String texto = "Um grande textão bolado!";
        String nome = "Goku";

        System.out.println("A idade é " + idade + " anos.");
        System.out.println(falso);
        System.out.println(caractere);
        System.out.println(idade);
        System.out.println(texto);
        System.out.println("Oi, meu nome é " + nome);
    }
}
