/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;
/**
 *
 * @author natty
 */
import java.util.Scanner;

public class Medicamento {
    // atributos
    private String Nombre;
    private int Concentracion;
    private String Frecuencia;
    private int Dosis;

    Scanner entrada = new Scanner(System.in);
    
    public Medicamento() {
    }

    public Medicamento(String Nombre, int Concentracion, String Frecuencia, int Dosis) {
        this.Nombre = Nombre;
        this.Concentracion = Concentracion;
        this.Frecuencia = Frecuencia;
        this.Dosis = Dosis;
    }

    //accesores
    public String getNombre() {
        return this.Nombre;
    }

    public int getConcentracion() {
        return this.Concentracion;
    }

    public String getFrecuencia() {
        return this.Frecuencia;
    }

    public int getDosis() {
        return this.Dosis;
    }

    // mutadores
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setConcentracion(int Concentracion) {
        this.Concentracion = Concentracion;
    }

    public void setFrecuencia(String Frecuencia) {
        this.Frecuencia = Frecuencia;
    }

    public void setDosis(int Dosis) {
        this.Dosis = Dosis;
    }

    // comportamientos
    public void CrearMedicamentos() {
        String input;

        System.out.println("Ingrese nombre del medicamento:"); 
        input = entrada.next();
        while (!input.matches("[a-zA-Z]*")) {
            System.out.println("Tipo de datos incorrectos, solo letras:");
            System.out.println("Ingrese nombre del Medicamento valido:");
            input = entrada.next();
        }
        this.Nombre = (input);

        System.out.println("Ingrese la concentracion (ej, 100mg) solo cantidad:");
        input = entrada.next();
        while (!input.matches("[0-9]*")) {
            System.out.println("Tipo de datos incorrectos, solo numeros:");
            System.out.println("Ingrese la contracion valida:");
            input = entrada.next();
        }
        this.Concentracion = Integer.parseInt(input);

        System.out.println("Ingrese frecuencia (ej, ocho):");
        input = entrada.next();
        while (!input.matches("[a-zA-Z]*")) {
            System.out.println("Tipo de datos incorrectos, solo letras:");
            System.out.println("Ingrese frecuencia valido:");
            input = entrada.next();
        }
        this.Frecuencia = input;

        System.out.println("Ingrese Dosis (cantidad de pastillas, ej 2):");
        input = entrada.next();
        while (!input.matches("[0-9]*")) {
            System.out.println("Tipo de datos incorrectos, solo numeros:");
            System.out.println("Ingrese la dosis valida:");
            input = entrada.next();
        }
        this.Dosis = Integer.parseInt(input);
        System.out.println("//////////////////////////////////;");
    }
}