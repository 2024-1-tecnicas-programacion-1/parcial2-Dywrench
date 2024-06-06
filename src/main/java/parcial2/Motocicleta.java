package parcial2;

public class Motocicleta extends Vehiculo {
    private TipoMotocicleta tipoMotocicleta;
    public Motocicleta(String marca, String modelo, int año,TipoMotocicleta tipoMotocicleta) {
        super(marca, modelo, año);  
    }

    public TipoMotocicleta getTipoMotocicleta() {
        return tipoMotocicleta;
    }

    public void setTipoMotocicleta(TipoMotocicleta tipoMotocicleta) {
        this.tipoMotocicleta = tipoMotocicleta;
    }
    
    // O(1) Constante.
    @Override
    public String imprimirInformacion(){
        return marca +""+modelo+""+año+""+tipoMotocicleta;
    }
}
