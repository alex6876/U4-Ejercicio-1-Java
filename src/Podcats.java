public class Podcats extends Reproducible{
    private String nombre;
    private String presentador;
    private int nroEpisodios;


    public Podcats(String nombre, String presentador, int nroEpisodios) {
        this.nombre = nombre;
        this.presentador = presentador;
        this.nroEpisodios = nroEpisodios;
    }


    @Override
    public void reproducir() {
        System.out.println("Reproduciendo");
        System.out.println("Titulo: " + nombre);
        System.out.println("Presentador: " + presentador);
        System.out.println("NroEpisodios: " + nroEpisodios);

    }
}
