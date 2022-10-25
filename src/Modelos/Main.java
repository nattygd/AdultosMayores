/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Modelos;

/**
 *
 * @author natty
 */
import java.util.Scanner;

public class Main {
    static Scanner entrada = new Scanner(System.in);

    // arreglar (si se pide imprimir algo inexistente) Error
    //modificacion de especificos 
    //agregar funcion llamar a apoderados
    public static void main(String[] args) { 
    int opcion;
    int edad;
    int numeroCelular;
    String rut; 
    String nombre;
    String direccion;
    String parentesco;
    AdultoMayor adultos;
    String input;

    adultos = new AdultoMayor("200132565", "Diego", "Lugar", 85, 963667859); // arreglar

    System.out.println("Opcion 0 :  Salir");
    System.out.println("Opcion 1 :  Registrar adulto mayor");
    System.out.println("Opcion 2 :  Agregar apoderado");
    System.out.println("Opcion 3 :  Imprimir datos del apoderado");
    System.out.println("Opcion 4 :  Imprimir datos del adulto mayor");
    System.out.println("Opcion 5 :  AgregarMedicamentos ");
    System.out.println("Opcion 6 :  EliminarMedicamento ");
    System.out.println("Opcion 7 :  ImprimirMedicamentos");
    System.out.println("Opcion 8 :  Agregar una hora medica");
    System.out.println("Opcion 9 :  Imprimir horas medicas");
    System.out.println("Opcion 10 :  Moddificar datos especificos");
    opcion = entrada.nextInt();
    while (!String.valueOf(opcion).matches("[0-9]*")) {
        System.out.println("dato no esta completo , solo numeros");
        System.out.println("Ingrese opcion");
        opcion = entrada.nextInt();
    }

    while (opcion != 0) {

        switch (opcion) {
            case 0:
                System.out.print("Fin"); 
                break;
                
            case 1:
                System.out.println("Ingrese rut sin puntos ni guion:");
                rut = entrada.next();
                while (!rut.matches("[0-9]*")) {
                    System.out.println("Tipo de dato incorrecto, solo numeros");
                    System.out.println("Ingrese rut valido:");
                    rut = entrada.next();
                }

                System.out.println("Ingrese nombre:");
                nombre = entrada.next(); 
                while (!nombre.matches("[a-zA-Z]*")) {
                    System.out.println("Tipo de dato incorrecto, solo letras");
                    System.out.println("Ingrese nombre valido:");
                    nombre = entrada.next();
                }

                System.out.println("Ingrese Direccion:");
                direccion = entrada.next();
                while (!direccion.matches("[a-zA-Z]*")) {
                    System.out.println("Tipo de dato incorrecto, solo letras");
                    System.out.println("Ingrese direccion valida:");
                    direccion = entrada.next();
                }

                System.out.println("Ingrese edad:");
                input = entrada.next();
                while (!input.matches("[0-9]*")) {
                    System.out.println("Tipo de dato incorrecto, solo numeros");
                    System.out.println("Ingrese edad valida:");
                    input = entrada.next();
                }
                edad = Integer.parseInt(input);

                System.out.println("Ingrese numero de contacto:");
                input = entrada.next();
                while (!input.matches("[0-9]*")) {
                    System.out.println("Tipo de dato incorrecto, solo numeros");
                    System.out.println("Ingrese numero de contacto valido:");
                    input = entrada.next();
                }
                numeroCelular = Integer.parseInt(input);

                adultos = new AdultoMayor(rut, nombre, direccion, edad, numeroCelular);
                break;
                
            case 2:
                System.out.println("Ingrese rut sin punto ni guion:");
                rut = entrada.next();
                while (!rut.matches("[0-9]*")) {
                    System.out.println("Tipo de dato incorrecto, solo numeros");
                    System.out.println("Ingrese rut valido:");
                    rut = entrada.next();
                }

                System.out.println("Ingrese nombre:");
                nombre = entrada.next();
                while (!nombre.matches("[a-zA-Z]*")) {
                    System.out.println("Tipo de dato incorrecto, solo letras");
                    System.out.println("Ingrese nombre valido:");
                    nombre = entrada.next();
                }

                System.out.println("Ingrese direccion:");
                direccion = entrada.next();
                while (!direccion.matches("[a-zA-Z]*")) {
                    System.out.println("Tipo de dato incorrecto, solo letras");
                    System.out.println("Ingrese direccion valida:");
                    direccion = entrada.next();
                }

                System.out.println("Ingrese parentesco con el adulto mayor:");
                parentesco = entrada.next();
                while (!parentesco.matches("[a-zA-Z]*")) {
                    System.out.println("Tipo de dato incorrecto, solo letras");
                    System.out.println("Ingrese parentesco valido:");
                    parentesco = entrada.next();
                }

                System.out.println("Ingrese numero de contacto:");
                input = entrada.next();
                while (!input.matches("[0-9]*")) {
                    System.out.println("Tipo de dato incorrecto, solo numeros");
                    System.out.println("Ingrese numero de contacto valido:");
                    input = entrada.next();
                }
                numeroCelular = Integer.parseInt(input);
                
                adultos.agregarApoderado(rut, nombre, direccion, parentesco, numeroCelular);
                break;
                
            case 3:
                adultos.imprimirAdultoACargo();
                break;
                
            case 4:
                adultos.imprimirDatos();
                break;
                
            case 5:
                adultos.agregarMedicamentos();
                break;
                
            case 6:
                System.out.println("Escriba el nombre del medicamento a eliminar o el Numero del Medicamento;");
                input = (entrada.next());
                if (input.matches("[0-9]*")) {
                    adultos.eliminarMedicamento(Integer.parseInt(input));
                } else
                    adultos.eliminarMedicamento(input);
                break;
                
            case 7:
                adultos.imprimirMedicamentos();
                break;
                
            case 8:
                adultos.agregarHoraMedica();
                break;

            case 9:
                adultos.ListarHoras();
                break;
            case 10:
                adultos.ModificarDato();
                break;

            default:
                System.out.println("Opcion no valida");
                break;
        }

        System.out.println("Opcion 0 :  Salir");
        System.out.println("Opcion 1 :  Registrar adulto mayor");
        System.out.println("Opcion 2 :  Agregar apoderado");
        System.out.println("Opcion 3 :  Imprimir datos del apoderado");
        System.out.println("Opcion 4 :  Imprimir datos del adulto mayor");
        System.out.println("Opcion 5 :  AgregarMedicamentos ");
        System.out.println("Opcion 6 :  EliminarMedicamento ");
        System.out.println("Opcion 7 :  ImprimirMedicamentos");
        System.out.println("Opcion 8 :  Agregar una hora medica");
        System.out.println("Opcion 9 :  Imprimir horas medicas");
        System.out.println("Opcion 10 :  Moddificar datos especificos");

        opcion = entrada.nextInt();
        while (!String.valueOf(opcion).matches("[0-9]*")) {
            System.out.println("dato no esta completo , solo numeros");
            System.out.println("Ingrese opcion");
            opcion = entrada.nextInt();
        }
    }

    System.out.println("FIN");
    }
  /*
   * letras ([a-zA-Z]*)
   * Numeros([0-9]*)
   * numero y - ([0-9-]*)]
   */
}