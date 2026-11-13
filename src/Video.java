public class Video extends Reproducible{
    private String titulo;
    private String calidad;
    private double duracion;

    public Video(String titulo, String calidad, double duracion){
        this.titulo = titulo;
        this.calidad = calidad;
        this.duracion = duracion;
    }

    @Override
    public void reproducir() {
        System.out.println("Reproduciendo Video");
        System.out.println("Titulo: " + titulo);
        System.out.println("Calidad: " + calidad);
        System.out.println("Duracion: " + duracion + "minutos");
    }
}
