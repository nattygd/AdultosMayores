/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Modelos;
/**
 *
 * @author natty
 */
import Vista.InicioSesion;
import Vista.Menu;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {
    static Scanner entrada = new Scanner(System.in);
    
    
    public static void main(String[] args) throws FileNotFoundException, InterruptedException{
        ArrayList <AdultoMayor> adultosMayores=new ArrayList<>();
        AdultoMayor adultoInicial=new AdultoMayor("123", "asd", "Diego", "Lugar", 85, 963667859); 
        adultosMayores.add(adultoInicial);
        String input;
        int edad;
        int numeroCelular;
        String rut;
        String nombre;
        String direccion;
        String parentesco;
        String contrasenia="";
        
        InicioSesion login=new InicioSesion();
        Menu menuOpciones=new Menu();
        int comandoLogin=0;
        
        login.setVisible(true);
        while(comandoLogin!=3){
            //if (comandoLogin==0)
                
            int comandoOpciones=0;
            Thread.sleep(6000);
            
            if (login.getComando()==1){
                for (int i=0; i<adultosMayores.size(); i++){
                    if (adultosMayores.get(i).getRut().equals(login.getAdulto().getRut()) && adultosMayores.get(i).getContrasenia().equals(login.getAdulto().getContrasenia())){;
                        menuOpciones.setVisible(true);
                        login.dispose();
                        
                        //Thread.sleep(10000);
                        
                        comandoOpciones=menuOpciones.getComando();
                        switch(comandoOpciones){
                            //ADULTO MAYOR
                            case 1:
                                JOptionPane.showMessageDialog(menuOpciones, "Se mostrarán los datos en la consola");
                                adultosMayores.get(i).imprimirDatos();
                                Thread.sleep(10000);
                                break;
                                
                            //APODERADO
                            case 2:
                                boolean flag;
                                flag=false;
                                do {
                                    System.out.println("Ingrese rut sin puntos y con guion:");
                                    rut = entrada.next();  
                                    try {
                                        if(rut.matches("\\d{7,8}\\-+\\d{1}")) { 
                                        flag= true;
                                        }
                                        else
                                        {
                                            System.out.println("Ingrese rut valido:");
                                        }
                                    } catch (Exception e) {
                                        System.out.println("Error al ingresar rut");
                                    }
                                } while (!flag);

                                flag=false;
                                do {
                                    System.out.println("Ingrese nombre:");
                                    nombre = entrada.next();
                                    try {
                                        if(nombre.matches("[a-zA-Z]*")){
                                        flag= true;
                                        }
                                        else
                                        {
                                            System.out.println("Ingrese nombre valido:");
                                        }
                                    } catch (Exception e) {
                                        System.out.println("Error al ingresar nombre");
                                    }
                                } while (!flag);
                                

                                flag=false;
                                do {
                                    System.out.println("Ingrese direccion: ejemplo : (Casablanca-21)");
                                    direccion = entrada.next();
                                    try {
                                        if(direccion.matches("[a-zA-Z0-9]*\\-+\\d{1,5}")){
                                        flag= true;
                                        }
                                        else
                                        {
                                            System.out.println("Tipo de dato incorrecto, ejemplo : (Casablanca-21)");
                                        }
                                    } catch (Exception e) {
                                        System.out.println("Error al ingresar direccion");
                                    }
                                } while (!flag);

                                flag=false;
                                do {
                                    System.out.println("Ingrese parentesco con el adulto mayor:");
                                    parentesco = entrada.next();
                                    try {
                                        if(parentesco.matches("[a-zA-Z]*")){
                                        flag= true;
                                        }
                                        else
                                        {
                                            System.out.println("Tipo de dato incorrecto, solo letras");
                                        }
                                    } catch (Exception e) {
                                        System.out.println("Error al ingresar el parentesco");
                                    }
                                } while (!flag);
                                
                                flag= false;
                                do {
                                    System.out.println("Ingrese numero de contacto: (ejemplo 63667857)");
                                    input = entrada.next();
                                    numeroCelular=0;
                                    try {
                                        numeroCelular = Integer.parseInt(input);
                                        if(input.matches("\\d{8}")){
                                        flag= true;
                                        }else{
                                            System.out.println("Escriba un numero valido (ejemplo 63667857) solo 8 digitos ");
                                        }
                                    } catch (NumberFormatException e) {
                                        System.out.println( e.toString());
                                        System.out.println("Tipo de dato incorrecto, solo numeros");
                                    }
                                } while (!flag);
                                ////////////////////////////////
                                
                                
                
                                adultosMayores.get(i).agregarApoderado(rut, nombre, direccion, parentesco, numeroCelular);
                
                                System.out.println("//////////////////////////////////;");
                                System.out.println("Persona a cargo agregada");
                                System.out.println("//////////////////////////////////;");
                                break;
                                
                            case 3:
                                JOptionPane.showMessageDialog(menuOpciones, "Se mostrarán los datos en la consola");
                                adultosMayores.get(i).imprimirAdultoACargo();
                                Thread.sleep(10000);
                                break;
                            
                            //MEDICAMENTOS
                            case 4:
                                adultosMayores.get(i).agregarMedicamentos();
                                break;
                                
                            case 5:
                                JOptionPane.showMessageDialog(menuOpciones, "Se mostrarán los datos en la consola");
                                adultosMayores.get(i).imprimirMedicamentos();
                                Thread.sleep(10000);
                                break;
                                
                            case 6:
                                System.out.println("Escriba el nombre del medicamento a eliminar o el numero del medicamento;");
                                input = (entrada.next());
                                
                                if (input.matches("[0-9]*")) {
                                    adultosMayores.get(i).eliminarMedicamento(Integer.parseInt(input));
                                } else
                                    adultosMayores.get(i).eliminarMedicamento(input);
                                break;
                               
                            //HORAS MEDICAS
                            case 7:
                                adultosMayores.get(i).agregarHoraMedica();
                                break;
                                
                            case 8:
                                JOptionPane.showMessageDialog(menuOpciones, "Se mostrarán los datos en la consola");
                                adultosMayores.get(i).ListarHoras();
                                Thread.sleep(10000);
                                break;
                                
                            case 9:
                                adultosMayores.get(i).BuscarHora();
                                break;
                            
                            //EDITAR
                            case 10:
                                adultosMayores.get(i).ModificarDato();
                                break;
                                
                            case 11:
                                System.out.println("Ingrese 1 si necesita llamar a su celular o 2 si necesita llamar a uno de sus apoderados");
                                input=(entrada.next());
                                
                                if (input.equals("1"))
                                    adultosMayores.get(i).Llamar();
                                else if (input.equals("2"))
                                    adultosMayores.get(i).BuscarCelularNumeroFinal();
                                break;
                                
                            case 12:
                                adultosMayores.get(i).LlamadaEmergencia();
                                break;
                                
                            case 13:
                                adultosMayores.get(i).ApoderadoMenor();
                                Thread.sleep(10000);
                                break;
                        }
                        
                        comandoLogin=0;
                        comandoOpciones=0;
                        //menuOpciones.dispose();
                    }else
                        System.out.println("Usuario o contrasenia incorrecta");
                }
            }
            
            if (login.getComando()==2){
                JOptionPane.showMessageDialog(menuOpciones, "Interactue con la consola");
                
                //AGREGAR ADULTO MAYOR
                System.out.println("Ingrese rut sin puntos ni guion:");
                rut = entrada.next();
                while (!rut.matches("\\d{8,9}")) {  ///// Agregar a todos los rut ******************************************************
                    System.out.println("Tipo de dato incorrecto, solo numeros");
                    System.out.println("Ingrese rut valido:");
                    rut = entrada.next();
                }
                
                System.out.println("Ingrese una contrasenia:");
                contrasenia=entrada.next();
                while (!contrasenia.matches("[a-zA-Z]*")) {
                    System.out.println("Tipo de dato incorrecto, solo letras");
                    System.out.println("Ingrese contrasenia valida:"); 
                    contrasenia = entrada.next();
                }

                System.out.println("Ingrese nombre:");
                nombre = entrada.next();
                while (!nombre.matches("[a-zA-Z]*")) {
                    System.out.println("Tipo de dato incorrecto, solo letras");
                    System.out.println("Ingrese nombre valido:"); 
                    nombre = entrada.next();
                }

                System.out.println("Ingrese direccion: ejemplo: (Casablanca-21)");
                direccion = entrada.next();
                while (!direccion.matches("[a-zA-Z0-9]*\\-+\\d{1,5}")){ 
                    System.out.println("Tipo de dato incorrecto, ejemplo : (Casablanca-21)");
                    System.out.println("Ingrese direccion valida:");
                    direccion = entrada.next();
                }

                System.out.println("Ingrese edad:");
                input = entrada.next();
                while (!input.matches("\\d{2}")) { 
                    System.out.println("Tipo de dato incorrecto, solo numeros");
                    System.out.println("Ingrese edad valida:");
                    input = entrada.next();
                }
                edad = Integer.parseInt(input);

                System.out.println("Ingrese numero de contacto: (ejemplo 63667857)");
                input = entrada.next();
                while (!input.matches("\\d{8}")) { 
                    System.out.println("Tipo de dato incorrecto, solo numeros");
                    System.out.println("Ingrese numero de contacto valido:");
                    input = entrada.next();
                }
                numeroCelular = Integer.parseInt(input);

                AdultoMayor adultoNuevo = new AdultoMayor(rut, contrasenia, nombre, direccion, edad, numeroCelular);
                adultosMayores.add(adultoNuevo);
                
                
                System.out.println("//////////////////////////////////;");
                System.out.println("Adulto mayor agregado");
                System.out.println("//////////////////////////////////;");
                
                comandoLogin=0;
            }
            
            login.matarDatos();
        }
    }
    
    /*
    public static void main(String[] args) throws FileNotFoundException { 
    int opcion;
    int edad;
    int numeroCelular;
    String rut;
    String contrasenia="jpdfog";
    String nombre;
    String direccion;
    String parentesco;
    AdultoMayor adultos;
    String input;

    adultos = new AdultoMayor("200132565", "dfs", "Diego", "Lugar", 85, 963667859); // arreglar

    System.out.println("Opcion 0: Salir");
    System.out.println("Opcion 1: Registrar adulto mayor");
    System.out.println("Opcion 2: Agregar apoderado");
    System.out.println("Opcion 3: Imprimir datos del apoderado");
    System.out.println("Opcion 4: Imprimir datos del adulto mayor");
    System.out.println("Opcion 5: AgregarMedicamentos ");
    System.out.println("Opcion 6: EliminarMedicamento ");
    System.out.println("Opcion 7: ImprimirMedicamentos");
    System.out.println("Opcion 8: Agregar una hora medica");
    System.out.println("Opcion 9: Imprimir horas medicas");
    System.out.println("Opcion 10: Modificar datos especificos");
    System.out.println("Opcion 11: Buscar dato medicamento");
    System.out.println("Opcion 12:  Buscar celular");
    System.out.println("Opcion 13:  Llamada de emergencia");
    System.out.println("Opcion 14:  Buscar apoderado con el rut menor");
    System.out.println("Opcion 15:  Buscar Celular que termine con el numero : ");
    System.out.println("Ingrese una opcion:");
    opcion = entrada.nextInt();
    while (!String.valueOf(opcion).matches("[0-9]*")) {
        System.out.println("dato no esta completo , solo numeros");
        System.out.println("Ingrese opcion:");
        opcion = entrada.nextInt();
    }

    while (opcion != 0) {

        switch (opcion) {
            case 0:
                System.out.print("Ha salido exitosamente");
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

                adultos = new AdultoMayor(rut, contrasenia, nombre, direccion, edad, numeroCelular);
                
                System.out.println("//////////////////////////////////;");
                System.out.println("Adulto mayor agregado");
                System.out.println("//////////////////////////////////;");
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
                System.out.println("Ingrese numero de contacto:");
                input = entrada.next();
                while (!input.matches("[0-9]*")) {
                    System.out.println("Tipo de dato incorrecto, solo numeros");
                    System.out.println("Ingrese numero de contacto valido:");
                    input = entrada.next();
                }
                numeroCelular = Integer.parseInt(input);
                
                adultos.agregarApoderado(rut, nombre, direccion, parentesco, numeroCelular);
                
                System.out.println("//////////////////////////////////;");
                System.out.println("Persona a cargo agregada");
                System.out.println("//////////////////////////////////;");
                break;
                
            case 3:
                adultos.imprimirAdultoACargo();
                break;
                
            case 4:
                adultos.imprimirDatos();
                
                if(adultos.getRut().equals("200132565")){
                    adultos.imprimirDatos();
                }else
                    System.out.println("Necesita agregar Adulto mayor");
                break;
                
            case 5:
                adultos.agregarMedicamentos();
                break;
                
            case 6:
                System.out.println("Escriba el nombre del medicamento a eliminar o el numero del medicamento;");
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
            case 11:
                System.out.println("Escriba el nombre del medicamento a buscar:");
                input = (entrada.next());
                    adultos.buscarMedicamento(input); 
                break;
                
            case 12:
                adultos.Llamar();
                break;
                
            case 13:
                adultos.LlamadaEmergencia();
                break;

            default:
                System.out.println("Opcion no valida");
                break;
        }

        System.out.println("Opcion 0: Salir");
        System.out.println("Opcion 1: Registrar adulto mayor");
        System.out.println("Opcion 2: Agregar apoderado");
        System.out.println("Opcion 3: Imprimir datos del apoderado");
        System.out.println("Opcion 4: Imprimir datos del adulto mayor");
        System.out.println("Opcion 5: AgregarMedicamentos ");
        System.out.println("Opcion 6: EliminarMedicamento ");
        System.out.println("Opcion 7: ImprimirMedicamentos");
        System.out.println("Opcion 8: Agregar una hora medica");
        System.out.println("Opcion 9: Imprimir horas medicas");
        System.out.println("Opcion 10: Modificar datos especificos");
        System.out.println("Opcion 11: Buscar medicamento");
        System.out.println("Opcion 12:  Buscar celular");
        System.out.println("Opcion 13:  Llamada de emergencia");
        System.out.println("Ingrese una opcion:");

        opcion = entrada.nextInt();
        while (!String.valueOf(opcion).matches("[0-9]*")) {
            System.out.println("Tipo de dato incorrecto, solo numeros");
            System.out.println("Ingrese opcion");
            opcion = entrada.nextInt();
        }
    }

    System.out.println("FIN");
    }
    
    */
  /*
   * letras ([a-zA-Z]*)
   * Numeros([0-9]*)
   * numero y - ([0-9-]*)]
   */
}