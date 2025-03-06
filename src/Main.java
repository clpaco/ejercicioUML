//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Universidad universidad = new Universidad("Dr. Pérez", 12345, "Computación",
                "Programación en Java", 101, 5,
                "Juan López", 67890, "juan@example.com");

        universidad.impartirCurso();
        universidad.inscribirEstudiante();
    }
}