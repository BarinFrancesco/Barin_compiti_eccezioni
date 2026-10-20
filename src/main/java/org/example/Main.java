import org.example.ContoBancario;
import org.example.ImportoNonValidoException;


public class Main {
    public static void main(String[] args) {
        Reclutatore reclutatore = new Reclutatore();
        int difficolta = 75;

        System.out.println("Inizio reclutamento per missione difficolta' " + difficolta + "\n");

        for (int i = 1; i <= 5; i++) {
            System.out.println("Tentativo " + i + ":");
            try {
                reclutatore.reclutaCandidato(difficolta);
            } catch (EroeNonIdoneoException e) {
                System.out.println("Scartato: " + e.getNomeEroe() + " (potere: " + e.getLivelloPotere() + ") e' troppo debole.");
            }
            System.out.println("-----------------------------------");
        }
    }
}