package Principalreto1y2;
import Saludreto1y2.Persona;
public class Inicioreto2 {
    public static void main(String[] args)  throws Exception{
        Persona datos=new Persona();
        double Imc;
        datos.pedirDatos();
        datos.mostrarPersona();
        datos.validaEdad();
        Imc=datos.calcularImc();
        if (Imc<20) {
            System.out.println("su peso esta por debajo de lo ideal");
            System.out.println("su Indice de Masa Corporal es: "+Imc);

        }
        else if(Imc>=20 && Imc<=25){
            System.out.println("su peso esta dentro del ideal");
            System.out.println("su Indice de Masa Corporal es: "+Imc);
        }
        else if(Imc>20){
            System.out.println("usted esta en sobrepeso");
            System.out.println("su Indice de Masa Corporal es: "+Imc);
        }
        else{
            System.out.println("error 405");
            
    }
    }
}
