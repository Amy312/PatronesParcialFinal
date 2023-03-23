package parcialFinal.bridge3;

import java.util.ArrayList;
import java.util.List;

public class EmpresaSA implements IEmpresa{
    private List<Paquete> almacen = new ArrayList<>();
    private IEnvio tipoEnvio;

    public EmpresaSA(IEnvio tipoEnvio) {
        this.tipoEnvio = tipoEnvio;
    }

    @Override
    public void agregarPaquete(Paquete paquete) {

    }
}
