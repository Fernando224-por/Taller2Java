package Principalreto1y2;
import java.util.Scanner;

import Saludreto1y2.Persona;
public class Inicio {
    public static void main(String[] args) {
        Scanner dates=new Scanner(System.in);
        Persona datos=new Persona();
        datos.pedirDatos();
        datos.mostrarPersona();
        datos.validaEdad();  
        datos.Imc();
        dates.close();
}

}
