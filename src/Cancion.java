public class Cancion extends Reproducible{

    private String titulo;
    private String artista;
    private double duracion;

    public Cancion(String titulo, String artista, double duracion) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracion = duracion;
    }



    @Override

    public void reproducir() {
        System.out.println("Reproduciendo la cancion");
        System.out.println("Titulo: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Duracion: " + duracion + "minutos");
    }
}
