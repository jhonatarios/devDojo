package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais06Exercicio {
    public static void main(String[] args) {
        byte dia = 8;
        switch (dia){
            default:
                System.out.println("Não consigo identificar para você se é util ou não :c");
                break;
            case 1:
                System.out.println("Hoje é Domingo, não é dia util!");
                break;
            case 2:
                System.out.println("Hoje é Segunda, é dia util!");
                break;
            case 3:
                System.out.println("Hoje é Terça-feira, é dia util!");
                break;
            case 4:
                System.out.println("Hoje é Quarta-feira, é dia util!");
                break;
            case 5:
                System.out.println("Hoje é Quinta-feira, é dia util!");
                break;
            case 6:
                System.out.println("Hoje é Sexta-feira, é dia util!");
                break;
            case 7:
                System.out.println("Hoje é Sábado, não é dia util!");
                break;
        }
    }
}
