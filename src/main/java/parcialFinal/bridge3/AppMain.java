package parcialFinal.bridge3;

public class AppMain {
    public static void main(String[] args) {
        EmpresaSA empresaSA = new EmpresaSA();
        EmpresaSRL empresaSRL = new EmpresaSRL();

        empresaSA.agregarPaquete(new Paquete(50.0F, "peluche", "140 gr"));
        empresaSA.agregarPaquete(new Paquete(20.50F, "dulces", "120 gr"));
        empresaSA.agregarPaquete(new Paquete(1000.30F, "ropa", "1 kg"));
        empresaSA.agregarPaquete(new Paquete(10000.99F, "tv", "3.5 kg"));
        empresaSA.agregarPaquete(new Paquete(9000.00F, "laptop", "0.5 kg"));
        empresaSA.agregarPaquete(new Paquete(3500.00F, "celular", "340 gr"));

        empresaSRL.agregarPaquete(new Paquete(50.0F, "adorno", "140 gr"));
        empresaSRL.agregarPaquete(new Paquete(20.50F, "plastico", "120 gr"));
        empresaSRL.agregarPaquete(new Paquete(1000.30F, "mobiliario", "1 kg"));
        empresaSRL.agregarPaquete(new Paquete(10000.99F, "impresora", "3.5 kg"));
        empresaSRL.agregarPaquete(new Paquete(9000.00F, "vidrio", "0.5 kg"));
        empresaSRL.agregarPaquete(new Paquete(3500.00F, "porcelana", "340 gr"));

        IEnvio aire = new EnvioAire();
        IEnvio mar = new EnvioMar();
        IEnvio tierra = new EnvioTierra();


        empresaSA.enviarPaquete("tv", aire);

        empresaSA.enviarPaquete("tv", mar);
        empresaSA.enviarPaquete("tv", tierra);

    }
}