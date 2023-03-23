package parcialFinal.bridge3;

public class EnvioTierra implements IEnvio{
    private float extra = 0.05F;
    @Override
    public float agregarCosto() {
        return extra;
    }

    @Override
    public String tipo() {
        return "Tierra";
    }
}
