package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao04 {
    // Dado um valor de um carro, descubra em quantas vezes ele pode ser parcelado
    // Condição, valorParcela >= 1000
    public static void main(String[] args) {
        int valorCarro = 60000;

        for (int parcela = 1; parcela <= valorCarro; parcela++) {
            double valorParcela = valorCarro / parcela;
            if (valorParcela < 1000) {
                break;
            }
            System.out.println("Parcela " + parcela + " R$ " + valorParcela);
        }
    }
}

