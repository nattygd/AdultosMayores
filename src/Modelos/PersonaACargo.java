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

public class PersonaACargo extends Individuo{
    //atributos
    private int NumeroCelular;
    private String Parentesco;

    Scanner entrada = new Scanner(System.in);

    public PersonaACargo(String Rut,String Nombre, String Direccion, String Parentesco , int NumeroCelular  ){
        super(Rut , Nombre , Direccion);
        this.NumeroCelular=NumeroCelular;
        this.Parentesco=Parentesco;
    }
    
    // accesores
    public int getNumeroCelular(){
        return this.NumeroCelular;
    }
    public String getParentesco(){
        return this.Parentesco;
    }
    
    // mutadores
    public void setNumeroCelular(int NumeroCelular){
        this.NumeroCelular=NumeroCelular;
    }
    public void setParentesco(String Parentesco){
        this.Parentesco=Parentesco;
    }
    
    //comportamientos
    public void imprimir(){
        
        System.out.println("Nombre : "+ getNombre());
        System.out.println("Rut : "+ getRut());
        System.out.println("Direccion : "+ getDireccion());
        System.out.println("NumeroCelular : "+ NumeroCelular);
        System.out.println("Parentesco : "+ Parentesco);
        System.out.println("//////////////////////////////////;");
    }
    
    public void Llamar(){
        super.Llamar();
        System.out.println(NumeroCelular + "Emergencia ");
    }
}