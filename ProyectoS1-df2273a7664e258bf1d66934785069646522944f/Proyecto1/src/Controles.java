import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;

public class Controles {
    public Teclado tec = new Teclado();
    public GestorCentroEductvo gestor = new GestorCentroEductvo();
    public String Palabras(String opcion) {
        String patron, palabra;
        patron = "^[a-zA-Z\\s]+$";
        do {
            System.out.print(opcion);
            palabra = tec.Tec().next();
            if (!(palabra.matches(patron))) {
                System.out.println("Ingreso solo letras.");
            }
        } while (!(palabra.matches(patron)));
        return palabra;
    }

    public String controlarCaracteresEspeciales(String mensaje) {
        String patron, palabra;
        patron = "^[a-zA-ZñÑ ]+$";
        do {
            System.out.println(mensaje);
            palabra = tec.Tec().next();
            if (!(palabra.matches(patron))) {
                System.out.println("No se permiten el ingreso de caracteres especiales ");
            }
        } while (!(palabra.matches(patron)));
        return palabra;
    }

   

    public String controlFechaNacmto() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        dateFormat.setLenient(false);

        String inputDate;
        Date date = null;

        // Bucle hasta que se ingrese una fecha válida
        while (date == null) {
            System.out.print("Ingrese su fecha de nacimiento (formato dd/MM/yyyy): ");
            inputDate = tec.Tec().nextLine();

            try {
                date = dateFormat.parse(inputDate);
                // Verificar si la fecha ingresada es mayor que la fecha actual
                if (date.after(new Date())) {
                    System.out.println("La fecha de nacimiento no puede estar en el futuro.");
                    date = null; // Reiniciar para volver a solicitar la fecha
                }
            } catch (ParseException e) {
                System.out.println("Fecha de nacimiento no válida. Intente nuevamente.");
            }
        }

        return dateFormat.format(date);
    }

    public int ControlNumrs(String mensaje) {
        String patron, num;
        patron = "^[0-9]+$";
        do {
            System.out.print(mensaje);
            num = tec.Tec().next();
            if (!num.matches(patron)) {
            }
        } while (!num.matches(patron));
        return Integer.parseInt(num);
    }
}
