package src.main;
import java.util.ArrayList;
import java.util.List;

// Clase para manejar las citas médicas
public class CitasMedicas {
    private List<String> calendario; // Calendario de citas

    public CitasMedicas() {
        calendario = new ArrayList<>();
    }

    // TODO: Método para agendar una cita
    public void agendarCita(String fechaHora) {
        calendario.add(fechaHora);
    }

    // TODO: Método para cancelar una cita
    public void cancelarCita(String fechaHora) {
       for (int i = 0; i < calendario.size(); i++) {
            if(calendario.get(i).equals(fechaHora)){
                calendario.remove(i);
            }
       }
    }

    // TODO: Método para reprogramar una cita
    public void reprogramarCita(String fechaHoraAntigua, String fechaHoraNueva) {
        for (int i = 0; i < calendario.size(); i++) {
            if(calendario.get(i).equals(fechaHoraAntigua)){
                calendario.remove(i);
                calendario.add(i, fechaHoraNueva);
            }
       }
    }

    // TODO: Método para ver el calendario de citas
    public void verCalendario() {
        for (int i = 0; i < calendario.size(); i++) {
            System.out.println(i + ") " + "Cita del " + calendario.get(i));
        }
    }
}
