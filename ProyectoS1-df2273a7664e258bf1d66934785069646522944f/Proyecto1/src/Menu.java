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
                    System.out.println("Bienvenido a la opción 1");
                    break;
                case 2:
                    do {
                        Profesor prof = new Profesor();
                        PedirDatosProfesores(prof);
                        gestor.registrarProfesor(prof);
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
                            gestor.imprimirProfesores();
                            System.out.println("|___________________________________|");

                            break;
                        case 2:
                            System.out.println("|-----------------------------------|");
                            System.out.println("|--------E S T U D I A N T E S -----|");
                            gestor.imprimirPersonas();
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
        profe.setCedula(contrls.ControlCedula());
        profe.setNombre1(contrls.Palabras("Primer Nombre:"));
        profe.setNombre2(contrls.Palabras("Segundo Nombre:"));
        profe.setApellido1(contrls.Palabras("Apellido Paterno:"));
        profe.setApellido2(contrls.Palabras("Apellido Materno:"));
        profe.setFechaNacmto(contrls.controlFechaNacmto());
        profe.setAñosExper(contrls.ControlNumrs("Años de experiencia:"));
        profe.setSalario(contrls.ControlNumrs("Salario:"));
        return profe;
    }

    public void PedirDatosEstudiantes() {
        System.out.println("---Registro de Estudiantes-----");
        do {
            System.out.print("Cédula:");
            cedula = tec.Tec().next();
            System.out.print("Primer Nombre: ");
            nom1 = tec.Tec().next();
            System.out.print("Segundo Nombre: ");
            nom2 = tec.Tec().next();
            System.out.print("Apellido Paterno: ");
            apelldo1 = tec.Tec().next();
            System.out.print("Apellido Materno: ");
            apelldo2 = tec.Tec().next();
            System.out.print("Fecha de nacimiento(dd/mm/aaaa): ");
            fechNacmto = tec.Tec().nextInt();
            System.out.println("Dirección: ");
            direccion = tec.Tec().next();
            System.out.print("Desea Registrar un profesor nuevo\n ¿S/N?:");
            opcSn = tec.Tec().next().toUpperCase().charAt(0);

        } while (opcSn == 'S');
    }

    public void subMenu() {
        System.out.println("\nOpciones de reportes:");
        System.out.println("1)Profesores\n2)Estudiantes");
        System.out.print("Opción:");
    }

}
