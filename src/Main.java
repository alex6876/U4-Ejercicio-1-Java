import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Cancion cancion = new Cancion(
                "Bohemian Rhapsody",
                "Queen",
                5.55
        );

        Video video = new Video(
                "Tutorial de c++",
                "1080p",
                12.25
        );

        Podcats pod = new Podcats(
                "Charlas de tecnologia",
                "Carlos",
                7
        );

        ArrayList<Reproducible> lista = new ArrayList<>();

        lista.add(cancion);
        lista.add(video);
        lista.add(pod);

        Reproductor reproductor = new Reproductor();

        for (Reproducible item : lista) {
            reproductor.iniciarReproductor(item);
        }
    }
}