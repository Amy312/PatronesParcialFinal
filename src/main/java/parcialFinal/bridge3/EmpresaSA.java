package parcialFinal.bridge3;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class EmpresaSA implements IEmpresa{
    private List<Paquete> almacen = new ArrayList<>();
    DecimalFormat df = new DecimalFormat("#.00");


    public EmpresaSA() {
    }

    @Override
    public void agregarPaquete(Paquete paquete) {
        almacen.add(paquete);
    }

    @Override
    public void enviarPaquete(String nombre, IEnvio envio) {
        boolean sw = false;
        for(Paquete paquete: almacen){
            if(paquete.getNombre().equals(nombre)){
                sw = true;
                System.out.println("--> Seleccionado <--");
                paquete.showInfo();
                System.out.println("Precio del paquete inicial: " + paquete.getPrecio());
                float total = paquete.getPrecio()*envio.agregarCosto() + paquete.getPrecio();
                System.out.println("Precio total por el envio por " + envio.tipo() + ": " + df.format(total));
                break;
            }
        }
        if(!sw){
            System.out.println("No se encuentra el paquete en la empresa SA");
        }

    }



}
