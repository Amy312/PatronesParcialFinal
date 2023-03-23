package parcialFinal.bridge3;

public interface IEmpresa {
    void agregarPaquete(Paquete paquete);
    void enviarPaquete(String nombre, IEnvio envio);
}
