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
        patron = "^[a-zA-ZñÑ ]+( [a-zA-ZñÑ ]+)*$";
        do {
            System.out.print(mensaje);
            palabra = tec.Tec().next();
            if (!(palabra.matches(patron))) {
                System.out.println("No se permiten el ingreso de caracteres especiales ");
            }
        } while (!(palabra.matches(patron)));
        return palabra;
    }

    public Date obtenerFechaNacimiento() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        dateFormat.setLenient(false);
        String inputDate;
        Date fecha = null;
        // Bucle hasta que se ingrese una fecha válida
        while (fecha == null) {
            System.out.print("Ingrese su fecha de nacimiento (formato dd/MM/yyyy): ");
            inputDate = tec.Tec().nextLine();

            try {
                fecha = dateFormat.parse(inputDate);
                // Verificar si la fecha ingresada es mayor que la fecha actual
                if (fecha.after(new Date())) {
                    System.out.println("La fecha de nacimiento no puede estar en el futuro.");
                    fecha = null; // Reiniciar para volver a solicitar la fecha
                }
            } catch (ParseException e) {
                System.out.println("Fecha de nacimiento no válida. Intente nuevamente.");
            }
        }

        return fecha;
    }

    public String controlFechaNacmto() {
        Date fechaNacimiento = obtenerFechaNacimiento();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return dateFormat.format(fechaNacimiento);
    }

    public int Edad(String fechaNac) {
        // Dividir la fecha formateada en día, mes y año
        String[] partesFecha = fechaNac.split("/");
        int diaNac = Integer.parseInt(partesFecha[0]);
        int mesNac = Integer.parseInt(partesFecha[1]);
        int anioNac = Integer.parseInt(partesFecha[2]);
        Date fecha = new Date();
        int dia, mes, anio, anioCal;
        dia = fecha.getDate();
        mes = fecha.getMonth() + 1;
        anio = fecha.getYear() + 1900;
        anioCal = anio - anioNac;
        if (mes <= mesNac) {
            if (mes == mesNac) {
                if (diaNac > dia) {
                    anioCal++;
                }
            }
        }
        return anioCal;
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

    public void Espacios() {
        for (int i = 1; i <= 2; i++) {
            System.out.println(" ");
        }
    }

    public int AñosExperiencia(String fechaNacmiento, String mensaje) {
        boolean aux = true;
        int numAñosExpe =0,edadProfesor;
        do {
            numAñosExpe=ControlNumrs(mensaje);
            edadProfesor = Edad(fechaNacmiento);
            if (numAñosExpe > (edadProfesor - 18)) {
                System.out.println("Ingrese sus años de experiencia verdaderos");
                aux = false;
            } else {
                      aux = true;
            }
        } while ((aux == false));
        return numAñosExpe;
    }
     
}
