package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionaisExercicio01 {
    public static void main(String[] args) {
        double salarioAnual = 25000;
        double valorTaxa;
        if(salarioAnual <= 34712){
            valorTaxa = salarioAnual * 0.097;
            System.out.println("Sua taxa é de 9.70%, pagando uma taxa de " + valorTaxa);
        }else if(salarioAnual >= 34713 && salarioAnual <= 68507){
            valorTaxa = salarioAnual * 0.3735;
            System.out.println("Sua taxa é de 37.35%, pagando uma taxa de " + valorTaxa);
        }else{
            valorTaxa = salarioAnual * 0.505;
            System.out.println("Sua taxa é de 49.50%, pagando uma taxa de " + valorTaxa);
        }
    }
}
