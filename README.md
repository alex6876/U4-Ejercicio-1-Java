Aquí tienes la estructura en formato Markdown lista para el `README.md` de este código de **Simulación de Reproductor Multimedia Multiformato (Clases Abstractas, Herencia y Polimorfismo en Java)**, manteniendo el enfoque exclusivo de **Programación Orientada a Objetos en memoria** (sin bases de datos):

---

# 🎵 Simulación de Reproductor Multimedia Multiformato (Clases Abstractas y Polimorfismo en Java)

Este proyecto es una aplicación en Java que modela un sistema de reproducción de contenido multimedia, implementando una arquitectura basada en clases abstractas y herencia para administrar distintos tipos de elementos reproducibles (canciones musicales, videos de alta definición y episodios de podcasts) a través de un componente centralizador de reproducción. Pone en práctica conceptos fundamentales de la **Programación Orientada a Objetos (POO)** como el uso de colecciones dinámicas (`ArrayList<Reproducible>`), la implementación obligatoria de contratos en clases abstractas (`abstract`), la sobrescritura polimórfica de comportamiento (`@Override`) y la inyección de dependencias mediante interfaces polimórficas en memoria.

---

## 🧩 Clases y Estructura del Sistema

El diseño del software se organiza a través de una clase base abstracta, sus respectivas subclases especializadas, un controlador de reproducción y un punto de ejecución:

* **`Reproducible` (Clase Abstracta)**: Define el contrato genérico para cualquier elemento multimedia capaz de ser reproducido por el sistema.
* **Método abstracto**: `abstract void reproducir()`: Obliga de forma contractual a todas las subclases a implementar su propia lógica de ejecución visual o sonora.


* **`Reproductor`**: Clase controladora encargada de gestionar la interfaz de reproducción de los elementos multimedia.
* **Método operativo**: `iniciarReproductor(Reproducible item)`: Recibe cualquier objeto que extienda de `Reproducible`, imprime líneas decorativas de separación e invoca de manera polimórfica el método `reproducir()` del elemento correspondiente.


* **`Cancion`**: Extiende de `Reproducible` para modelar pistas musicales de audio.
* **Atributos privados (`private`)**: `titulo`, `artista` y `duracion`.
* **Constructor**: Inicializa los metadatos de la canción.
* **Sobrescritura (`@Override`)**:
* `reproducir()`: Despliega por consola la cabecera correspondiente y detalla el título, artista y duración en minutos de la pista musical.




* **`Video`**: Extiende de `Reproducible` para modelar archivos audiovisuales con especificaciones de resolución.
* **Atributos privados (`private`)**: `titulo`, `calidad` y `duracion`.
* **Constructor**: Inicializa los parámetros de título, calidad de imagen y tiempo.
* **Sobrescritura (`@Override`)**:
* `reproducir()`: Imprime el reporte de reproducción detallando el título, la calidad (por ejemplo, 1080p) y la duración del video.




* **`Podcats`**: Extiende de `Podcasts` (registrado como `Podcats`) para modelar programas de audio episódicos.
* **Atributos privados (`private`)**: `nombre`, `presentador` y `nroEpisodios`.
* **Constructor**: Configura los datos identificatorios del podcast y su cantidad de episodios.
* **Sobrescritura (`@Override`)**:
* `reproducir()`: Muestra por consola los datos del podcast incluyendo el título, el presentador a cargo y el número de episodios disponibles.




* **`Main`**: Punto de entrada del programa. Instancia una canción, un video y un podcast, los agrupa en una lista dinámica polimórfica (`ArrayList<Reproducible>`), instancia un objeto `Reproductor` y recorre la colección invocando al método de control para simular la reproducción secuencial de todos los elementos multimedia.

---

## ⚙️ Reglas de Negocio y Control de Validación

1. **Contrato Estricto de Reproducción:** Mediante la clase abstracta `Reproducible`, se garantiza que cualquier nuevo formato multimedia que se añada al sistema (como audiolibros o transmisiones en directo) implemente obligatoriamente el método `reproducir()`.
2. **Inyección y Desacoplamiento Polimórfico:** La clase `Reproductor` desconoce las clases hijas específicas (`Cancion`, `Video`, `Podcats`); opera exclusivamente con el tipo base `Reproducible`, logrando un diseño altamente desacoplado y flexible.
3. **Gestión Dinámica de Colecciones:** El uso de `ArrayList<Reproducible>` permite almacenar y procesar elementos heterogéneos de manera uniforme dentro de un bucle de control.

---

## 💻 Salida por Consola

Al ejecutar la clase `Main`, el programa genera el siguiente resultado:

```text
-----------------------
Reproduciendo la cancion
Titulo: Bohemian Rhapsody
Artista: Queen
Duracion: 5.55minutos
-----------------------
-----------------------
Reproduciendo Video
Titulo: Tutorial de c++
Calidad: 1080p
Duracion: 12.25minutos
-----------------------
-----------------------
Reproduciendo
Titulo: Charlas de tecnologia
Presentador: Carlos
NroEpisodios: 7
-----------------------

```

---

## 🚀 Conceptos de Programación Aplicados

* **Abstracción y Polimorfismo Multimedia:** Modelado de contenidos digitales heterogéneos mediante una arquitectura basada en superclases abstractas y ligadura dinámica.
* **Separación de Responsabilidades:** Clara distinción entre los datos del dominio multimedia (`Cancion`, `Video`, `Podcats`), el controlador de hardware/reproducción (`Reproductor`) y la ejecución cliente (`Main`).
* **Diseño Abierto/Cerrado (OCP):** Facilidad para extender el sistema con nuevos tipos de contenido multimedia sin necesidad de modificar el código existente del reproductor.
