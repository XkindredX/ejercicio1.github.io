
/**
 * Write a description of class ventas_estructurada here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Juegos_Estructurada
{
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    String[] identificaciones = new String[50];
    String[] nombres = new String[50];
    double[] ventauno = new double[50];
    double[] ventados = new double[50];
    double[] ventatres = new double[50];
    int numeroCompradores;
        String identificacion, nombre;
        double v1, v2, v3;
        double promedio = 0;
        
        System.out.println("digite la cantidad de compradores");
        numeroCompradores = sc.nextInt();
        for(int i = 0; i < numeroCompradores; i++){
            System.out.println("Digite la identificacion del comprador: ");
            identificacion = sc.next();
            System.out.println("Digite el nombre del comprador: ");
            nombre = sc.next();
            System.out.println("Digite valor juego 1");
            v1 = sc.nextDouble();
            System.out.println("Digite valor juego 2");
            v2 = sc.nextDouble();
            System.out.println("Digite valor juego 3");
            v3 = sc.nextDouble();
            
            identificaciones[i] = identificacion;
            nombres[i] = nombre;
            ventauno[i] = v1;
            ventados[i] = v2;
            ventatres[i] = v3;
            
            
        }
        for(int i = 0; i < numeroCompradores; i++){
            promedio = promedio + ((ventauno[i] + ventados[i] + ventatres[i]) / 3) / numeroCompradores;
        }
        System.out.println("El promedio de ventas  es: " + promedio);
    
    }
}
