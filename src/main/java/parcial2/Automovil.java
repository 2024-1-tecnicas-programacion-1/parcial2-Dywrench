package parcial2;

// O(1) Constante.
public class Automovil extends Vehiculo {
     private int numeroPuertas;
     private TipoCombustible tipoCombustible;    
     public Automovil(String marca, String modelo, int año, int numeroPuertas, TipoCombustible tipoCombustible) {
        super(marca, modelo, año);
        this.numeroPuertas = numeroPuertas;
        this.tipoCombustible = tipoCombustible;
    }
    
     // O(1) Constante.
    public int getNumeroPuertas() {
        return numeroPuertas;
    }
    // O(1) Constante.
    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }
    // O(1) Constante.
    public TipoCombustible getTipoCombustible() {
        return tipoCombustible;
    }
    // O(1) Constante.
    public void setTipoCombustible(TipoCombustible tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }
    // O(1) Constante.
    @Override
    public String imprimirInformacion(){
        return marca +""+modelo+""+año+","+numeroPuertas+" puertas"+","+"combustion a "+tipoCombustible;
    }
}
