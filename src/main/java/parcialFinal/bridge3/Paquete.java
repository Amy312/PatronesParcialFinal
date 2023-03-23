package parcialFinal.bridge3;

public class Paquete {
    private float precio;
    private String nombre;
    private String peso;

    public Paquete(float precio, String nombre, String peso) {
        this.precio = precio;
        this.nombre = nombre;
        this.peso = peso;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public void showInfo(){
        System.out.println("--> Paquete");
        System.out.println("\t- Nombre:" + nombre);
        System.out.println("\t- Precio: " + precio);
        System.out.println("\t- Peso: " + peso);
        System.out.println("----------------------\n");

    }
}
