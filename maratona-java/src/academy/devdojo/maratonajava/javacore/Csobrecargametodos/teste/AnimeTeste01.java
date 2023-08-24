package academy.devdojo.maratonajava.javacore.Csobrecargametodos.teste;

import academy.devdojo.maratonajava.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Bleach", "Shounen", 366, "Ação");
//        anime.setNome("Bleach");
//        anime.setTipo("Shonen");
//        anime.setEpisodios(366);
        anime.imprime();
    }
}
