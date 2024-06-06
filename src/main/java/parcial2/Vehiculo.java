package parcial2;

public  class Vehiculo {
    protected String marca;
    protected String modelo;
    protected int año;

    public Vehiculo(String marca, String modelo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }
    
   
    // O(1) Constante.
    public void setMarca(String marca) {
        this.marca = marca;
    }
    // O(1) Constante.
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    // O(1) Constante.
    public void setAño(int año) {
        this.año = año;
    }
    // O(1) Constante.
    public String getMarca() {
        return marca;
    }
    // O(1) Constante.
    public String getModelo() {
        return modelo;
    }   
    // O(1) Constante.
    public int getAño() {
        return año;
    }
    // O(1) Constante.
    public String imprimirInformacion(){
    return marca +""+modelo+""+año;
    
    }
}
