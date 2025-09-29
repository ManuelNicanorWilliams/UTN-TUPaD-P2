public class Main {
    public static void main(String[] args) {
        Proyecto proyecto = new Proyecto("VideoTutorial", 15);
        EditorVideo editor = new EditorVideo();

        editor.exportar("MP4", proyecto); // crea Render dentro del método
    }
}
