public class Main {
    public static void main(String[] args) {
        Paciente paciente = new Paciente("Juan López", "OSDE");
        Profesional profesional = new Profesional("Dra. Martínez", "Cardiología");
        CitaMedica cita = new CitaMedica("2025-10-01", "09:30", paciente, profesional);

        System.out.println(cita);
        System.out.println("Paciente: " + cita.getPaciente().getNombre());
        System.out.println("Profesional: " + cita.getProfesional().getNombre());
    }
}
