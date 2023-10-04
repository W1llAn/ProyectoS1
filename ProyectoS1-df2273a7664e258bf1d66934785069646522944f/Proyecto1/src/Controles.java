import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
public class Controles {
    public Teclado tec = new Teclado();

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
    public String controlarCaracteresEspeciales(String mensaje){
        String patron,palabra;
        patron = "^[a-zA-ZñÑ ]+$";
        do{
            System.out.println(mensaje);
            palabra = tec.Tec().next();
            if(!(palabra.matches(patron))){
                System.out.println("No se permiten el ingreso de caracteres especiales ");
            }
        }while (!(palabra.matches(patron)));
    return palabra;
    }

    public String ControlCedula() {
        GestorCentroEductvo gEductvo = new GestorCentroEductvo();
        String cedula, patron;
        patron = "^[0-9]{10}$";
        boolean aux = false;

        do {
         do {
    System.out.print("Cédula: ");
     cedula = tec.Tec().next();
} while (gEductvo.cedulaRepetida(cedula));
            if (cedula.matches(patron)) {
                int primerosdos = Integer.parseInt(cedula.substring(0, 2));

                if (primerosdos >= 1 && primerosdos <= 24) {
                    String nueveprimeros = cedula.substring(0, 9);
                    String digitosImpares = "";
                    String digitosPares = "";

                    for (int i = 0; i < nueveprimeros.length(); i++) {
                        char digito = nueveprimeros.charAt(i);
                        if (i % 2 == 0) {
                            digitosImpares += digito;
                        } else {
                            digitosPares += digito;
                        }
                    }

                    int sumaImpares = 0;
                    for (int i = 0; i < digitosImpares.length(); i++) {
                        int digitoImpar = Character.getNumericValue(digitosImpares.charAt(i));
                        int resultado = digitoImpar * 2;
                        if (resultado > 9) {
                            resultado -= 9;
                        }
                        sumaImpares += resultado;
                    }

                    int sumaPares = 0;
                    for (int i = 0; i < digitosPares.length(); i++) {
                        int digitoPar = Character.getNumericValue(digitosPares.charAt(i));
                        sumaPares += digitoPar;
                    }

                    int sumaTotal = sumaPares + sumaImpares;
                    int ultimoDigito = sumaTotal % 10;
                    int numeroFinal = 10 - ultimoDigito;
                    String ultimoDigitoCedula = cedula.substring(9);

                    if (numeroFinal == Integer.parseInt(ultimoDigitoCedula)) {
                        aux = true;
                    } else {
                        System.out.println("Cédula incorrecta");
                    }
                } else {
                    System.out.println("Cédula incorrecta");
                }
            } else {
                System.out.println("Cédula incorrecta (Contiene 10 números)");
            }
        } while (!aux);

        return cedula;
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
