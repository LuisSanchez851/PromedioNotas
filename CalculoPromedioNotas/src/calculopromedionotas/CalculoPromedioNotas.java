
package calculopromedionotas;

import co.edu.ue.entidades.Promedio;
import java.util.Scanner;


public class CalculoPromedioNotas {

    public static void main(String[] args) {
        Scanner readData = new Scanner(System.in);
        System.out.println("Dame la cantidad de notas");
        int cantNotas = readData.nextInt();
        Promedio promedio = new Promedio(cantNotas);
        double avg = promedio.calcularPromedio();
        System.out.println("Promedio: "+avg);
    }
    
}
