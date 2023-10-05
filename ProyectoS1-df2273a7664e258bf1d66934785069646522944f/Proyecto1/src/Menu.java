/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class Menu {
    int op, fechNacmto, aniosExp, salario;
    String cedula, nom1, nom2, apelldo1, apelldo2, direccion;
    char opcSn;
    public Teclado tec = new Teclado();
    public GestorCentroEductvo gestor = new GestorCentroEductvo();
    public Controles contrls = new Controles();

    public void menu() {
        char opcSn;
        do {
            Opciones();
            System.out.print("Opción:");
            op = tec.Tec().nextInt();
            switch (op) {
                case 1:
                    do{
                    System.out.println("Bienvenido a la opción Ingreso de Estudiantes");
                    Estudiante estudiantes = new Estudiante();
                    
                    gestor.registrarEstudiantes(PedirDatosEstudiantes(estudiantes));
                    System.out.println("Desea registrar a un estudiante nuevo\n ¿S/N?: ");
                    opcSn = tec.Tec().next().toUpperCase().charAt(0);
                }while (opcSn == 'S');
                    break;
                case 2:
                do {
                    Profesor prof = new Profesor();
                    gestor.registrarProfesor( PedirDatosProfesores(prof));
                    System.out.print("Desea Registrar un profesor nuevo\n ¿S/N?:");
                    opcSn = tec.Tec().next().toUpperCase().charAt(0);
                } while (opcSn == 'S');
                    break;
                case 3:
                    System.out.println("Bienvenido a la opción 3");
                    break;
                case 4:
                    System.out.println("Bienvenido a la opción 4");
                    break;
                case 5:
                    System.out.println("||||||||||||||||||| R E P O R T E S ||||||||||||||||");
                    subMenu();
                    op = tec.Tec().nextInt();
                    switch (op) {
                        case 1:
                            System.out.println(" ___________________________________ ");
                            System.out.println("|--------P R O F E S O R E S -------|");
                            //gestor.imprimirProfesores();
                            gestor.ImprimirVectorProfesor();
                            System.out.println("|___________________________________|");

                            break;
                        case 2:
                            System.out.println("|-----------------------------------|");
                            System.out.println("|--------E S T U D I A N T E S -----|");
                            gestor.imprimirEstudiantes();
                            System.out.println("|___________________________________|");
                            break;
                    }

                    break;
                case 6:
                    System.out.println("-----------Estudiantes en un curso-----------");
                    gestor.ImprimirReporteInscritos();
                    break;
                case 7:
                    System.out.println("Buen día");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción Incorrecta");
            }
        } while (op != 7);
    }

    public void Opciones() {
        System.out.println("------U T A---------");
        System.out.println("1)Registro de estudiantes\n"
                + "2)Registro de profesores\n3)Crear cursos"
                + "\n4)Incripción de estudiantes en cursos"
                + "\n------REPORTES----\n5)Estudiantes y profesores "
                + "\n6)Estudiantes en un curso\n7)Salir");
    }

    public Profesor PedirDatosProfesores(Profesor profe) {
        System.out.println("---Registro de Profesores-----");
        profe.setCedula(ControlCedula());
        profe.setNombre1(contrls.Palabras("Primer Nombre: "));
        profe.setNombre2(contrls.Palabras("Segundo Nombre: "));
        profe.setApellido1(contrls.Palabras("Apellido Paterno: "));
        profe.setApellido2(contrls.Palabras("Apellido Materno: "));
        profe.setFechaNacmto(contrls.controlFechaNacmto());
        profe.setAñosExper(contrls.ControlNumrs("Años de experiencia: "));
        profe.setSalario(contrls.ControlNumrs("Salario: "));
        return profe;
    }

    public Estudiante PedirDatosEstudiantes(Estudiante estudiantes) {
        System.out.println("-----Registro de Estudiantes-----");
        estudiantes.setCedula(ControlCedula());
        estudiantes.setNombre1(contrls.Palabras("Primer Nombre: "));
        estudiantes.setNombre2(contrls.Palabras("Segundo Nombre: "));
        estudiantes.setApellido1(contrls.Palabras("Apellido Paterno: "));
        estudiantes.setApellido2(contrls.Palabras("Apellido Materno: "));
        estudiantes.setFechaNacmto(contrls.controlFechaNacmto());
        estudiantes.setDireccion(contrls.controlarCaracteresEspeciales("Direccion: "));
        return estudiantes;
    }

    public void subMenu() {
        System.out.println("\nOpciones de reportes:");
        System.out.println("1)Profesores\n2)Estudiantes");
        System.out.print("Opción:");
    }
    public String ControlCedula() {
        String cedula, patron;
        patron = "^[0-9]{10}$";
        boolean aux = false;

        do {
            System.out.print("Cédula:");
            cedula = tec.Tec().next();

            if (cedula.matches(patron)) {
                if (gestor.VerificarCedula(cedula) == false) {

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
                }
            } else {
                System.out.println("Cédula incorrecta (Contiene 10 números)");
            }
        } while (!aux);

        return cedula;
    }

}
