package co.edu.ue.entidades;

import java.util.Scanner;


public class Promedio {
    private int cantNotas;
    public Promedio(int cantNotas){
       this.cantNotas = cantNotas;
   
    }
    public double calcularPromedio(){
       double sumaNotas = this.sumaPromedio();
       
       
       return sumaNotas/this.cantNotas; 
    }
    private double sumaPromedio(){
        Scanner read = new Scanner(System.in);
        double suma=0;
        double nota=0;
        
        for(int i=0; i<this.cantNotas;i++)
        {
           System.out.println("Dame la nota: ");  
           nota= read.nextDouble();
           suma +=nota;
        }

        return 0;
    }
   
}
