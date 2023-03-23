package parcialFinal.bridge3;

public class EnvioAire implements IEnvio{
    private float extra = 0.10F;
    @Override
    public float agregarCosto() {
        return extra;
    }
    @Override
    public String tipo() {
        return "Aire";
    }
}
