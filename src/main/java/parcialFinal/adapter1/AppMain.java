package parcialFinal.adapter1;

public class AppMain {
    public static void main(String[] args) {

        IAutomovil automovilGasolina = new AGasolina();
        automovilGasolina.llenarGasolina(100);
        System.out.println("Estado final combustible: " + automovilGasolina.estadoCombustible() + "\n");

        AutoElectrico autoElectrico = new AutoElectrico();

        IAutomovil electrico = new ElectricoAdapter(autoElectrico);

        electrico.llenarGasolina(97);
        System.out.println("Estado final bateria: " + electrico.estadoCombustible() + "\n");

    }
}