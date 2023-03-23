package parcialFinal.adapter1;

public class ElectricoAdapter implements IAutomovil{
    private AutoElectrico autoElectrico = new AutoElectrico();

    public ElectricoAdapter(AutoElectrico autoElectrico) {
        this.autoElectrico = autoElectrico;
    }

    @Override
    public void llenarGasolina(int cantidad) {
        autoElectrico.cargar(cantidad);
    }

    @Override
    public int estadoCombustible() {
        return autoElectrico.estadoElectricidad();
    }
}
