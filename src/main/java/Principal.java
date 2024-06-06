import java.util.Scanner;
import parcial2.Automovil;
import parcial2.Vehiculo;
import parcial2.TipoCombustible;
import parcial2.Motocicleta;
import parcial2.TipoMotocicleta;
public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
       // O(1) Constante.
        System.out.println("Ingrese el año del vehículo:");
        int año = sc.nextInt();
        
        System.out.println("Ingrese el modelo del vehículo:");
        String modelo = sc.next();
        
        System.out.println("Ingrese la marca del vehículo:");
        String marca = sc.next();
        
        System.out.println("Ingrese el numero de puertas del Vehiculo:");
        int numeroPuertas=sc.nextInt();
        
        // O(1) Constante.
        if (numeroPuertas==0){
            
            System.out.println("Ingrese El tipo de motocicleta (DEPORTIVA,TOURING,NAKED,CAFE_RACER):");
            
            TipoMotocicleta tipoMotocicleta = TipoMotocicleta.valueOf(sc.next().toUpperCase());
            Motocicleta motocicleta = new Motocicleta(marca, modelo, año, tipoMotocicleta);
        }
        
        System.out.println("Ingrese el tipo de combustible (Gasolina, Electrico, Hibrido, CRUISER, SCOOTER, ENDURO):");
        TipoCombustible tipoCombustible = TipoCombustible.valueOf(sc.next());
        
        Vehiculo vehiculo = new Vehiculo(marca, modelo, año);
        Automovil automovil = new Automovil(marca, modelo, año,numeroPuertas, tipoCombustible);  
    }
}
