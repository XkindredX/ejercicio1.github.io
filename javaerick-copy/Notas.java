
/**
 * Write a description of class ventajuegos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Notas
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int ncompradores;
        juegosPOO[] loscompradores = new juegosPOO[50];
        String identificacion, nombre;
        double v1, v2, v3;
        double promedio = 0;
    
        
        System.out.println("Digite la cantidad de Compradores");
        ncompradores = sc.nextInt();
        for (int  i = 0; i < ncompradores; i++){
        System.out.println("Digite la identificacion del comprador");
        identificacion = sc.next();
        System.out.println("Digite el nombre del comprador");
        nombre = sc.next();
        System.out.println("Digite valor juego 1");
        v1 = sc.nextDouble();
        System.out.println("Digite valor juego 2");
        v2 = sc.nextDouble();
        System.out.println("Digite valor juego 3");
        v3 = sc.nextDouble();
        
        juegosPOO unComprador = new juegosPOO();
        unComprador.identificacion = identificacion;
        unComprador.nombre = nombre;
        unComprador.ventauno = v1;
        unComprador.ventados = v2;
        unComprador.ventatres = v3;
        loscompradores[i] = unComprador;
        
            
        
        }
        
        for (int  i = 0; i < ncompradores; i++){
            double sum = (loscompradores[i].ventauno + loscompradores[i].ventados + loscompradores[i].ventatres) / 3;
            promedio = promedio + sum / ncompradores;
            
        }
        
        System.out.println("El promedio de ventas es: " + promedio);
        
    }
    
}
