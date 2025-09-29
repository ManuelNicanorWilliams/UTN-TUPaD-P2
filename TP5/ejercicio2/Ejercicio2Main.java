public class Main {
    public static void main(String[] args) {
        Bateria bateria = new Bateria("BT-5000", 5000);
        Usuario usuario = new Usuario("María López", "87654321");
        Celular celular = new Celular("IMEI123456", "Samsung", "Galaxy S21", bateria, usuario);

        System.out.println(celular);
        System.out.println("Celular vinculado al usuario: " + usuario.getCelular().getMarca());
    }
}
